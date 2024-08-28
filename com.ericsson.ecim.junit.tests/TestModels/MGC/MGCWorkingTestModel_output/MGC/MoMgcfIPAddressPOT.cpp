InterMo
###UpdateValidate
###0
###CHCK
###		The IP Address Table do not support update, only create and remove
###		LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcfIPAddress-1005-0001: The IP Address Table do not support update, only create and remove");
return false;

######IntraMo
###CreateValidate
###0
###CHCK
###		Local IP Address is not valid according to the Subnet Mask and Network Address.
###		{
  std::string ip = mgcfIpAddress_get();
  std::string netaddr = mgcfIpNetAddress_get();
  std::string mask = mgcfIpSubnetMask_get();
  std::string vlantag = mgcfIpVlanTag_get();
  in_addr_t ip_t = inet_addr(ip.c_str());
  in_addr_t netaddr_t = inet_addr(netaddr.c_str());
  in_addr_t mask_t = inet_addr(mask.c_str());
  mlog.LogBasicFmt(ScslogApi::LOG_DEBUG,"Checked by rule MomgcfIPAddress-1007-0001: Local IP Address[%s], Network Address[%s], Subnet Mask[%s], Vlantag[%s].", 
  ip.c_str(), netaddr.c_str(), mask.c_str(), vlantag.c_str());
  if(ip.empty() || ip == "0.0.0.0" || ip_t == INADDR_NONE) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MomgcfIPAddress-1007-0001: Local IP Address input error,[%s].", ip.c_str());
    return false;
  }
  if(netaddr.empty() || netaddr == "0.0.0.0" || netaddr_t == INADDR_NONE) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MomgcfIPAddress-1007-0001: Net Address input error,[%s].", netaddr.c_str());
    return false;
  }
  if((ip_t & mask_t) != netaddr_t) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MomgcfIPAddress-1007-0001: Local IP Address error.");
    return false;
  }
}

######IntraMo
###RemoveValidate
###0
###CHCK
###		The IP address whose parameter 'VLAN_Tag' is [VLAN_ID] can not be removed when the IP address whose parameter 'VLAN_Tag' is [VLAN_ID:Sub_ID] exists.
###		{
  std::string vlantag = mgcfIpVlanTag_get();
  size_t pos = vlantag.find(":");
  if (pos == string::npos) {
    iter_type niter;
    for ( niter = mtable.begin(); niter != mtable.end(); niter++ ) {
      std::string vlantagold = niter->second.mgcfIpVlanTag_get();
      size_t found;
      found = vlantagold.find(vlantag);
      if ( found != string::npos ) {
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,
          "Remove rejected by rule MoMgcfIPAddress-1009-0001: The IP address whose parameter 'VLAN_Tag' is [%s] can not be removed when the IP address whose parameter 'VLAN_Tag' is [%s] exists",
          vlantag.c_str(), vlantagold.c_str());  
        return false;
      }
    }
  }
}

######InterMo
###RemoveValidate
###0
###CHCK
###		The IP address whose parameter 'VLAN_Tag' is [VLAN_ID] can not be removed when the routing in MGC IP Routing Table whose parameter 'Device Interface' is [VLAN_ID] exists.
###		{
  std::string vlantag  = lmoptr->mgcfIpVlanTag_get();
  //check Ip Routing Table
  MoMgcfIPRouting* lmorouting = (MoMgcfIPRouting*)(getmibvar(eMoMgcfIPRouting));
  if(NULL == lmorouting) {
    LogBasicFmt(ScslogApi::LOG_WARNING, "Delete rejected by rule MoMgcfIPAddress-1006-0002: can not get MoMgcfIPRouting table.");
    return false;
  }
  for (bool record = lmorouting->getfirst(); record; record = lmorouting->getnext()) {
    if(lmorouting->mgcfRoutingInterface_get() == vlantag) {
      LogBasicFmt(ScslogApi::LOG_WARNING,
       "Delete rejected by rule MoMgcfIPAddress-1006-0002: can not delete Local IP whose parameter vlantag[%s] is used by MGCF IP Routing Table.", vlantag.c_str());
      return false;
    }
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		The vlantag should be unique.
###		{
  std::string vlantag = mgcfIpVlanTag_get();
  iter_type niter;
  for ( niter = mtable.begin(); niter != mtable.end(); niter++ ) {
    if(niter != miter) {
      std::string vlantagold = niter->second.mgcfIpVlanTag_get();
      if(vlantag == vlantagold )  {
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MoMgcfIPAddress-1007-0002: same vlantag[%s] exists", vlantag.c_str());
        return false;
      }   
    }
  }
}

######InterMo
###RemoveValidate
###0
###CHCK
###		The local IP address cannot be deleted when it is used by Traffic IP address, Charging IP address,Diameter local IP, H.248 local IP address or M3UA local IP address.
###		{
  std::string ipaddr = lmoptr->mgcfIpAddress_get();
  LogBasicFmt(ScslogApi::LOG_DEBUG,"Checked by rule MoMgcfIPAddress-1006-0001: MGC IP[%s] will be delete.", ipaddr.c_str());
      //check H.248
  MoH248* lmoh248ptr = (MoH248*)(getmibvar(eMoH248));
  if(NULL == lmoh248ptr) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001: can not get MoH248 table.");
    return false;
  }
  if((lmoh248ptr->localSctpIPAddress1_get()==ipaddr)
  || (lmoh248ptr->localSctpIPAddress2_get()==ipaddr)) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001: can not delete Local IP which was used by H248 Local IP Address.");
    return false;
  }                 
   //check M3UA
  MoSs7M3UAItuLocalIPAddress* lmom3uaptr = (MoSs7M3UAItuLocalIPAddress*)(getmibvar(eMoSs7M3UAItuLocalIPAddress));
  if(NULL == lmom3uaptr) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001: can not get MoSs7M3UAItuLocalIPAddress table.");
    return false;
  }
  for (bool record = lmom3uaptr->getfirst(); record; record = lmom3uaptr->getnext()) {
    if((lmom3uaptr->ss7M3UAItuLocalIPAddressLOCALIPADDR_get()==ipaddr)
    || (lmom3uaptr->ss7M3UAItuLocalIPAddressLOCALIPADDR2_get()==ipaddr)) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001: can not delete Local IP which was used by M3UA Local IP Address.");
      return false;
    }
  }  
  //check Diameter
  MoAccountingDiameterGeneralConfiguration* lmoADGCptr = (MoAccountingDiameterGeneralConfiguration*)(getmibvar(eMoAccountingDiameterGeneralConfiguration));
  if(NULL == lmoADGCptr) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001: can not get Diameter table.");
    return false;
  }
  if((lmoADGCptr->acctDiameterLocalIp1_get()==ipaddr)
  || (lmoADGCptr->acctDiameterLocalIp2_get()==ipaddr)) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001: can not delete Local IP which was used by Diameter Local IP Address.");
    return false;
  }
     //check Mgcf
  MoMgcf* lmomgcf = (MoMgcf*)(getmibvar(eMoMgcf));
  if(NULL == lmomgcf) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001: can not get MoMgcf table.");
      return false;                                                                                                     
  } 
  if(lmomgcf->mgcOAMChargingIpAddress_get()==ipaddr) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001:  can not delete Local IP which was used by Charging Ip Address.");
    return false;                                                                                                     
  }
  if(lmomgcf->mgcFullyQualifiedDomainName_get()==ipaddr)  {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule MoMgcfIPAddress-1006-0001:  can not delete Local IP which was used by Traffic IP Address.");
    return false;                                                                                                     
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		The IP address whose parameter 'VLAN_Tag' is [VLAN_ID:Sub_ID] can be created when the IP address exists whose parameter 'VLAN_Tag' is [VLAN_ID].
###		{
  std::string vlantag = mgcfIpVlanTag_get();
  size_t pos = vlantag.find(":");
  if (pos != string::npos) {
    bool found = false;
    std::string vlan = vlantag.substr(0, pos);
    iter_type niter;
    for ( niter = mtable.begin(); niter != mtable.end(); niter++ ) {
      std::string vlantagold = niter->second.mgcfIpVlanTag_get();
      if(vlan == vlantagold )  {
        found = true;
        break;       
      }
    }
    if( found == false ) {
      mlog.LogBasicFmt(ScslogApi::LOG_WARNING,
        "Insert rejected by rule MoMgcfIPAddress-1007-0003: The IP address whose parameter 'VLAN_Tag' is [%s] should be created when the IP address whose parameter 'VLAN_Tag' is [%s] exists",
        vlantag.c_str(), vlan.c_str());  
      return false;
    }
  }
}

######IntraMo
###UpdateValidate
###0
###CHCK
###		The IP Address Table do not support update, only create and remove
###		mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcfIPAddress-1008-0001: The IP Address Table do not support update, only create and remove");
return false;

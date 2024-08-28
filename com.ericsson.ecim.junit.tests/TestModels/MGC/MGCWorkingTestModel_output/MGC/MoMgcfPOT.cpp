IntraMo
###UpdateValidate
###0
###PREL
###		When Charging VLAN Switch is set to true, Charging IP Address, Charging Subnet Mask, Charging Network Address, and Charging Default Gateway must be set.
###		if ( ( mrow.mgcOAMChargingVLANSwitch_get() == true ) and
        ( mrow.mgcOAMChargingIpAddress_get() == "" or mrow.mgcOAMChargingIpAddress_get() == "0.0.0.0" or 
          mrow.mgcOAMChargingSubnetMask_get() == "" or mrow.mgcOAMChargingSubnetMask_get() == "0.0.0.0" or 
          mrow.mgcOAMChargingNetAddress_get() == "" or mrow.mgcOAMChargingNetAddress_get() == "0.0.0.0" or 
          mrow.mgcOAMChargingDefaultGateway_get() == "" or mrow.mgcOAMChargingDefaultGateway_get() == "0.0.0.0" ) ) {
            mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
            return false;       
   }

######IntraMo
###UpdateValidate
###0
###CHCK
###		Primary DNS server's IP address (primaryDnsServerIpAddress) will be defined before start to use DNS.
###		if ( ( mrow.primaryDnsServerIpAddress_get()=="" ) &&
            ( mrow.dnsServerAddressRead_get()==1 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( primaryDnsServerIpAddress.new ==  '' ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( dnsServerAddressRead.new == 1 )",task.c_str());
        return false;
      }

######IntraMo
###UpdateValidate
###0
###CHCK
###		Secondary DNS Server's IP address will be defined before start to use DNS. If only one DNS used, then address could be the same as Primary DNS Server IP address.
###		if ( ( mrow.secondaryDnsServerIpAddress_get()=="" ) &&
            ( mrow.dnsServerAddressRead_get()==1 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( secondaryDnsServerIpAddress.new ==  '' ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( dnsServerAddressRead.new == 1 )",task.c_str());
        return false;
      }

######InterMo
###UpdateValidate
###0
###CHCK
###		Traffic IP and Charging IP must be defined in the MGC IP Address Table.
###		{
  bool ip1Found = false;
  bool ip2Found = false;
  MoMgcfIPAddress* ltmp = (MoMgcfIPAddress*)(getmibvar(eMoMgcfIPAddress));
  if(ltmp) {
    std::string ipAdd1 = lmoptr->mgcFullyQualifiedDomainName_get();
    std::string ipAdd2 = lmoptr->mgcOAMChargingIpAddress_get();
    if(ipAdd1.empty() || ipAdd1 == "0.0.0.0") {
      ip1Found = true;
    }
    if(ipAdd2.empty() || ipAdd2 == "0.0.0.0") {
      ip2Found = true;
    }
    if(!(ip1Found && ip2Found)) {
      for (bool record = ltmp->getfirst(); record; record = ltmp->getnext()) {
        std::string sctpIp = ltmp->mgcfIpAddress_get();
        if(sctpIp == ipAdd1) {
          ip1Found = true;
        }
        if(sctpIp == ipAdd2) {
          ip2Found = true;
        }
      }
    }
    if(!ip1Found) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MoMgcf-1005-0003: Traffic IP is not in MGC Local IP list.");
      return false;
    }
    if(!ip2Found) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MoMgcf-1005-0003: Charging IP is not in MGC Local IP list.");
      return false;
    }
  }
  else {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MoMgcf-1005-0003: can not get MGC Local IP list.");
    return false;
  }
}

######IntraMo
###UpdateValidate
###0
###CHCK
###		MGC graceful locking can not be initiated if the MGC Administrative State is LOCKED or SHUTTING DOWN.
###		if ( ( mrow.mgcAction_get()==eGracefulLocking ) &&
            ( mrow.mgcAdministrativeState_get()!=eUnlocked )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAction.new == eGracefulLocking ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAdministrativeState.new != eUnlocked )",task.c_str());
        return false;
      }

######IntraMo
###UpdateValidate
###0
###CHCK
###		MGC forced locking can not be initiated if the MGC Administrative State is LOCKED.
###		if ( ( mrow.mgcAction_get()==eForcedLocking ) &&
            ( mrow.mgcAdministrativeState_get()==eLocked )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAction.new == eForcedLocking ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAdministrativeState.new == eLocked )",task.c_str());
        return false;
      }

######IntraMo
###UpdateValidate
###0
###PREL
###		27.10.2006
CHANGED TO PREL, REPLACED WITH MoMgcf-1002-0008


MGC forced locking can not be initiated if the MGC administrative state is LOCKED.
###		if ( ( mrow.mgcAction_get()==eForcedLocking ) &&
            ( mrow.mgcAdministrativeState_get()==3 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAction.new == eForcedLocking ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAdministrativeState.new == 3 )",task.c_str());
        return false;
      }

######InterMo
###UpdateValidate
###0
###PREL
###		The change of Traffic Network Subnet Mask and Traffic Network Address fails because it will cause the SCTP local IP address to be invalid.
###		{
	MoSs7SctpLayerLocalIPAddress* lmosctpptr = (MoSs7SctpLayerLocalIPAddress*)(getmibvar(eMoSs7SctpLayerLocalIPAddress));
	if(NULL == lmosctpptr) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MoMgcf-1005-0001: can not get MoSs7SctpLayerLocalIPAddress.");
    return false;
	}
  std::string mask = lmoptr->mgcTrafficalSubnetMask_get();
  std::string netaddr = lmoptr->mgcTrafficalNetAddress_get();
  in_addr_t mask_t = inet_addr(mask.c_str());
  in_addr_t netaddr_t = inet_addr(netaddr.c_str());
  for(bool record = lmosctpptr->getfirst(); record; record = lmosctpptr->getnext()) {
    std::string ip = lmosctpptr->ss7SctpLayerLocalIPAddress_get();
    //std::string gateway = lmosctpptr->ss7SctpLayerLocalIPAddressGateway_get();
    in_addr_t ip_t = inet_addr(ip.c_str());
    //in_addr_t gateway_t = inet_addr(gateway.c_str());
    if((ip_t & mask_t) != netaddr_t) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcf-1005-0001: Can not change Traffical Network Subnet Mask and Traffical Network Address bucause It will cause the SCTP Local IP Address be invalid.");
      return false;
    }
    //if((gateway_t & mask_t) != netaddr_t) {
    //  LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcf-1005-0001: Can not change Traffical Network Subnet Mask and Traffical Network Address bucause It will cause the SCTP Local IP Address Gateway be invalid.");
    //  return false;
    //}
  }
}

######IntraMo
###UpdateValidate
###0
###PREL
###		27.10.2006
CHANGED TO PREL, REPLACED WITH MoMgcf-1002-0009


MGC graceful locking can not be initiated if the MGC administrative state is LOCKED.
###		if ( ( mrow.mgcAction_get()==eGracefulLocking ) &&
            ( mrow.mgcAdministrativeState_get()!=1 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAction.new ==  eGracefulLocking ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAdministrativeState.new != 1  )",task.c_str());
        return false;
      }

######IntraMo
###UpdateValidate
###0
###PREL
###		27.10.2006
CHANGED TO PREL, REPLACED WITH MoMgcf-1002-0007



MGC cannot be run if mgcFullyQualifiedDomainName is empty. It will be defined in locked state.
###		if ( ( mrow.mgcFullyQualifiedDomainName_get()=="" ) &&
            ( mrow.mgcAdministrativeState_get()!=3 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcFullyQualifiedDomainName.new == '' ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAdministrativeState.new != 3 )",task.c_str());
        return false;
      }

######IntraMo
###UpdateValidate
###0
###CHCK
###		MGC cannot be run if MGC Traffical IP Address is empty. It will be defined in when MGC Administrative State is LOCKED.
###		if ( ( mrow.mgcFullyQualifiedDomainName_get()=="" ) &&
            ( mrow.mgcAdministrativeState_get()!=eLocked )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcFullyQualifiedDomainName.new == '' ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( mgcAdministrativeState.new != eLocked )",task.c_str());
        return false;
      }

######InterMo
###UpdateValidate
###0
###CHCK
###		H.248 local IP address and M3UA local IP address must be valid before the MGC restart.
###		if(lmoptr->mgcAction_get() == MoMgcf::eRestarting
|| lmoptr->mgcAction_get() == MoMgcf::eSaveSS7ConfigAndRestart) {
  MoH248* lmoh248ptr = (MoH248*)(getmibvar(eMoH248));
  if(NULL == lmoh248ptr) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcf-1005-0002: can not get MoH248.");
    return false;
  }
  std::string ip1, ip2;
  ip1 = lmoh248ptr->localSctpIPAddress1_get();
  ip2 = lmoh248ptr->localSctpIPAddress2_get();
  bool valid1 = false, valid2 = false;
  if(!ip1.empty() && ip1 != "0.0.0.0") {
    valid1 = true;
  }
  if(!ip2.empty() && ip2 != "0.0.0.0") {
    valid2 = true;
  }
  if(!(valid1 || valid2)) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcf-1005-0002: H.248 Local IP Address is invalid.");
    return false;
  }
  MoSs7M3UAItuLocalIPAddress* lmom3uaptr = (MoSs7M3UAItuLocalIPAddress*)(getmibvar(eMoSs7M3UAItuLocalIPAddress));
  if(NULL == lmom3uaptr) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcf-1005-0002: can not get MoSs7M3UAItuLocalIPAddress.");
    return false;
  }
  for(bool record = lmom3uaptr->getfirst(); record; record = lmom3uaptr->getnext()) {
    ip1 = lmom3uaptr->ss7M3UAItuLocalIPAddressLOCALIPADDR_get();
    ip2 = lmom3uaptr->ss7M3UAItuLocalIPAddressLOCALIPADDR2_get();
    valid1 = false;
    valid2 = false;
    if(!ip1.empty() && ip1 != "0.0.0.0") {
      valid1 = true;
    }
    if(!ip2.empty() && ip2 != "0.0.0.0") {
      valid2 = true;
    }
    if(!(valid1 || valid2)) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcf-1005-0002: M3UA Local IP Address is invalid.");
      return false;
    }
  }
}

InterMo
###UpdateValidate
###0
###CHCK
###		The IP Routing Table do not support update, only create and remove
###		LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcfIPRouting-1005-0001: The IP Routing Table do not support update, only create and remove");
return false;

######IntraMo
###UpdateValidate
###0
###CHCK
###		The IP Routing Table do not support update, only create and remove
###		mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoMgcfIPRouting-1008-0001: The IP Routing Table do not support update, only create and remove");
return false;

######InterMo
###CreateValidate
###0
###CHCK
###		The interface should be defined in the MoMgcfIpAddress.
###		{
  std::string iface = lmoptr->mgcfRoutingInterface_get();
  bool flag = false;
  MoMgcfIPAddress* ltmp = (MoMgcfIPAddress *)(getmibvar(eMoMgcfIPAddress));
  for (bool record = ltmp->getfirst(); record; record = ltmp->getnext()) {
    std::string vlantag = ltmp->mgcfIpVlanTag_get();
    if(iface == vlantag) {
      flag = true;
      break;
    }
  }
  if(flag == false){
    LogBasicFmt(ScslogApi::LOG_WARNING,"Create rejected by rule MoMgcfIPRouting-1004-0001: can not create ip routing whose interface don't exist in the MoMgcfIpAddress Table.");
    return false;                                                                                                     
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		If mgcfRoutingDestination and(bit operator) mgcfRoutingNetworkMask are the same as an existing one, the creation shall be rejected.
###		{
  std::string dst = mgcfRoutingDestination_get();
  std::string mask = mgcfRoutingNetworkMask_get();
  std::string nexthop = mgcfRoutingNextHop_get();
  std::string iface = mgcfRoutingInterface_get();
  in_addr_t dst_t = inet_addr(dst.c_str());
  in_addr_t mask_t = inet_addr(mask.c_str());
  iter_type niter;
  for ( niter = mtable.begin(); niter != mtable.end(); niter++ ) {
    if(niter != miter) {
      in_addr_t olddst_t = inet_addr(niter->second.mgcfRoutingDestination_get().c_str());
      in_addr_t oldmask_t = inet_addr(niter->second.mgcfRoutingNetworkMask_get().c_str());
      std::string oldiface = niter->second.mgcfRoutingInterface_get();
      if((dst_t & mask_t ) == (olddst_t & oldmask_t)) {
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Insert rejected by rule MoMgcfIPRoutingPOT-1007-0001: same routing exists.");
        return false;
      }
    }
  }
}

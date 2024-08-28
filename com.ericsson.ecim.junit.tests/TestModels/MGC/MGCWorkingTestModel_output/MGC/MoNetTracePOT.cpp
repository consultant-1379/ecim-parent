IntraMo
###UpdateValidate
###0
###CHCK
###		Signaling Trace Session could not be update.
###		{
  if(netTraceAction_get() == eReady) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1008-0001: Signaling Trace Session could not be update.");
    return false;
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		NetTrace Depth could not be UNKNOWN.
###		{
  if(MoNetTrace::eTraceDepthUnknown == netTraceDepth_get()) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0006: netTraceDepth could not be UNKNOWN.");
    return false;
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		The Net Trace Status should always be eTracing when activate a Trace Session.
###		{
  if(MoNetTrace::eTracing != netTraceStatus_get()) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0004: The Net Trace Status should always be eTracing when activate a Trace Session.");
    return false;
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		Unavailable Trace Reference.
###		{
  std::string ref = netTraceReference_get();
  if(ref.length() < 10 or ref.length()>12) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0002: Trace Reference length error.");
    return false;
  }
  std::string mcc = ref.substr(0, 3);
  std::string mnc = ref.substr(3, ref.length() - 9);
  std::string tid = ref.substr(ref.length() - 6, 6);
  if(mcc.find_first_not_of("0123456789") != std::string::npos) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0002: Trace Reference MCC error.");
    return false;
  }
  if(mnc.find_first_not_of("0123456789") != std::string::npos) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0002: Trace Reference MNC error.");
    return false;
  }
  if(tid.find_first_not_of("0123456789ABCDEF") != std::string::npos) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0002: Trace Reference Trace ID error.");
    return false;
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		OriginatingUserID and TerminatingUserID should be International Number.
###		{
  std::string a = netTraceOriginatingUserID_get();
  std::string b = netTraceTerminatingUserID_get();
  if((!a.empty()) && (a[0] != '+')) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0005: OriginatingUserID should be International Number.");
    return false;
  }
  if((!b.empty()) && (b[0] != '+')) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0005: TerminatingUserID should be International Number.");
    return false;
  }
}

######IntraMo
###CreateValidate
###0
###CHCK
###		OriginatingUserID and TerminatingUserID could not be both empty.
###		{
  std::string a = netTraceOriginatingUserID_get();
  std::string b = netTraceTerminatingUserID_get();
  if(a.empty() && b.empty()) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0003: OriginatingUserID and TerminatingUserID could not be both empty.");
    return false;
  }
}

######InterMo
###CreateValidate
###0
###CHCK
###		Can not set same Originating User ID and Terminating User ID for different Trace Records.
###		{
  MoNetTrace::key_type key = lmoptr->netTraceReference_get();
  std::string oId = lmoptr->netTraceOriginatingUserID_get();
  std::string tId = lmoptr->netTraceTerminatingUserID_get();
  for (bool record = lmoptr->getfirst(); record; record = lmoptr->getnext()) {
    if(key == lmoptr->netTraceReference_get()) continue;
    if(oId == lmoptr->netTraceOriginatingUserID_get() && tId == lmoptr->netTraceTerminatingUserID_get()) {
      LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1004-0002: Can not set same Originating User ID and Terminating User ID for different Trace Records.");
      lmoptr->getrecord(key);
      return false;
    }
  }
  lmoptr->getrecord(key);
}

######IntraMo
###CreateValidate
###0
###CHCK
###		Unavailable Trace Collection Entity Address: could not be 0.0.0.0 or 255.255.255.255 or empty.
###		{
  std::string ipAddr = netTraceCollectionEntityAddress_get();
  if(ipAddr.empty() || ipAddr == "0.0.0.0" || ipAddr == "255.255.255.255") {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1007-0001: unavailable Trace Collection Entity Address.");
    return false;
  }
}

######IntraMo
###RemoveValidate
###0
###CHCK
###		Signaling Trace Session could not be deleted. Deactivate the session and MGC will delete it automatically.
###		{
  mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoNetTrace-1009-0001: Signaling Trace Session could not be deleted. Deactivate the session and MGC will delete it automatically.");
  return false;
}

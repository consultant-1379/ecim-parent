IntraMo
###CreateValidate
###0
###CHCK
###		OriginatingUserID and TerminatingUserID could not be both empty.
###		{
  std::string a = callTraceOriginatingUserID_get();
  std::string b = callTraceTerminatingUserID_get();
  if(a.empty() && b.empty()) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoMgcfTrace-1007-0001: OriginatingUserID and TerminatingUserID could not be both empty.");
    return false;
  }
}

######IntraMo
###UpdateValidate
###0
###CHCK
###		Internal Trace Rule could not be update.
###		{
mlog.LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoMgcfTrace-1008-0001: Internal Trace Rule could not be update.");
    return false;
}

######InterMo
###CreateValidate
###0
###CHCK
###		Can not set same Originating User ID and Terminating User ID for different Trace Records.
###		{
  MoMgcfTrace::key_type key = lmoptr->callTraceReference_get();
  std::string oId = lmoptr->callTraceOriginatingUserID_get();
  std::string tId = lmoptr->callTraceTerminatingUserID_get();
  for (bool record = lmoptr->getfirst(); record; record = lmoptr->getnext()) {
    if(key == lmoptr->callTraceReference_get()) continue;
    if(oId == lmoptr->callTraceOriginatingUserID_get() && tId == lmoptr->callTraceTerminatingUserID_get()) {
      LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoMgcfTrace-1004-0001: Can not set same Originating User ID and Terminating User ID for different Trace Records.");
      lmoptr->getrecord(key);
      return false;
    }
  }
  lmoptr->getrecord(key);
}

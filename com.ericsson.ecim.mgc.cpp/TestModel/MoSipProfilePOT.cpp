IntraMo  
###CreateValidate
###4
###CHCK
###H263v2 or v3 codec is accepted only if older versions are also allowed.

###{
unsigned int codecs = miter->second.sipProfileCodecsForInviteWithoutSDPOfMultimediaCall_get();
              
if ((codecs & 2097152) != 0) {
  if ((codecs & (8388608+4194304)) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v3 codec allowed, but v1 and v2 not.");
    return false;
  } else if ((codecs & 4194304) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v3 codec allowed, but v2 not.");   
    return false;
  } else if ((codecs & 8388608) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v3 codec allowed, but v1 not.");    
    return false;
  } 
} else if ((codecs & 4194304) != 0) {
  if ((codecs & 8388608) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v2 codec allowed, but v1 not.");
    return false;
  } 
}
}
######IntraMo
###CreateValidate
###6
###CHCK
###The value of Msg ID(Status Code) For No Common Codec must be 0 or a value between 400 and 699.

###{
if (!(miter->second.sipProfileMsgIdForNoCommonCodec_get()==0 || (miter->second.sipProfileMsgIdForNoCommonCodec_get()>=400 && miter->second.sipProfileMsgIdForNoCommonCodec_get()<=699)))
  {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
    return false;
  }
}

######InterMo
###RemoveValidate
###2
###CHCK
###SIP Profile cannot be removed, it is still referenced from B-Number Analysis table.

###{            
  MoBNumberAnalysis* lmobnumanalptr = (MoBNumberAnalysis* )(getmibvar(eMoBNumberAnalysis));
  if (lmobnumanalptr ) {
    for (bool record = lmobnumanalptr ->getfirst(false); record; record = lmobnumanalptr ->getnext(false)) {
      if (lmoptr->sipProfileName_get() == lmobnumanalptr ->bNumberAnalysisProfile_get() && lmobnumanalptr->rowstatus_get() != MoBaseWrapper::notReady) {
        LogBasicFmt(ScslogApi::LOG_WARNING, "Validation rejected by rule MoSipProfile-1006-0002.");
        return false;
      }
    }
  }
}

######InterMo
###RemoveValidate
###3
###CHCK
###It is not allowed to remove the SIP Profile, which is used as Default Incoming Profile Name in SIP Stack table.

###MoSip* lmodepptr = (MoSip*)(getmibvar(eMoSip));
              
if (lmodepptr) {
  if (lmodepptr->sipDefaultIncommingProfileName_get() == lmoptr->sipProfileName_get()) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule: MoSipProfile-1006-0003.");
    return false;
  }
  if (lmodepptr->sipDefaultIncomingProfileNameNetwork2_get() == lmoptr->sipProfileName_get()) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule: MoSipProfile-1006-0003.");
    return false;
  }
}
######InterMo
###RemoveValidate
###1
###CHCK
###SIP Profile cannot be removed, it is still used in Video Codec Profiles table.

###MoVideoCodecProfile* lmodepptr = (MoVideoCodecProfile*)(getmibvar(eMoVideoCodecProfile));
              
if (lmodepptr) {
  for (bool record = lmodepptr->getfirst(); record; record = lmodepptr->getnext()) {
    if (lmodepptr->videoCodecServiceProfileName_get() == lmoptr->sipProfileName_get()) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule: MoSipProfile-1006-0001.");
      return false;
    }
  }
}
######InterMo
###RemoveValidate
###6
###CHCK
###It is not allowed to remove the SIP Profile, which is used as Incoming Multi-Media Call Profile Name in SIP Stack table.

###MoSip* lmodepptr = (MoSip*)(getmibvar(eMoSip));
if (lmodepptr) {
  if (lmodepptr->sipMMCallIncommingProfileName_get() == lmoptr->sipProfileName_get()) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule: MoSipProfile-1006-0006.");
    return false;
  }
  if (lmodepptr->sipMMCallIncomingProfileNameNetwork2_get() == lmoptr->sipProfileName_get()) {
    LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule: MoSipProfile-1006-0006.");
    return false;
  }
}

######InterMo
###RemoveValidate
###7
###CHCK
###SIP Profile cannot be removed, it is still referenced from H263Attributes table.

###{            
  MoH263Attributes * lmoH263Attributes = (MoH263Attributes * )(getmibvar(eMoH263Attributes));
  if (lmoH263Attributes ) {
    for (bool record = lmoH263Attributes->getfirst(); record; record = lmoH263Attributes->getnext()) {
      if (lmoptr->sipProfileName_get() == lmoH263Attributes->sipProfileName_get()) {
        LogBasicFmt(ScslogApi::LOG_WARNING, "Validation rejected by rule MoSipProfile-1006-0006.");
        return false;
      }
    }
  }
}

######InterMo
###RemoveValidate
###4
###CHCK
###SIP Profile cannot be removed, it is still referenced from Sip Codec Priority table.

###MoSipCodecPriority* lmodepptr = (MoSipCodecPriority*)(getmibvar(eMoSipCodecPriority));
              
if (lmodepptr) {
  for (bool record = lmodepptr->getfirst(); record; record = lmodepptr->getnext()) {
    if (lmodepptr->sipProfileName_get() == lmoptr->sipProfileName_get()) {
      LogBasicFmt(ScslogApi::LOG_WARNING,"Delete rejected by rule: MoSipProfile-1006-0004.");
      return false;
    }
  }
}
######InterMo
###RemoveValidate
###5
###CHCK
###SIP Profile cannot be removed, it is still referenced from MoIP Fax table.

###{            
  MoMoIPFax* lmomoipfax = (MoMoIPFax* )(getmibvar(eMoMoIPFax));
            
  if (lmomoipfax ) {
    for (bool record = lmomoipfax ->getfirst(); record; record = lmomoipfax ->getnext()) {
      if (lmoptr->sipProfileName_get() == lmomoipfax ->mgcMoIPFaxSipProfile_get()) {
        LogBasicFmt(ScslogApi::LOG_WARNING, "Validation rejected by rule MoSipProfile-1006-0005.");
        return false;
      }
    }
  }
}
######InterMo
###UpdateValidate
###4
###CHCK
###If MGC is based on ANSI ISUP, this attribute will be available; else this attribute should only be Not Get DisplayName.

###MoMgcf* lmoMgcfptr = (MoMgcf*)(getmibvar(eMoMgcf));

if (lmoMgcfptr) {
  if (lmoMgcfptr->isupType_get() != MoMgcf::eANSI)
  {
    if(lmoptr->sipProfileGetDisplayName_get()!= MoSipProfile::eNoGet )
    { 
      LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoSipProfile-1005-0004:");
      return false;
    }
  }
}
else {
  LogBasicFmt(ScslogApi::LOG_WARNING,"MoSipProfile:Cannot initialize pointer for Inter MO Update. No MoMgcf");   
  return false;
}
######InterMo
###UpdateValidate
###1
###CHCK
###If Use Outbound Server is removed, B-Number Analysis should not find any record with Two Stage Dialling set.

###{            
if (lmoptr->sipProfileUseOutboundServer_get() == false) {
  bool matchFound = false;
  std::string profile = lmoptr->sipProfileName_get();
  MoBNumberAnalysis* lmobnumanalptr = (MoBNumberAnalysis* )(getmibvar(eMoBNumberAnalysis));
  if (lmobnumanalptr) {
    for (bool record = lmobnumanalptr->getfirst(false); record; record = lmobnumanalptr->getnext(false)) {
      if (lmobnumanalptr->bNumberAnalysisTwoStageDialling_get() > 1 && lmobnumanalptr->rowstatus_get() != MoBaseWrapper::notReady) {
        if (profile==lmobnumanalptr->bNumberAnalysisProfile_get()) {
          matchFound = true;
          break;
        }
      }
    }
  }
  if (matchFound) {
    LogBasicFmt(ScslogApi::LOG_WARNING, "Validation rejected by rule MoSipProfile-1005-0001.");
    return false;
  }
}
}

######IntraMo
###CreateValidate
###5
###CHCK
###At least one video codec must be selected when the How To Treat Invite Without SDP parameter is set to eTreatAsMultimediaCall.

###
{
    if (miter->second.sipProfileHowToTreatInviteWithoutSDP_get() == 1){//select eTreatAsMultimediaCall
      unsigned int codecs = miter->second.sipProfileCodecsForInviteWithoutSDPOfMultimediaCall_get();
      if ((codecs & (16777216+8388608+4194304+2097152+1048576)) == 0) {
          mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0004. must select one video codec while you have selected eTreatAsMultimediaCall.");
          return false;
      }
    }
}

######InterMo
###UpdateValidate
###3
###CHCK
###If MGC is based on ANSI ISUP, this attribute will be available; else this attribute should only be Not Set DisplayName.

###MoMgcf* lmoMgcfptr = (MoMgcf*)(getmibvar(eMoMgcf));

if (lmoMgcfptr) {
  if (lmoMgcfptr->isupType_get() != MoMgcf::eANSI)
  {
    if( lmoptr->sipProfileSetDisplayName_get()!= MoSipProfile::eNoSet )
    { 
      LogBasicFmt(ScslogApi::LOG_WARNING,"Update rejected by rule MoSipProfile-1005-0003:");
      return false;
    }
  }
}
else {
  LogBasicFmt(ScslogApi::LOG_WARNING,"MoSipProfile:Cannot initialize pointer for Inter MO Update. No MoMgcf");   
  return false;
}
######InterMo
###UpdateValidate
###2
###PREL
###27.10.2006
CHANGED TO PREL BECAUSE OF TROUBLE REPORT HH44412.
It is not allowed to change the OriginBnumber to the value, which do not match to a record in MoBNumberPreAnalysis.

###{            
  bool matchFound = false;
  unsigned int origin = lmoptr->sipProfileOriginBnumber_get();
  MoBNumberPreAnalysis* lmobnumpreanalptr = (MoBNumberPreAnalysis* )(getmibvar(eMoBNumberPreAnalysis));
  if (lmobnumpreanalptr ) {
    for (bool record = lmobnumpreanalptr ->getfirst(); record; record = lmobnumpreanalptr ->getnext()) {
      if (origin == lmobnumpreanalptr ->bNumberPreAnalysisOrigin_get() && lmobnumpreanalptr->bNumberPreAnalysisDataStatus_get() == MoBNumberPreAnalysis::eActive) {
          matchFound = true;
          break;
      }
    }
  }
  if (!matchFound) {
    LogBasicFmt(ScslogApi::LOG_WARNING, "Validation rejected by rule MoSipProfile-1005-0002.");
    return false;
  }
}

######InterMo
###UpdateValidate
###5
###CHCK
###The value of "SIP Response Code Mapping Table ID" must be defined in Sip Response Code Map table.

###if(!lmoptr->sipRespCodeMapId_get().empty()){
bool referenceFound = false;
MoSipRespCodeMapTable* lmosipcodeptr =
   (MoSipRespCodeMapTable*)(getmibvar(eMoSipRespCodeMapTable));
if (lmosipcodeptr)
{
   for (bool record = lmosipcodeptr->getfirst(); record; record = lmosipcodeptr->getnext())
   {
      if(lmosipcodeptr->sipRespCodeMapIndex_get() == lmoptr->sipRespCodeMapId_get())
      {
          // Check for the existence of sipRespCodeMapId record
          referenceFound = true;
          break;
      }
   }
   if (!referenceFound)
   {
      LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoSipProfile-1005-0005.");
      return false;
   }
}else{
    LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoSipProfile-1005-0005.");
    return false;
}
}

######IntraMo
###CreateValidate
###1
###CHCK
###The A-Number Usage indicates to use Default IP Side A-Number, but it is empty.

###      if ( ( miter->second.sipProfileDefaultIpSideAnumber_get()=="" ) &&
            ( miter->second.sipProfileDefaultIpSideAnumberUsage_get()!=3 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s record[%d] rejected by rule %s:",task.c_str(),index_get(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( sipProfileDefaultIpSideAnumber ==  '' ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( sipProfileDefaultIpSideAnumberUsage != 3 )",task.c_str());
        return false;
      }


######IntraMo
###CreateValidate
###2
###CHCK
###H263v2 or v3 codec is accepted only if older versions are also allowed.

###{
unsigned int codecs = miter->second.sipProfileCodecs_get();
              
if ((codecs & 2097152) != 0) {
  if ((codecs & (8388608+4194304)) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v3 codec allowed, but v1 and v2 not.");
    return false;
  } else if ((codecs & 4194304) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v3 codec allowed, but v2 not.");   
    return false;
  } else if ((codecs & 8388608) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v3 codec allowed, but v1 not.");    
    return false;
  } 
} else if ((codecs & 4194304) != 0) {
  if ((codecs & 8388608) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1007-0001. H263v2 codec allowed, but v1 not.");
    return false;
  } 
}
}
######IntraMo
###CreateValidate
###3
###CHCK
###If handle incoming initial INVITE without SDP as multimedia call, the parameter "Codecs For Invite Without SDP for Multimedia Call" must be set.

###{
if (miter->second.sipProfileHowToTreatInviteWithoutSDP_get()==1&&miter->second.sipProfileCodecsForInviteWithoutSDPOfMultimediaCall_get()==0)
  {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"If Handle incoming initial INVITE without SDP as multimedia call, Codecs For Invite Without SDP for Multimedia Call must be set");
    return false;
  }
}

######InterMo
###CreateValidate
###4
###CHCK
###The value of "SIP Response Code Mapping Table ID" must be defined in Sip Response Code Map table.

###if(!lmoptr->sipRespCodeMapId_get().empty()){
bool referenceFound = false;
MoSipRespCodeMapTable* lmosipcodeptr =
   (MoSipRespCodeMapTable*)(getmibvar(eMoSipRespCodeMapTable));
if (lmosipcodeptr)
{
   for (bool record = lmosipcodeptr->getfirst(); record; record = lmosipcodeptr->getnext())
   {
      if(lmosipcodeptr->sipRespCodeMapIndex_get() == lmoptr->sipRespCodeMapId_get())
      {
          // Check for the existence of sipRespCodeMapId record
          referenceFound = true;
          break;
      }
   }
   if (!referenceFound)
   {
      LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoSipProfile-1004-0004.");
      return false;
   }
}else{
    LogBasicFmt(ScslogApi::LOG_WARNING, "Validate rejected by rule: MoSipProfile-1004-0004.");
    return false;
}
}

######InterMo
###CreateValidate
###2
###CHCK
###If MGC is based on ANSI ISUP, Set DisplayName will be available; else it should only be set to 'Not Set DisplayName'.

###MoMgcf* lmoMgcfptr = (MoMgcf*)(getmibvar(eMoMgcf));

if (lmoMgcfptr) {
  if (lmoMgcfptr->isupType_get() != MoMgcf::eANSI)
  {
    if(lmoptr->sipProfileSetDisplayName_get()!= MoSipProfile::eNoSet)
    { 
      LogBasicFmt(ScslogApi::LOG_WARNING,"Create rejected by rule MoSipProfile-1004-0002:");
      return false;
    }
  }
}
else {
  LogBasicFmt(ScslogApi::LOG_WARNING,"MoSipProfile:Cannot initialize pointer for Inter MO Create. No MoMgcf");   
  return false;
}
######InterMo
###CreateValidate
###3
###CHCK
###If MGC is based on ANSI ISUP, Get DisplayName will be available; else it should only be set to 'Not Get DisplayName'.

###MoMgcf* lmoMgcfptr = (MoMgcf*)(getmibvar(eMoMgcf));

if (lmoMgcfptr) {
  if (lmoMgcfptr->isupType_get() != MoMgcf::eANSI)
  {
    if(lmoptr->sipProfileGetDisplayName_get()!= MoSipProfile::eNoGet )
    { 
      LogBasicFmt(ScslogApi::LOG_WARNING,"Create rejected by rule MoSipProfile-1004-0003:");
      return false;
    }
  }
}
else {
  LogBasicFmt(ScslogApi::LOG_WARNING,"MoSipProfile:Cannot initialize pointer for Inter MO Create. No MoMgcf");   
  return false;
}
######InterMo
###CreateValidate
###1
###CHCK
###SIP profile and RTSP Profile can not have the same name.

###MoRtspProfile* lmodepptr = (MoRtspProfile*)(getmibvar(eMoRtspProfile));
MoRtspProfile::key_type key = lmoptr->sipProfileName_get();              

if (lmodepptr) {
  if (lmodepptr->getrecord(key)) { 
    LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1004-0001. Profile name=%sused in MoSipProfile.", key.c_str());
    return false;
  }
} else {
  LogBasicFmt(ScslogApi::LOG_WARNING,"Validation failed on rule: MoSipProfile-1004-0001. Could not access MoRtspProfile=%s.", key.c_str());
  return false;
}
######IntraMo
###UpdateValidate
###6
###CHCK
###The value of Msg ID(Status Code) For No Common Codec must be 0 or a value between 400 and 699.

###
{
if (!(miter->second.sipProfileMsgIdForNoCommonCodec_get()==0 || (miter->second.sipProfileMsgIdForNoCommonCodec_get()>=400 && miter->second.sipProfileMsgIdForNoCommonCodec_get()<=699)))
  {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
    return false;
  }
}

######IntraMo
###UpdateValidate
###5
###CHCK
###At least one video codec must be selected when the How To Treat Invite Without SDP parameter is set to eTreatAsMultimediaCall.

###
{
    if (miter->second.sipProfileHowToTreatInviteWithoutSDP_get() == 1){//select eTreatAsMultimediaCall
      unsigned int codecs = miter->second.sipProfileCodecsForInviteWithoutSDPOfMultimediaCall_get();
      if ((codecs & (16777216+8388608+4194304+2097152+1048576)) == 0) {
          mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0004. must select one video codec while you have selected eTreatAsMultimediaCall.");
          return false;
      }
    }
}

######IntraMo
###UpdateValidate
###4
###CHCK
###H263v2 or v3 codec is accepted only if older versions are also allowed.

###{
unsigned int codecs = miter->second.sipProfileCodecsForInviteWithoutSDPOfMultimediaCall_get();
              
if ((codecs & 2097152) != 0) {
  if ((codecs & (8388608+4194304)) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v3 codec allowed, but v1 and v2 not.");
    return false;
  } else if ((codecs & 4194304) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v3 codec allowed, but v2 not.");   
    return false;
  } else if ((codecs & 8388608) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v3 codec allowed, but v1 not.");    
    return false;
  } 
} else if ((codecs & 4194304) != 0) {
  if ((codecs & 8388608) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v2 codec allowed, but v1 not.");
    return false;
  } 
}
}
######IntraMo
###UpdateValidate
###3
###CHCK
###If handle incoming initial INVITE without SDP as multimedia call, the parameter "Codecs For Invite Without SDP for Multimedia Call" must be set.

###{
if (miter->second.sipProfileHowToTreatInviteWithoutSDP_get()==1&&miter->second.sipProfileCodecsForInviteWithoutSDPOfMultimediaCall_get()==0)
  {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"If Handle incoming initial INVITE without SDP as multimedia call, Codecs For Invite Without SDP for Multimedia Call must be set");
    return false;
  }
}
######IntraMo
###UpdateValidate
###2
###CHCK
###H263v2 or v3 codec is accepted only if older versions are also allowed.

###{
unsigned int codecs = miter->second.sipProfileCodecs_get();
              
if ((codecs & 2097152) != 0) {
  if ((codecs & (8388608+4194304)) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v3 codec allowed, but v1 and v2 not.");
    return false;
  } else if ((codecs & 4194304) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v3 codec allowed, but v2 not.");   
    return false;
  } else if ((codecs & 8388608) == 0) {
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v3 codec allowed, but v1 not.");    
    return false;
  } 
} else if ((codecs & 4194304) != 0) {
  if ((codecs & 8388608) == 0) { 
    mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"Validate rejected by rule: MoSipProfile-1008-0001. H263v2 codec allowed, but v1 not.");
    return false;
  } 
}
}
######IntraMo
###UpdateValidate
###1
###CHCK
###The A-Number Usage indicates to use Default IP Side A-Number, but it is empty.

###      if ( ( miter->second.sipProfileDefaultIpSideAnumber_get()=="" ) &&
            ( miter->second.sipProfileDefaultIpSideAnumberUsage_get()!=3 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s record[%d] rejected by rule %s:",task.c_str(),index_get(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( sipProfileDefaultIpSideAnumber ==  '' ) AND",task.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( sipProfileDefaultIpSideAnumberUsage != 3 )",task.c_str());
        return false;
      }


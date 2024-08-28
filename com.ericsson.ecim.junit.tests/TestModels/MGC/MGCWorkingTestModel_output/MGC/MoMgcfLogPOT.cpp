InterMo
###UpdateValidate
###0
###CHCK
###		Log Level can't be updated to Debug when cpu load is high. This business rule should be put in intra Mo, however, it's not allowed to call the necessary function within SNMP, so inter Mo is used here.
###		MoMgcfLog::Data ltmpdata = lmoptr->getnewrecord();
    if( ltmpdata.logLevelForModule_get() == MoMgcfLog::eDebug && !canLogLevelReset() )
	return false;

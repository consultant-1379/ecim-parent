IntraMo
###UpdateValidate
###0
###APPR
###		Max Accepted Capacity Requests must be defined with a greater value than  
Min Accepted Capacity Requests.
###		if ( ( mrow.lcMaxAcceptedCapacityRequests_get()<= mrow.lcMinAcceptedCapacityRequests_get() )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( lcMaxAcceptedCapacityRequests.new <= lcMinAcceptedCapacityRequests.new )",task.c_str());
        return false;
      }

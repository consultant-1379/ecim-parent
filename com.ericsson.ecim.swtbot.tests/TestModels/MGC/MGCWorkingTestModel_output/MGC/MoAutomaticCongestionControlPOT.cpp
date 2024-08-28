IntraMo
###UpdateValidate
###2556
###APPR
###		Value of Congestion Level1 Limit + 50 must be equal or less than value of Congestion Level2 Limit.
###		if ( ( mrow.accCongestionLevel2Limit_get()< mrow.accCongestionLevel1Limit_get()+50 )  ){
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s:",task.c_str(),rule.c_str());
        mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( accCongestionLevel2Limit.new < accCongestionLevel1Limit.new + 50 )",task.c_str());
        return false;
      }

IntraMo
###UpdateValidate
###0
###CHCK
###		The time range is not valid. The sum of Granularity multiplied by Report Period and Start Time must be less than or equal to End Time.
###		//
       time_t local = time(NULL);
       time_t i = miter->second.pmStartTime_get();
       time_t j = miter->second.pmEndTime_get();

       if (j!=0) {
         if (difftime(j,local)<0) {
           brcodestr = rule + ": endTime must be greater or equal than current time.";
           mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
           return false;
         }
         const double oneMinute = 60.0;
         double d=difftime(j,i)/oneMinute;
         double t=(double)(miter->second.pmGranularity_get()*miter->second.pmReportPeriod_get());
         if (t > d) {
           mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
           return false;
         }
       }

######IntraMo
###CreateValidate
###0
###CHCK
###		Job Name must be unique.
###		for ( niter = mtable.begin(); niter != mtable.end(); ++niter ) {
        if (niter != miter ) {
          if (niter->second.pmTasksTableRowStatus_get()==active) {
            if ( (pmJobName_get()== niter->second.pmJobName_get() )  ){
              mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s record[%d] rejected by rule %s:",task.c_str(),index_get(),rule.c_str());
              mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s ( pmJobName.new == pmJobName.current )",task.c_str());
              return false;
            }
          }
        }
      }

######IntraMo
###UpdateValidate
###0
###CHCK
###		Granularity multiplied by Report Period must be less than or equal to 24 hours, that is, 1440 minutes.
###		//
       const uint aDay = 1440;
       if ((miter->second.pmGranularity_get()*miter->second.pmReportPeriod_get())>aDay) {
         mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
         return false;
       }

######IntraMo
###UpdateValidate
###0
###CHCK
###		Valid values for a minute in Start Time and End Time are: "00,05,10,15,20,25,30,35,40,45,50,55".
###		//
       struct tm tm;
       time_t startTime = miter->second.pmStartTime_get();
       localtime_r(&startTime,&tm);
       int minutes = tm.tm_min;
       if ((minutes-5*(minutes/5))!=0) {
         mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
         return false;
       }
       time_t endTime = miter->second.pmEndTime_get();
       localtime_r(&endTime,&tm);
       minutes = tm.tm_min;
       if ((minutes-5*(minutes/5))!=0) {
         mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
         return false;
       }

######IntraMo
###CreateValidate
###0
###CHCK
###		Granularity multiplied by Report Period must be less than or equal to 24 hours, that is, 1440 minutes.
###		//
        const uint aDay = 1440;
        if ((miter->second.pmGranularity_get()*miter->second.pmReportPeriod_get())>aDay) {
          mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
          return false;
        }

######IntraMo
###CreateValidate
###0
###CHCK
###		Valid values for a minute in Start Time and End Time are: "00,05,10,15,20,25,30,35,40,45,50,55".
###		//
       struct tm tm;
       time_t startTime = miter->second.pmStartTime_get();
       localtime_r(&startTime,&tm);
       int minutes = tm.tm_min;
       if ((minutes-5*(minutes/5))!=0) {
         mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
         return false;
       }
       time_t endTime = miter->second.pmEndTime_get();
       localtime_r(&endTime,&tm);
       minutes = tm.tm_min;
       if ((minutes-5*(minutes/5))!=0) {
         mlog.LogBasicFmt(ScslogApi::LOG_WARNING,"%s rejected by rule %s.",task.c_str(),rule.c_str());
         return false;
       }

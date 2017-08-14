package com.xxl.job.core.scheduler;

import com.xxl.job.core.biz.model.JobParam;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.util.AdminApiUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XxlJobScheduler {
    private static Logger logger = LoggerFactory.getLogger(XxlJobScheduler.class);

    public ReturnT<String> addJob(JobParam jobParam) {
        try {
            ReturnT<String> addJobResult = AdminApiUtil.callApiFailover(AdminApiUtil.ADDJOB, jobParam);
            logger.info(">>>>>>>>>>> xxl-job add job {}, jobParam:{}, addJobResult:{}",
                    (addJobResult.getCode() == ReturnT.SUCCESS_CODE ? "success" : "fail"), jobParam.toString(), addJobResult.toString());
        } catch (Exception e) {
            logger.error(">>>>>>>>>>> xxl-job XxlJobScheduler Exception:", e);
        }
        return ReturnT.SUCCESS;
    }
}

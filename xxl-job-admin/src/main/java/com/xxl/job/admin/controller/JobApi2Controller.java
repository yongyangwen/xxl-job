package com.xxl.job.admin.controller;

import com.xxl.job.admin.controller.annotation.PermissionLimit;
import com.xxl.job.admin.service.XxlJobService;
import com.xxl.job.core.biz.model.JobParam;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.util.AdminApiUtil;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by xuxueli on 17/5/10.
 */
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class JobApi2Controller {
    private static Logger logger = LoggerFactory.getLogger(JobApi2Controller.class);

    @Resource
    private XxlJobService xxlJobService;

    @RequestMapping(value = AdminApiUtil.ADDJOB, method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    @PermissionLimit(limit = false)
    public ReturnT<String> addJob(@RequestBody JobParam jobParam) {
        return xxlJobService.add(jobParam);
    }

    @RequestMapping(value = AdminApiUtil.TRIGGERJOB, method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    @PermissionLimit(limit = false)
    public ReturnT<String> triggerJob(@RequestParam int id) {
        return xxlJobService.triggerJob(id);
    }
}

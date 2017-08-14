package com.xxl.job.core.biz.model;

import lombok.Data;

import java.util.Date;

/**
 * xxl-job info
 *
 * @author xuxueli  2016-1-12 18:25:49
 */
@Data
public class JobParam {
    private String appname;        // 执行器名称
    private String jobCron;        // 任务执行CRON表达式 【base on quartz】
    private String jobDesc;

    private Date addTime;
    private Date updateTime;

    private String author;        // 负责人
    private String alarmEmail;    // 报警邮件

    private String executorRouteStrategy;    // 执行器路由策略
    private String executorHandler;            // 执行器，任务Handler名称
    private String executorParam;            // 执行器，任务参数
    private String executorBlockStrategy;    // 阻塞处理策略
    private String executorFailStrategy;    // 失败处理策略

    private String glueType;        // GLUE类型	#com.xxl.job.core.glue.GlueTypeEnum
    private String glueSource;        // GLUE源代码
    private String glueRemark;        // GLUE备注
    private Date glueUpdatetime;    // GLUE更新时间

    private String childJobKey;        // 子任务Key

    // copy from quartz
    private String jobStatus;        // 任务状态 【base on quartz】
}

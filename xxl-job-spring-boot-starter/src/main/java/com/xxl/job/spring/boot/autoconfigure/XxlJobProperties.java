package com.xxl.job.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * Author: Antergone
 * Date: 2017/6/30
 */
@ConfigurationProperties(prefix = XxlJobProperties.XXL_SERVER_PREFIX)
public class XxlJobProperties {

    static final String XXL_SERVER_PREFIX = "xxl.job";

    private String ip = "";
    private int port = 9999;
    private String appName;
    private String adminAddress;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    private String logPath;
}

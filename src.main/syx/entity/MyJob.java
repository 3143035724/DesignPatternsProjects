package syx.entity;

import lombok.Data;

/**
 * * syx.entity
 *
 * @author syx
 * @version 1.0.0
 * @date 2021/1/11 13:50
 */
public class MyJob {

    private String jobId;

    private String jobName;


    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}

package com.mdds.entity;

import java.io.Serializable;
import java.util.Date;

public class HpDepartment implements Serializable {

    private String id;
    private String deptName;
    // 病区编码
    private String wardCode;
    private int isClinic;
    private int isInhosp;
    private int isEmergency;
    private int updateUserCode;
    private Date updateTime;
    // 机构ID
    private String orgId;
    // 是否是审查科室
    private byte isExam;

    public HpDepartment() {
    }

    public HpDepartment(String id, String deptName, String wardCode, int isClinic, int isInhosp, int isEmergency, int updateUserCode, Date updateTime, String orgId, byte isExam) {
        this.id = id;
        this.deptName = deptName;
        this.wardCode = wardCode;
        this.isClinic = isClinic;
        this.isInhosp = isInhosp;
        this.isEmergency = isEmergency;
        this.updateUserCode = updateUserCode;
        this.updateTime = updateTime;
        this.orgId = orgId;
        this.isExam = isExam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public int getIsClinic() {
        return isClinic;
    }

    public void setIsClinic(int isClinic) {
        this.isClinic = isClinic;
    }

    public int getIsInhosp() {
        return isInhosp;
    }

    public void setIsInhosp(int isInhosp) {
        this.isInhosp = isInhosp;
    }

    public int getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(int isEmergency) {
        this.isEmergency = isEmergency;
    }

    public int getUpdateUserCode() {
        return updateUserCode;
    }

    public void setUpdateUserCode(int updateUserCode) {
        this.updateUserCode = updateUserCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public byte getIsExam() {
        return isExam;
    }

    public void setIsExam(byte isExam) {
        this.isExam = isExam;
    }

    @Override
    public String toString() {
        return "HpDepartment{" +
                "id='" + id + '\'' +
                ", deptName='" + deptName + '\'' +
                ", wardCode='" + wardCode + '\'' +
                ", isClinic=" + isClinic +
                ", isInhosp=" + isInhosp +
                ", isEmergency=" + isEmergency +
                ", updateUserCode=" + updateUserCode +
                ", updateTime=" + updateTime +
                ", orgId='" + orgId + '\'' +
                ", isExam=" + isExam +
                '}';
    }
}

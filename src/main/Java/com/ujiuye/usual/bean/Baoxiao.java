package com.ujiuye.usual.bean;

import com.ujiuye.emp.bean.Employee;

import java.util.Date;
import java.util.List;

public class Baoxiao {
    private String bxid;

    private Integer paymode;

    private Double totalmoney;

    private Date bxtime;

    private String bxremark;

    private Integer bxstatus;

    private Integer empFk;

    private String result;

    //关联查询员工
    private Employee employee;

    //关联查询支出类型
    private Expendituretype expendituretype;

    //关联审批回复
    private List<Baoxiaoreply> baoxiaoreplies;



    public void setBaoxiaoreplies(List<Baoxiaoreply> baoxiaoreplies) {
        this.baoxiaoreplies = baoxiaoreplies;
    }

    public List<Baoxiaoreply> getBaoxiaoreplies() {

        return baoxiaoreplies;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setExpendituretype(Expendituretype expendituretype) {
        this.expendituretype = expendituretype;
    }

    public Employee getEmployee() {

        return employee;
    }

    public Expendituretype getExpendituretype() {
        return expendituretype;
    }

    public String getBxid() {
        return bxid;
    }

    public void setBxid(String bxid) {
        this.bxid = bxid == null ? null : bxid.trim();
    }

    public Integer getPaymode() {
        return paymode;
    }

    public void setPaymode(Integer paymode) {
        this.paymode = paymode;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Date getBxtime() {
        return bxtime;
    }

    public void setBxtime(Date bxtime) {
        this.bxtime = bxtime;
    }

    public String getBxremark() {
        return bxremark;
    }

    public void setBxremark(String bxremark) {
        this.bxremark = bxremark == null ? null : bxremark.trim();
    }

    public Integer getBxstatus() {
        return bxstatus;
    }

    public void setBxstatus(Integer bxstatus) {
        this.bxstatus = bxstatus;
    }

    public Integer getEmpFk() {
        return empFk;
    }

    public void setEmpFk(Integer empFk) {
        this.empFk = empFk;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}
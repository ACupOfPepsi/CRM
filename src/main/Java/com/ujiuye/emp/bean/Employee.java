package com.ujiuye.emp.bean;


import com.ujiuye.usual.bean.Archives;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

  private int eid;
  private String ename;
  private String esex;
  private int eage;
  private String telephone;
  private Date hiredate;
  private String pnum;
  private String username;
  private String password;
  private String remark;
  private int pFk;
  private int dFk;
  private int lFk;
  private String emppic;

  //关联档案
  private Archives archives;

  public void setArchives(Archives archives) {
    this.archives = archives;
  }

  public Archives getArchives() {

    return archives;
  }

  public void setEid(int eid) {
    this.eid = eid;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public void setEsex(String esex) {
    this.esex = esex;
  }

  public void setEage(int eage) {
    this.eage = eage;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public void setHiredate(Date hiredate) {
    this.hiredate = hiredate;
  }

  public void setPnum(String pnum) {
    this.pnum = pnum;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public void setpFk(int pFk) {
    this.pFk = pFk;
  }

  public void setdFk(int dFk) {
    this.dFk = dFk;
  }

  public void setlFk(int lFk) {
    this.lFk = lFk;
  }

  public void setEmppic(String emppic) {
    this.emppic = emppic;
  }

  public int getEid() {
    return eid;
  }

  public String getEname() {
    return ename;
  }

  public String getEsex() {
    return esex;
  }

  public int getEage() {
    return eage;
  }

  public String getTelephone() {
    return telephone;
  }

  public Date getHiredate() {
    return hiredate;
  }

  public String getPnum() {
    return pnum;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getRemark() {
    return remark;
  }

  public int getpFk() {
    return pFk;
  }

  public int getdFk() {
    return dFk;
  }

  public int getlFk() {
    return lFk;
  }

  public String getEmppic() {
    return emppic;
  }
}

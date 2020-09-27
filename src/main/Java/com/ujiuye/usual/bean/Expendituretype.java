package com.ujiuye.usual.bean;

//报销类型
public class Expendituretype {
    private Integer etid;

    private String etname;

    public Integer getEtid() {
        return etid;
    }

    public void setEtid(Integer etid) {
        this.etid = etid;
    }

    public String getEtname() {
        return etname;
    }

    public void setEtname(String etname) {
        this.etname = etname == null ? null : etname.trim();
    }
}
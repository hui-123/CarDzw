package com.accp.pojo;

public class Income_brackets {
    private Integer incno;

    private String inctype;

    public Integer getIncno() {
        return incno;
    }

    public void setIncno(Integer incno) {
        this.incno = incno;
    }

    public String getInctype() {
        return inctype;
    }

    public void setInctype(String inctype) {
        this.inctype = inctype == null ? null : inctype.trim();
    }
}
package com.accp.pojo;

public class Customer_profile {
    private String cpno;

    private String cpclienttype;

    private String cppricetype;

    private Integer cpvalidity;

    private Integer cpdues;

    private String cptype;

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno == null ? null : cpno.trim();
    }

    public String getCpclienttype() {
        return cpclienttype;
    }

    public void setCpclienttype(String cpclienttype) {
        this.cpclienttype = cpclienttype == null ? null : cpclienttype.trim();
    }

    public String getCppricetype() {
        return cppricetype;
    }

    public void setCppricetype(String cppricetype) {
        this.cppricetype = cppricetype == null ? null : cppricetype.trim();
    }

    public Integer getCpvalidity() {
        return cpvalidity;
    }

    public void setCpvalidity(Integer cpvalidity) {
        this.cpvalidity = cpvalidity;
    }

    public Integer getCpdues() {
        return cpdues;
    }

    public void setCpdues(Integer cpdues) {
        this.cpdues = cpdues;
    }

    public String getCptype() {
        return cptype;
    }

    public void setCptype(String cptype) {
        this.cptype = cptype == null ? null : cptype.trim();
    }
}
package com.accp.pojo;

public class Engine {
    private Integer engno;

    private String cvdnumber;

    private String engname;

    public Integer getEngno() {
        return engno;
    }

    public void setEngno(Integer engno) {
        this.engno = engno;
    }

    public String getCvdnumber() {
        return cvdnumber;
    }

    public void setCvdnumber(String cvdnumber) {
        this.cvdnumber = cvdnumber == null ? null : cvdnumber.trim();
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname == null ? null : engname.trim();
    }
}
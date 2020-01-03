package com.accp.pojo;

import java.util.Date;

public class Staff {
    private String stano;

    private String dimno;

    private Integer posno;

    private String username;

    private Integer depno;

    private String staname;

    private String stasex;

    private String stapicture;

    private String stashop;

    private Integer stadepartment;

    private String staproperty;

    private String staaddress;

    private String staphone;

    private Date staentrydate;

    private Date stausedate;

    private Date stabirthdate;

    private Date stacontractstart;

    private Date stacontractover;

    private String stausername;

    public String getStano() {
        return stano;
    }

    public void setStano(String stano) {
        this.stano = stano == null ? null : stano.trim();
    }

    public String getDimno() {
        return dimno;
    }

    public void setDimno(String dimno) {
        this.dimno = dimno == null ? null : dimno.trim();
    }

    public Integer getPosno() {
        return posno;
    }

    public void setPosno(Integer posno) {
        this.posno = posno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getDepno() {
        return depno;
    }

    public void setDepno(Integer depno) {
        this.depno = depno;
    }

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname == null ? null : staname.trim();
    }

    public String getStasex() {
        return stasex;
    }

    public void setStasex(String stasex) {
        this.stasex = stasex == null ? null : stasex.trim();
    }

    public String getStapicture() {
        return stapicture;
    }

    public void setStapicture(String stapicture) {
        this.stapicture = stapicture == null ? null : stapicture.trim();
    }

    public String getStashop() {
        return stashop;
    }

    public void setStashop(String stashop) {
        this.stashop = stashop == null ? null : stashop.trim();
    }

    public Integer getStadepartment() {
        return stadepartment;
    }

    public void setStadepartment(Integer stadepartment) {
        this.stadepartment = stadepartment;
    }

    public String getStaproperty() {
        return staproperty;
    }

    public void setStaproperty(String staproperty) {
        this.staproperty = staproperty == null ? null : staproperty.trim();
    }

    public String getStaaddress() {
        return staaddress;
    }

    public void setStaaddress(String staaddress) {
        this.staaddress = staaddress == null ? null : staaddress.trim();
    }

    public String getStaphone() {
        return staphone;
    }

    public void setStaphone(String staphone) {
        this.staphone = staphone == null ? null : staphone.trim();
    }

    public Date getStaentrydate() {
        return staentrydate;
    }

    public void setStaentrydate(Date staentrydate) {
        this.staentrydate = staentrydate;
    }

    public Date getStausedate() {
        return stausedate;
    }

    public void setStausedate(Date stausedate) {
        this.stausedate = stausedate;
    }

    public Date getStabirthdate() {
        return stabirthdate;
    }

    public void setStabirthdate(Date stabirthdate) {
        this.stabirthdate = stabirthdate;
    }

    public Date getStacontractstart() {
        return stacontractstart;
    }

    public void setStacontractstart(Date stacontractstart) {
        this.stacontractstart = stacontractstart;
    }

    public Date getStacontractover() {
        return stacontractover;
    }

    public void setStacontractover(Date stacontractover) {
        this.stacontractover = stacontractover;
    }

    public String getStausername() {
        return stausername;
    }

    public void setStausername(String stausername) {
        this.stausername = stausername == null ? null : stausername.trim();
    }
}
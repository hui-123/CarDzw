package com.accp.pojo;

import java.util.Date;

public class Maintain {
    private String ciecvdnumber;

    private String cvdnumber;

    private String mainame;

    private Date maiintendeddate;

    private Integer maiintendedmileage;

    private Date maipracticaldate;

    private Integer maipracticalmileage;

    private String mairemark;

    public String getCiecvdnumber() {
        return ciecvdnumber;
    }

    public void setCiecvdnumber(String ciecvdnumber) {
        this.ciecvdnumber = ciecvdnumber == null ? null : ciecvdnumber.trim();
    }

    public String getCvdnumber() {
        return cvdnumber;
    }

    public void setCvdnumber(String cvdnumber) {
        this.cvdnumber = cvdnumber == null ? null : cvdnumber.trim();
    }

    public String getMainame() {
        return mainame;
    }

    public void setMainame(String mainame) {
        this.mainame = mainame == null ? null : mainame.trim();
    }

    public Date getMaiintendeddate() {
        return maiintendeddate;
    }

    public void setMaiintendeddate(Date maiintendeddate) {
        this.maiintendeddate = maiintendeddate;
    }

    public Integer getMaiintendedmileage() {
        return maiintendedmileage;
    }

    public void setMaiintendedmileage(Integer maiintendedmileage) {
        this.maiintendedmileage = maiintendedmileage;
    }

    public Date getMaipracticaldate() {
        return maipracticaldate;
    }

    public void setMaipracticaldate(Date maipracticaldate) {
        this.maipracticaldate = maipracticaldate;
    }

    public Integer getMaipracticalmileage() {
        return maipracticalmileage;
    }

    public void setMaipracticalmileage(Integer maipracticalmileage) {
        this.maipracticalmileage = maipracticalmileage;
    }

    public String getMairemark() {
        return mairemark;
    }

    public void setMairemark(String mairemark) {
        this.mairemark = mairemark == null ? null : mairemark.trim();
    }
}
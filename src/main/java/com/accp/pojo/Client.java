package com.accp.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFilter;


public class Client {
    private String clino;

    private String setno;

    private String cvdnumber;

    private String stano;

    private String cliname;

    private Integer clicontact;

    private String cliphone;

    private String cliaddress;
    @JsonFilter("yyyy-MM-dd")
    private Date clibirthday;

    private Integer clipaymentdays;

    private Integer cliguazhangyue;

    private Integer clizhuanshuguwen;

    private Integer guwendianhua;

    private String cliremark;

    public String getClino() {
        return clino;
    }

    public void setClino(String clino) {
        this.clino = clino == null ? null : clino.trim();
    }

    public String getSetno() {
        return setno;
    }

    @Override
	public String toString() {
		return "Client [clino=" + clino + ", setno=" + setno + ", cvdnumber=" + cvdnumber + ", stano=" + stano
				+ ", cliname=" + cliname + ", clicontact=" + clicontact + ", cliphone=" + cliphone + ", cliaddress="
				+ cliaddress + ", clibirthday=" + clibirthday + ", clipaymentdays=" + clipaymentdays
				+ ", cliguazhangyue=" + cliguazhangyue + ", clizhuanshuguwen=" + clizhuanshuguwen + ", guwendianhua="
				+ guwendianhua + ", cliremark=" + cliremark + "]";
	}

	public void setSetno(String setno) {
        this.setno = setno == null ? null : setno.trim();
    }

    public String getCvdnumber() {
        return cvdnumber;
    }

    public void setCvdnumber(String cvdnumber) {
        this.cvdnumber = cvdnumber == null ? null : cvdnumber.trim();
    }

    public String getStano() {
        return stano;
    }

    public void setStano(String stano) {
        this.stano = stano == null ? null : stano.trim();
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname == null ? null : cliname.trim();
    }

    public Integer getClicontact() {
        return clicontact;
    }

    public void setClicontact(Integer clicontact) {
        this.clicontact = clicontact;
    }

    public String getCliphone() {
        return cliphone;
    }

    public void setCliphone(String cliphone) {
        this.cliphone = cliphone == null ? null : cliphone.trim();
    }

    public String getCliaddress() {
        return cliaddress;
    }

    public void setCliaddress(String cliaddress) {
        this.cliaddress = cliaddress == null ? null : cliaddress.trim();
    }

    public Date getClibirthday() {
        return clibirthday;
    }

    public void setClibirthday(Date clibirthday) {
        this.clibirthday = clibirthday;
    }

    public Integer getClipaymentdays() {
        return clipaymentdays;
    }

    public void setClipaymentdays(Integer clipaymentdays) {
        this.clipaymentdays = clipaymentdays;
    }

    public Integer getCliguazhangyue() {
        return cliguazhangyue;
    }

    public void setCliguazhangyue(Integer cliguazhangyue) {
        this.cliguazhangyue = cliguazhangyue;
    }

    public Integer getClizhuanshuguwen() {
        return clizhuanshuguwen;
    }

    public void setClizhuanshuguwen(Integer clizhuanshuguwen) {
        this.clizhuanshuguwen = clizhuanshuguwen;
    }

    public Integer getGuwendianhua() {
        return guwendianhua;
    }

    public void setGuwendianhua(Integer guwendianhua) {
        this.guwendianhua = guwendianhua;
    }

    public String getCliremark() {
        return cliremark;
    }

    public void setCliremark(String cliremark) {
        this.cliremark = cliremark == null ? null : cliremark.trim();
    }
}
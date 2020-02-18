package com.accp.vo.hui;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFilter;

//客户表和车辆信息表
public class KuHuChe {
	  private String cvdnumber;

	    private String clino;

	    private String jiecvdnumber;

	    private String brano;

	    private String setno;

	    private String cpno;

	    private Integer engno;

	    private String cvdbrand;

	    private String cvdtype;

	    private String cvddriver;

	    private Integer cvdphone;

	    private Date cvdbirthdate;

	    private Integer clecpno;

	    private String cvdaffiliation;

	    private Date cvdzhengjiandaoqiriqi;

	    private String cvdvin;

	    private String clecvdenginenumber;

	    private String clibrano;

	    private Date cvdshangpairiqi;

	    private Date cvdchejiandaoqi;

	    private String cvdfueloil;

	    private String cvdclino;
	    
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

		public String getCvdnumber() {
			return cvdnumber;
		}

		public void setCvdnumber(String cvdnumber) {
			this.cvdnumber = cvdnumber;
		}

		public String getClino() {
			return clino;
		}

		public void setClino(String clino) {
			this.clino = clino;
		}

		public String getJiecvdnumber() {
			return jiecvdnumber;
		}

		public void setJiecvdnumber(String jiecvdnumber) {
			this.jiecvdnumber = jiecvdnumber;
		}

		public String getBrano() {
			return brano;
		}

		public void setBrano(String brano) {
			this.brano = brano;
		}

		public String getSetno() {
			return setno;
		}

		public void setSetno(String setno) {
			this.setno = setno;
		}

		public String getCpno() {
			return cpno;
		}

		public void setCpno(String cpno) {
			this.cpno = cpno;
		}

		public Integer getEngno() {
			return engno;
		}

		public void setEngno(Integer engno) {
			this.engno = engno;
		}

		public String getCvdbrand() {
			return cvdbrand;
		}

		public void setCvdbrand(String cvdbrand) {
			this.cvdbrand = cvdbrand;
		}

		public String getCvdtype() {
			return cvdtype;
		}

		public void setCvdtype(String cvdtype) {
			this.cvdtype = cvdtype;
		}

		public String getCvddriver() {
			return cvddriver;
		}

		public void setCvddriver(String cvddriver) {
			this.cvddriver = cvddriver;
		}

		public Integer getCvdphone() {
			return cvdphone;
		}

		public void setCvdphone(Integer cvdphone) {
			this.cvdphone = cvdphone;
		}

		public Date getCvdbirthdate() {
			return cvdbirthdate;
		}

		public void setCvdbirthdate(Date cvdbirthdate) {
			this.cvdbirthdate = cvdbirthdate;
		}

		public Integer getClecpno() {
			return clecpno;
		}

		public void setClecpno(Integer clecpno) {
			this.clecpno = clecpno;
		}

		public String getCvdaffiliation() {
			return cvdaffiliation;
		}

		public void setCvdaffiliation(String cvdaffiliation) {
			this.cvdaffiliation = cvdaffiliation;
		}

		public Date getCvdzhengjiandaoqiriqi() {
			return cvdzhengjiandaoqiriqi;
		}

		public void setCvdzhengjiandaoqiriqi(Date cvdzhengjiandaoqiriqi) {
			this.cvdzhengjiandaoqiriqi = cvdzhengjiandaoqiriqi;
		}

		public String getCvdvin() {
			return cvdvin;
		}

		public void setCvdvin(String cvdvin) {
			this.cvdvin = cvdvin;
		}

		public String getClecvdenginenumber() {
			return clecvdenginenumber;
		}

		public void setClecvdenginenumber(String clecvdenginenumber) {
			this.clecvdenginenumber = clecvdenginenumber;
		}

		public String getClibrano() {
			return clibrano;
		}

		public void setClibrano(String clibrano) {
			this.clibrano = clibrano;
		}

		public Date getCvdshangpairiqi() {
			return cvdshangpairiqi;
		}

		public void setCvdshangpairiqi(Date cvdshangpairiqi) {
			this.cvdshangpairiqi = cvdshangpairiqi;
		}

		public Date getCvdchejiandaoqi() {
			return cvdchejiandaoqi;
		}

		public void setCvdchejiandaoqi(Date cvdchejiandaoqi) {
			this.cvdchejiandaoqi = cvdchejiandaoqi;
		}

		public String getCvdfueloil() {
			return cvdfueloil;
		}

		public void setCvdfueloil(String cvdfueloil) {
			this.cvdfueloil = cvdfueloil;
		}

		public String getCvdclino() {
			return cvdclino;
		}

		public void setCvdclino(String cvdclino) {
			this.cvdclino = cvdclino;
		}

		public String getStano() {
			return stano;
		}

		public void setStano(String stano) {
			this.stano = stano;
		}

		public String getCliname() {
			return cliname;
		}

		public void setCliname(String cliname) {
			this.cliname = cliname;
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
			this.cliphone = cliphone;
		}

		public String getCliaddress() {
			return cliaddress;
		}

		public void setCliaddress(String cliaddress) {
			this.cliaddress = cliaddress;
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
			this.cliremark = cliremark;
		}

		public KuHuChe(String cvdnumber, String clino, String jiecvdnumber, String brano, String setno, String cpno,
				Integer engno, String cvdbrand, String cvdtype, String cvddriver, Integer cvdphone, Date cvdbirthdate,
				Integer clecpno, String cvdaffiliation, Date cvdzhengjiandaoqiriqi, String cvdvin,
				String clecvdenginenumber, String clibrano, Date cvdshangpairiqi, Date cvdchejiandaoqi,
				String cvdfueloil, String cvdclino, String stano, String cliname, Integer clicontact, String cliphone,
				String cliaddress, Date clibirthday, Integer clipaymentdays, Integer cliguazhangyue,
				Integer clizhuanshuguwen, Integer guwendianhua, String cliremark) {
			super();
			this.cvdnumber = cvdnumber;
			this.clino = clino;
			this.jiecvdnumber = jiecvdnumber;
			this.brano = brano;
			this.setno = setno;
			this.cpno = cpno;
			this.engno = engno;
			this.cvdbrand = cvdbrand;
			this.cvdtype = cvdtype;
			this.cvddriver = cvddriver;
			this.cvdphone = cvdphone;
			this.cvdbirthdate = cvdbirthdate;
			this.clecpno = clecpno;
			this.cvdaffiliation = cvdaffiliation;
			this.cvdzhengjiandaoqiriqi = cvdzhengjiandaoqiriqi;
			this.cvdvin = cvdvin;
			this.clecvdenginenumber = clecvdenginenumber;
			this.clibrano = clibrano;
			this.cvdshangpairiqi = cvdshangpairiqi;
			this.cvdchejiandaoqi = cvdchejiandaoqi;
			this.cvdfueloil = cvdfueloil;
			this.cvdclino = cvdclino;
			this.stano = stano;
			this.cliname = cliname;
			this.clicontact = clicontact;
			this.cliphone = cliphone;
			this.cliaddress = cliaddress;
			this.clibirthday = clibirthday;
			this.clipaymentdays = clipaymentdays;
			this.cliguazhangyue = cliguazhangyue;
			this.clizhuanshuguwen = clizhuanshuguwen;
			this.guwendianhua = guwendianhua;
			this.cliremark = cliremark;
		}

		public KuHuChe() {
			super();
		}
	    
	    
}

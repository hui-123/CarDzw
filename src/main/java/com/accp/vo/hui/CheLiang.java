package com.accp.vo.hui;

import java.util.Date;

public class CheLiang {
	
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
	    
	    private String braname;  //发动机品牌
	    
	    private String brainitial; //首字母

		public CheLiang(String cvdnumber, String clino, String jiecvdnumber, String brano, String setno, String cpno,
				Integer engno, String cvdbrand, String cvdtype, String cvddriver, Integer cvdphone, Date cvdbirthdate,
				Integer clecpno, String cvdaffiliation, Date cvdzhengjiandaoqiriqi, String cvdvin,
				String clecvdenginenumber, String clibrano, Date cvdshangpairiqi, Date cvdchejiandaoqi,
				String cvdfueloil, String cvdclino, String braname, String brainitial) {
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
			this.braname = braname;
			this.brainitial = brainitial;
		}

		@Override
		public String toString() {
			return "CheLiang [cvdnumber=" + cvdnumber + ", clino=" + clino + ", jiecvdnumber=" + jiecvdnumber
					+ ", brano=" + brano + ", setno=" + setno + ", cpno=" + cpno + ", engno=" + engno + ", cvdbrand="
					+ cvdbrand + ", cvdtype=" + cvdtype + ", cvddriver=" + cvddriver + ", cvdphone=" + cvdphone
					+ ", cvdbirthdate=" + cvdbirthdate + ", clecpno=" + clecpno + ", cvdaffiliation=" + cvdaffiliation
					+ ", cvdzhengjiandaoqiriqi=" + cvdzhengjiandaoqiriqi + ", cvdvin=" + cvdvin
					+ ", clecvdenginenumber=" + clecvdenginenumber + ", clibrano=" + clibrano + ", cvdshangpairiqi="
					+ cvdshangpairiqi + ", cvdchejiandaoqi=" + cvdchejiandaoqi + ", cvdfueloil=" + cvdfueloil
					+ ", cvdclino=" + cvdclino + ", braname=" + braname + ", brainitial=" + brainitial + "]";
		}

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

		public String getBraname() {
			return braname;
		}

		public void setBraname(String braname) {
			this.braname = braname;
		}

		public String getBrainitial() {
			return brainitial;
		}

		public void setBrainitial(String brainitial) {
			this.brainitial = brainitial;
		}

		public CheLiang() {
			super();
		}
	    
	    
}

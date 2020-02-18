package com.accp.vo.hui;

public class ChePinPai {
	private String brano;

	private String braname;

	private String brainitial;
	
	private String mobrano;

	private String modno;

	private String modname;

	private Integer referenceprice;

	private String modpicture;

	private Integer modenginebrano;

	private String modimport;

	public ChePinPai(String brano, String braname, String brainitial, String mobrano, String modno, String modname,
			Integer referenceprice, String modpicture, Integer modenginebrano, String modimport) {
		super();
		this.brano = brano;
		this.braname = braname;
		this.brainitial = brainitial;
		this.mobrano = mobrano;
		this.modno = modno;
		this.modname = modname;
		this.referenceprice = referenceprice;
		this.modpicture = modpicture;
		this.modenginebrano = modenginebrano;
		this.modimport = modimport;
	}

	public ChePinPai() {
		super();
	}

	public String getBrano() {
		return brano;
	}

	public void setBrano(String brano) {
		this.brano = brano;
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

	public String getMobrano() {
		return mobrano;
	}

	public void setMobrano(String mobrano) {
		this.mobrano = mobrano;
	}

	public String getModno() {
		return modno;
	}

	public void setModno(String modno) {
		this.modno = modno;
	}

	public String getModname() {
		return modname;
	}

	public void setModname(String modname) {
		this.modname = modname;
	}

	public Integer getReferenceprice() {
		return referenceprice;
	}

	public void setReferenceprice(Integer referenceprice) {
		this.referenceprice = referenceprice;
	}

	public String getModpicture() {
		return modpicture;
	}

	public void setModpicture(String modpicture) {
		this.modpicture = modpicture;
	}

	public Integer getModenginebrano() {
		return modenginebrano;
	}

	public void setModenginebrano(Integer modenginebrano) {
		this.modenginebrano = modenginebrano;
	}

	public String getModimport() {
		return modimport;
	}

	public void setModimport(String modimport) {
		this.modimport = modimport;
	}

	@Override
	public String toString() {
		return "ChePinPai [brano=" + brano + ", braname=" + braname + ", brainitial=" + brainitial + ", mobrano="
				+ mobrano + ", modno=" + modno + ", modname=" + modname + ", referenceprice=" + referenceprice
				+ ", modpicture=" + modpicture + ", modenginebrano=" + modenginebrano + ", modimport=" + modimport
				+ "]";
	}

	
	
}

package com.accp.pojo;

public class Brand {
    private String brano;

    private String braname;

    private String brainitial;

    public String getBrano() {
        return brano;
    }

    public void setBrano(String brano) {
        this.brano = brano == null ? null : brano.trim();
    }

    public String getBraname() {
        return braname;
    }

    public void setBraname(String braname) {
        this.braname = braname == null ? null : braname.trim();
    }

    public String getBrainitial() {
        return brainitial;
    }

    public void setBrainitial(String brainitial) {
        this.brainitial = brainitial == null ? null : brainitial.trim();
    }
}
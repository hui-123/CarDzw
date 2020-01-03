package com.accp.pojo;

public class Stars {
    private Integer starsno;

    private String starsname;

    private Integer starscutweight;

    public Integer getStarsno() {
        return starsno;
    }

    public void setStarsno(Integer starsno) {
        this.starsno = starsno;
    }

    public String getStarsname() {
        return starsname;
    }

    public void setStarsname(String starsname) {
        this.starsname = starsname == null ? null : starsname.trim();
    }

    public Integer getStarscutweight() {
        return starscutweight;
    }

    public void setStarscutweight(Integer starscutweight) {
        this.starscutweight = starscutweight;
    }
}
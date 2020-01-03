package com.accp.pojo;

public class Upkeep_brackets {
    private Integer upkno;

    private Integer incno;

    private Integer upktypeno;

    private String upktypeclassify;

    public Integer getUpkno() {
        return upkno;
    }

    public void setUpkno(Integer upkno) {
        this.upkno = upkno;
    }

    public Integer getIncno() {
        return incno;
    }

    public void setIncno(Integer incno) {
        this.incno = incno;
    }

    public Integer getUpktypeno() {
        return upktypeno;
    }

    public void setUpktypeno(Integer upktypeno) {
        this.upktypeno = upktypeno;
    }

    public String getUpktypeclassify() {
        return upktypeclassify;
    }

    public void setUpktypeclassify(String upktypeclassify) {
        this.upktypeclassify = upktypeclassify == null ? null : upktypeclassify.trim();
    }
}
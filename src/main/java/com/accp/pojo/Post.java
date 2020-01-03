package com.accp.pojo;

public class Post {
    private Integer posno;

    private String stano;

    private String posname;

    private String posstano;

    public Integer getPosno() {
        return posno;
    }

    public void setPosno(Integer posno) {
        this.posno = posno;
    }

    public String getStano() {
        return stano;
    }

    public void setStano(String stano) {
        this.stano = stano == null ? null : stano.trim();
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname == null ? null : posname.trim();
    }

    public String getPosstano() {
        return posstano;
    }

    public void setPosstano(String posstano) {
        this.posstano = posstano == null ? null : posstano.trim();
    }
}
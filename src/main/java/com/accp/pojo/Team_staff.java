package com.accp.pojo;

public class Team_staff {
    private String artisanno;

    private Integer starsno;

    private String jiecvdnumber;

    private String artisanname;

    private String artisansex;

    private String teamartisanteam;

    private String artisanphone;

    private Integer tsstarsno;

    public String getArtisanno() {
        return artisanno;
    }

    public void setArtisanno(String artisanno) {
        this.artisanno = artisanno == null ? null : artisanno.trim();
    }

    public Integer getStarsno() {
        return starsno;
    }

    public void setStarsno(Integer starsno) {
        this.starsno = starsno;
    }

    public String getJiecvdnumber() {
        return jiecvdnumber;
    }

    public void setJiecvdnumber(String jiecvdnumber) {
        this.jiecvdnumber = jiecvdnumber == null ? null : jiecvdnumber.trim();
    }

    public String getArtisanname() {
        return artisanname;
    }

    public void setArtisanname(String artisanname) {
        this.artisanname = artisanname == null ? null : artisanname.trim();
    }

    public String getArtisansex() {
        return artisansex;
    }

    public void setArtisansex(String artisansex) {
        this.artisansex = artisansex == null ? null : artisansex.trim();
    }

    public String getTeamartisanteam() {
        return teamartisanteam;
    }

    public void setTeamartisanteam(String teamartisanteam) {
        this.teamartisanteam = teamartisanteam == null ? null : teamartisanteam.trim();
    }

    public String getArtisanphone() {
        return artisanphone;
    }

    public void setArtisanphone(String artisanphone) {
        this.artisanphone = artisanphone == null ? null : artisanphone.trim();
    }

    public Integer getTsstarsno() {
        return tsstarsno;
    }

    public void setTsstarsno(Integer tsstarsno) {
        this.tsstarsno = tsstarsno;
    }
}
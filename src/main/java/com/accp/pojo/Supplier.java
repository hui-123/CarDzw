package com.accp.pojo;

public class Supplier {
    private String supno;

    private String vcsupno;

    private String supname;

    private String supaddress;

    private Integer supphone;

    private String supremark;

    private String supclass;

    private String suppaymentway;

    private String supurl;

    private String suprunbrand;

    public String getSupno() {
        return supno;
    }

    public void setSupno(String supno) {
        this.supno = supno == null ? null : supno.trim();
    }

    public String getVcsupno() {
        return vcsupno;
    }

    public void setVcsupno(String vcsupno) {
        this.vcsupno = vcsupno == null ? null : vcsupno.trim();
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname == null ? null : supname.trim();
    }

    public String getSupaddress() {
        return supaddress;
    }

    public void setSupaddress(String supaddress) {
        this.supaddress = supaddress == null ? null : supaddress.trim();
    }

    public Integer getSupphone() {
        return supphone;
    }

    public void setSupphone(Integer supphone) {
        this.supphone = supphone;
    }

    public String getSupremark() {
        return supremark;
    }

    public void setSupremark(String supremark) {
        this.supremark = supremark == null ? null : supremark.trim();
    }

    public String getSupclass() {
        return supclass;
    }

    public void setSupclass(String supclass) {
        this.supclass = supclass == null ? null : supclass.trim();
    }

    public String getSuppaymentway() {
        return suppaymentway;
    }

    public void setSuppaymentway(String suppaymentway) {
        this.suppaymentway = suppaymentway == null ? null : suppaymentway.trim();
    }

    public String getSupurl() {
        return supurl;
    }

    public void setSupurl(String supurl) {
        this.supurl = supurl == null ? null : supurl.trim();
    }

    public String getSuprunbrand() {
        return suprunbrand;
    }

    public void setSuprunbrand(String suprunbrand) {
        this.suprunbrand = suprunbrand == null ? null : suprunbrand.trim();
    }
}
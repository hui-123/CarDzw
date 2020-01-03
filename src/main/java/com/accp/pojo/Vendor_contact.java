package com.accp.pojo;

public class Vendor_contact {
    private String vcsupno;

    private String vencontact;

    private String venpostion;

    private String venphone;

    public String getVcsupno() {
        return vcsupno;
    }

    public void setVcsupno(String vcsupno) {
        this.vcsupno = vcsupno == null ? null : vcsupno.trim();
    }

    public String getVencontact() {
        return vencontact;
    }

    public void setVencontact(String vencontact) {
        this.vencontact = vencontact == null ? null : vencontact.trim();
    }

    public String getVenpostion() {
        return venpostion;
    }

    public void setVenpostion(String venpostion) {
        this.venpostion = venpostion == null ? null : venpostion.trim();
    }

    public String getVenphone() {
        return venphone;
    }

    public void setVenphone(String venphone) {
        this.venphone = venphone == null ? null : venphone.trim();
    }
}
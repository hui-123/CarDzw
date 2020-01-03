package com.accp.pojo;

public class Models {
    private String mobrano;

    private String brano;

    private String modno;

    private String modname;

    private Integer referenceprice;

    private String modpicture;

    private Integer modenginebrano;

    private String modimport;

    public String getMobrano() {
        return mobrano;
    }

    public void setMobrano(String mobrano) {
        this.mobrano = mobrano == null ? null : mobrano.trim();
    }

    public String getBrano() {
        return brano;
    }

    public void setBrano(String brano) {
        this.brano = brano == null ? null : brano.trim();
    }

    public String getModno() {
        return modno;
    }

    public void setModno(String modno) {
        this.modno = modno == null ? null : modno.trim();
    }

    public String getModname() {
        return modname;
    }

    public void setModname(String modname) {
        this.modname = modname == null ? null : modname.trim();
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
        this.modpicture = modpicture == null ? null : modpicture.trim();
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
        this.modimport = modimport == null ? null : modimport.trim();
    }
}
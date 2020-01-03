package com.accp.pojo;

import java.util.Date;

public class dimission {
    private String dimno;

    private String stano;

    private String dimcause;

    private Date dimdate;

    public String getDimno() {
        return dimno;
    }

    public void setDimno(String dimno) {
        this.dimno = dimno == null ? null : dimno.trim();
    }

    public String getStano() {
        return stano;
    }

    public void setStano(String stano) {
        this.stano = stano == null ? null : stano.trim();
    }

    public String getDimcause() {
        return dimcause;
    }

    public void setDimcause(String dimcause) {
        this.dimcause = dimcause == null ? null : dimcause.trim();
    }

    public Date getDimdate() {
        return dimdate;
    }

    public void setDimdate(Date dimdate) {
        this.dimdate = dimdate;
    }
}
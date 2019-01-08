package com.itc.dbservice.dto;

/**
 * Created by hexad3cimal on 1/6/19.
 */



public class CodsusAndCustomerId {

    public CodsusAndCustomerId(Integer pscCodPers, String e0338Codsus){
        this.e0338Codsus = e0338Codsus;
        this.pscCodPers = pscCodPers;
    }
    private Integer pscCodPers;
    private String e0338Codsus;

    public Integer getPscCodPers() {
        return pscCodPers;
    }

    public void setPscCodPers(Integer pscCodPers) {
        this.pscCodPers = pscCodPers;
    }

    public String getE0338Codsus() {
        return e0338Codsus;
    }

    public void setE0338Codsus(String e0338Codsus) {
        this.e0338Codsus = e0338Codsus;
    }

    @Override
    public String toString() {
        return "CodsusAndCustomerId{" +
                "pscCodPers='" + pscCodPers + '\'' +
                ", e0338Codsus='" + e0338Codsus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodsusAndCustomerId that = (CodsusAndCustomerId) o;

        if (pscCodPers != null ? !pscCodPers.equals(that.pscCodPers) : that.pscCodPers != null) return false;
        return e0338Codsus != null ? e0338Codsus.equals(that.e0338Codsus) : that.e0338Codsus == null;

    }

    @Override
    public int hashCode() {
        int result = pscCodPers != null ? pscCodPers.hashCode() : 0;
        result = 31 * result + (e0338Codsus != null ? e0338Codsus.hashCode() : 0);
        return result;
    }
}

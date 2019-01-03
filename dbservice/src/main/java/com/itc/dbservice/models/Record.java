package com.itc.dbservice.models;

import java.io.Serializable;

/**
 * Created by hexad3cimal on 17/12/18.
 */
public class Record implements Serializable {

    private String company;
    private String centercode;
    private String productcode;
    private String contractid;
    private String fee;
    private String productname;
    private String tipopag;
    private String flag1;
    private String flag2;
    private String productcode2;
    private String subproduct;
    private String paconcept;
    private String paestander;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCentercode() {
        return centercode;
    }

    public void setCentercode(String centercode) {
        this.centercode = centercode;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getTipopag() {
        return tipopag;
    }

    public void setTipopag(String tipopag) {
        this.tipopag = tipopag;
    }

    public String getFlag1() {
        return flag1;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    public String getProductcode2() {
        return productcode2;
    }

    public void setProductcode2(String productcode2) {
        this.productcode2 = productcode2;
    }

    public String getSubproduct() {
        return subproduct;
    }

    public void setSubproduct(String subproduct) {
        this.subproduct = subproduct;
    }

    public String getPaconcept() {
        return paconcept;
    }

    public void setPaconcept(String paconcept) {
        this.paconcept = paconcept;
    }

    public String getPaestander() {
        return paestander;
    }

    public void setPaestander(String paestander) {
        this.paestander = paestander;
    }

    @Override
    public String toString() {
        return "Record{" +
                "company='" + company + '\'' +
                ", centercode='" + centercode + '\'' +
                ", productcode='" + productcode + '\'' +
                ", contractid='" + contractid + '\'' +
                ", fee='" + fee + '\'' +
                ", productname='" + productname + '\'' +
                ", tipopag='" + tipopag + '\'' +
                ", flag1='" + flag1 + '\'' +
                ", flag2='" + flag2 + '\'' +
                ", productcode2='" + productcode2 + '\'' +
                ", subproduct='" + subproduct + '\'' +
                ", paconcept='" + paconcept + '\'' +
                ", paestander='" + paestander + '\'' +
                '}';
    }
}

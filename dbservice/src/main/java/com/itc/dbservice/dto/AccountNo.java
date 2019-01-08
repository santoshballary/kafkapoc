package com.itc.dbservice.dto;

/**
 * Created by hexad3cimal on 1/6/19.
 */
public class AccountNo {

    public  AccountNo(String e1243Idctoloc){
        this.e1243Idctoloc = e1243Idctoloc;
    }

    private String e1243Idctoloc;

    public String getE1243Idctoloc() {
        return e1243Idctoloc;
    }

    public void setE1243Idctoloc(String e1243Idctoloc) {
        this.e1243Idctoloc = e1243Idctoloc;
    }

    @Override
    public String toString() {
        return "AccountNo{" +
                "e1243Idctoloc='" + e1243Idctoloc + '\'' +
                '}';
    }
}

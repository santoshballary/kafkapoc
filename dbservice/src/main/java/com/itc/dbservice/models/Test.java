package com.itc.dbservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by hexad3cimal on 7/12/18.
 */

@Entity
@Table(name = "data")
public class Test implements Serializable{
    @Id
    private String dress_id;
    @Column
    private String price;
    @Column
    private String rating;
    @Column
    private String size;
    @Column
    private String season;
    @Column
    private String neckline;
    @Column
    private String sleevelength;

    public String getDress_id() {
        return dress_id;
    }

    public void setDress_id(String dress_id) {
        this.dress_id = dress_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getNeckline() {
        return neckline;
    }

    public void setNeckline(String neckline) {
        this.neckline = neckline;
    }

    public String getSleevelength() {
        return sleevelength;
    }

    public void setSleevelength(String sleevelength) {
        this.sleevelength = sleevelength;
    }
}

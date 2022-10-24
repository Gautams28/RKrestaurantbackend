package com.rkrestaurant.rkrestaurant.Entity.Nasta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "waffer")
public class Waffer {
    @Id
    @Column(name = "wid")
    private int id;
    private int price;
    private String waffertype;

    public Waffer() {
    }

    public Waffer(int id, int price, String waffertype) {
        this.id = id;
        this.price = price;
        this.waffertype = waffertype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWaffertype() {
        return waffertype;
    }

    public void setWaffertype(String waffertype) {
        this.waffertype = waffertype;
    }

}

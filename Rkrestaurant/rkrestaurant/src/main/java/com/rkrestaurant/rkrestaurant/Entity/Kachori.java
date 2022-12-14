package com.rkrestaurant.rkrestaurant.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kachori")
public class Kachori {
    @Column(name = "kid")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int price;
    private String kachoritype;

    public Kachori() {
    }

    public Kachori(int id, int price, String kachoritype) {
        this.id = id;
        this.price = price;
        this.kachoritype = kachoritype;
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

    public String getKachoritype() {
        return kachoritype;
    }

    public void setKachoritype(String kachoritype) {
        this.kachoritype = kachoritype;
    }

}

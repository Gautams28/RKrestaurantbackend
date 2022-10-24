package com.rkrestaurant.rkrestaurant.Entity.Tifin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "launch")
public class Launch {
    @Id
    private int id;
    private int price;
    private String dal;
    private String chawval;
    private String roti;
    private String sabji;
    private String mithai;

    public Launch() {
    }

    public Launch(int id, int price, String dal, String chawval, String roti, String sabji, String mithai) {
        this.id = id;
        this.price = price;
        this.dal = dal;
        this.chawval = chawval;
        this.roti = roti;
        this.sabji = sabji;
        this.mithai = mithai;
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

    public String getDal() {
        return dal;
    }

    public void setDal(String dal) {
        this.dal = dal;
    }

    public String getChawval() {
        return chawval;
    }

    public void setChawval(String chawval) {
        this.chawval = chawval;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getSabji() {
        return sabji;
    }

    public void setSabji(String sabji) {
        this.sabji = sabji;
    }

    public String getMithai() {
        return mithai;
    }

    public void setMithai(String mithai) {
        this.mithai = mithai;
    }

}

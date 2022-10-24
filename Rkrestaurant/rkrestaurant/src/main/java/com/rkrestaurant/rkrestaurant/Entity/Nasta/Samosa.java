package com.rkrestaurant.rkrestaurant.Entity.Nasta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Samosa_type")
public class Samosa {
    @Id
    @Column(name = "sid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int price;
    private String samosa_type;

    public Samosa() {
    }

    public Samosa(int id, int price, String samosa_type) {
        this.id = id;
        this.price = price;
        this.samosa_type = samosa_type;
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

    public String getSamosa_type() {
        return samosa_type;
    }

    public void setSamosa_type(String samosa_type) {
        this.samosa_type = samosa_type;
    }

}

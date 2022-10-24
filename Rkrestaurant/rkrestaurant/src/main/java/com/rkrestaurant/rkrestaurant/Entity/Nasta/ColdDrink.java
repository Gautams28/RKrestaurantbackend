package com.rkrestaurant.rkrestaurant.Entity.Nasta;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Beverages")
public class ColdDrink {
    @Id
    private int id;
    private int price;
    private String drinktype;

    public ColdDrink() {
    }

    public ColdDrink(int id, int price, String drinktype) {
        this.id = id;
        this.price = price;
        this.drinktype = drinktype;
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

    public String getDrinktype() {
        return drinktype;
    }

    public void setDrinktype(String drinktype) {
        this.drinktype = drinktype;
    }
}

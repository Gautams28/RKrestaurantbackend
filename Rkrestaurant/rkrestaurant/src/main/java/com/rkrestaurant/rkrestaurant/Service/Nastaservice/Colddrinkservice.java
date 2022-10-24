package com.rkrestaurant.rkrestaurant.Service.Nastaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rkrestaurant.rkrestaurant.Dao.Nastarepo.colddrinkrepo;
import com.rkrestaurant.rkrestaurant.Entity.Nasta.ColdDrink;

@Component
public class Colddrinkservice {
    @Autowired
    private colddrinkrepo dColddrinkrepo;

    // for getting all items
    public List<ColdDrink> gList() {
        List<ColdDrink> list = (List<ColdDrink>) dColddrinkrepo.findAll();
        return list;
    }

    // get colddrink by price
    public ColdDrink getbyprice(int price) {
        ColdDrink c = null;
        c = dColddrinkrepo.findByprice(price);
        return c;
    }

    // for posting new cold drink

    public ColdDrink aDrink(ColdDrink c) {

        ColdDrink c1 = null;
        c1 = dColddrinkrepo.save(c);
        return c1;

    }

    // for updating existing item

    public ColdDrink updatedrink(ColdDrink c, int id) {
        ColdDrink c1 = null;
        c1 = dColddrinkrepo.save(c);
        return c1;

    }

    // for deleting colddrink from database

    public String deleteitem(int id) {
        dColddrinkrepo.deleteById(id);
        return "your data is deleted";

    }
}

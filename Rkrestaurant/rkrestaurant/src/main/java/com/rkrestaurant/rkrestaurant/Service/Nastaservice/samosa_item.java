package com.rkrestaurant.rkrestaurant.Service.Nastaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rkrestaurant.rkrestaurant.Dao.Nastarepo.Samosarepo;
import com.rkrestaurant.rkrestaurant.Entity.Nasta.Samosa;

import java.util.List;

@Component

public class samosa_item {
    @Autowired
    Samosarepo samosarepo;

    // all item
    public List<Samosa> getall() {
        List<Samosa> list = (List<Samosa>) samosarepo.findAll();
        return list;

    }

    // item according to price
    public Samosa getbyprice(int Price) {
        Samosa s = null;
        s = samosarepo.findByPrice(Price);
        return s;
    }

    // for adding new item
    public Samosa samosa_item1(Samosa s) {
        Samosa sq1 = null;
        sq1 = this.samosarepo.save(s);
        return sq1;
    }

    // for updating existing item
    public Samosa updateSamosa(Samosa s1, int id) {
        Samosa s = null;
        s = samosarepo.save(s1);
        return s;

    }
    // for deleting item from list

    public String DeleteItem(int id) {

        samosarepo.deleteById(id);
        return "your data is deleted";
    }
}

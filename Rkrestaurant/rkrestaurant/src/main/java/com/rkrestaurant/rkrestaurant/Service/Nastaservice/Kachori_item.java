package com.rkrestaurant.rkrestaurant.Service.Nastaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rkrestaurant.rkrestaurant.Dao.kachorirepo;
import com.rkrestaurant.rkrestaurant.Entity.Kachori;

// this is our kachori service 
@Component
public class Kachori_item {
    @Autowired
    kachorirepo Krepo;

    // for getting all kachori type
    public List<Kachori> getalllist() {
        List<Kachori> list = (List<Kachori>) Krepo.findAll();
        return list;

    }

    // get kachori type by price

    public Kachori getbyPrice(int price) {
        Kachori k = null;
        k = Krepo.findByPrice(price);
        return k;
    }

    // for adding the item
    public Kachori addKachoris(Kachori k) {
        Kachori kk = null;
        kk = Krepo.save(k);
        return kk;

    }

    // for updating existing type in kachori

    public Kachori upadateKachori(Kachori k, int id) {
        Kachori k1 = null;
        k1 = Krepo.save(k);
        return k1;

    }

    // for deleting a iteam from Kachori

    public String deleteitem(int id) {

        Krepo.deleteById(id);
        return "your data is deleted";

    }

}

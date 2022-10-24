package com.rkrestaurant.rkrestaurant.Service.Nastaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rkrestaurant.rkrestaurant.Dao.Nastarepo.Wafferrepo;
import com.rkrestaurant.rkrestaurant.Entity.Nasta.Waffer;

@Component
public class waffer_item {
    @Autowired
    Wafferrepo wafferrepo;

    public List<Waffer> getall() {
        List<Waffer> list = (List<Waffer>) wafferrepo.findAll();
        return list;

    }

    // get waffer by id
    public Waffer getbyprice(int price) {

        Waffer w = null;
        w = wafferrepo.getByprice(price);
        return w;
    }

    // for adding new Waffer

    public Waffer addWaffer(Waffer w) {
        Waffer w1 = null;
        w1 = wafferrepo.save(w);
        return w1;

    }

    // for update/put

    public Waffer updateWaffer(Waffer w, int id) {
        Waffer w1 = null;
        w1 = wafferrepo.save(w);
        return w1;
    }

    // for deleting item
    public String deletewaffer(int id) {
        wafferrepo.deleteById(id);
        return "your data is deleted";

    }

}

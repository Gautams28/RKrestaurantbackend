package com.rkrestaurant.rkrestaurant.Service.Nastaservice.Tifinservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rkrestaurant.rkrestaurant.Dao.Tifin.launchrepo;
import com.rkrestaurant.rkrestaurant.Entity.Tifin.Launch;

@Component
public class launchservice {
    @Autowired
    private launchrepo lrepo;

    // for getting all launch item

    public List<Launch> gLaunchs() {
        List<Launch> list = (List<Launch>) lrepo.findAll();
        return list;
    }

    // for getting launch item by price

    public Launch Byprice(int price) {
        Launch l = null;
        l = lrepo.findByprice(price);
        return l;
    }

    // for posting data in database

    public Launch addLaunch(Launch L) {

        Launch l = null;
        l = lrepo.save(L);
        return l;
    }

    // for updating item

    public Launch updateLaunch(Launch ll, int id) {
        Launch l1 = null;
        l1 = lrepo.save(ll);
        return l1;

    }

    // for deleting item from launch

    public String deletelaunch(int id) {
        lrepo.deleteById(id);
        return "your data is deleted";

    }
}

package com.rkrestaurant.rkrestaurant.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rkrestaurant.rkrestaurant.Entity.Nasta.Waffer;
import com.rkrestaurant.rkrestaurant.Service.Nastaservice.waffer_item;
import org.springframework.web.bind.annotation.PutMapping;

// handler for Waffer 
@RestController
public class controller_3 {
    @Autowired
    waffer_item wItem;

    // get all Waffer
    @GetMapping("/waffer")
    public List<Waffer> getallWaffer() {

        return wItem.getall();
    }

    // getting waffer by price
    @GetMapping("/waffer/{price}")
    public Waffer GETBYPrice(@PathVariable("price") int price) {

        return wItem.getbyprice(price);
    }

    // for adding new wafferr
    @PostMapping("/waffer")
    public Waffer postWaffer(@RequestBody Waffer w) {
        return wItem.addWaffer(w);

    }

    // for updating waffer
    @PutMapping(value = "/waffer/{id}")
    public Waffer PutWaffer(@RequestBody Waffer waffer, @PathVariable("id") int id) {
        return wItem.updateWaffer(waffer, id);

    }

    // for deleting waffer
    @DeleteMapping("/waffer/{id}")
    public String Deleteitem(@PathVariable("id") int id) {
        return wItem.deletewaffer(id);

    }

}

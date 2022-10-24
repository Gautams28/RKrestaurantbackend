package com.rkrestaurant.rkrestaurant.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.rkrestaurant.rkrestaurant.Entity.Kachori;
import com.rkrestaurant.rkrestaurant.Service.Nastaservice.Kachori_item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// handler for handling Kachori request
@RestController
public class controller_2 {
    @Autowired
    Kachori_item kItem;

    // handler for getting all kachori type
    @GetMapping("/kachori")
    public List<Kachori> Alltype() {
        return kItem.getalllist();
    }

    // geeting kachori by price
    @GetMapping("/kachori/{price}")
    public Kachori GETByprice(@PathVariable("price") int price) {
        return kItem.getbyPrice(price);
    }

    // for adding item
    @PostMapping(value = "/kachori")
    public Kachori addKachoris(@RequestBody Kachori k) {

        return kItem.addKachoris(k);
    }

    // for updating existing detail of Kachori

    @PutMapping("/kachori/{id}")
    public Kachori updateKachori(@RequestBody Kachori k, @PathVariable("id") int id) {
        return kItem.upadateKachori(k, id);
    }

    // for deleting item
    @DeleteMapping("/kachori/{id}")
    public String deleteKachori(@PathVariable("id") int id) {
        return kItem.deleteitem(id);

    }

}

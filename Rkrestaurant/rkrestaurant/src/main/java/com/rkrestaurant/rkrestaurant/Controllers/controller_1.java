package com.rkrestaurant.rkrestaurant.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rkrestaurant.rkrestaurant.Entity.Nasta.Samosa;
import com.rkrestaurant.rkrestaurant.Service.Nastaservice.samosa_item;

// controller for handling samosa request 
@RestController
public class controller_1 {
    @Autowired
    samosa_item sItem;

    // get all item

    @GetMapping("/samosa")
    public List<Samosa> getallitem() {
        return sItem.getall();
    }

    // get item by price
    @GetMapping("/samosa/{price}")
    public Samosa getbyPrice(@PathVariable("price") int Price) {
        return sItem.getbyprice(Price);
    }

    // handler for adding new item in database
    @PostMapping("/samosa")
    public Samosa order(@RequestBody Samosa ss) {
        return sItem.samosa_item1(ss);
    }

    // handler for updating item

    @PutMapping("/samosa/{id}")
    public Samosa Updateitem(@RequestBody Samosa s, @PathVariable("id") int id) {

        return sItem.updateSamosa(s, id);

    }

    // for deleting item from samosa
    @DeleteMapping("/samosa/{id}")
    public String deleteitem(@PathVariable("id") int id) {
        return sItem.DeleteItem(id);
    }

}

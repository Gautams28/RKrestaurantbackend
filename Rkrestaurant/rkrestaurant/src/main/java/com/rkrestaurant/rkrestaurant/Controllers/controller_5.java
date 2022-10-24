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

import com.rkrestaurant.rkrestaurant.Entity.Tifin.Launch;
import com.rkrestaurant.rkrestaurant.Service.Nastaservice.Tifinservice.launchservice;

@RestController
public class controller_5 {
    // for posting data in database
    @Autowired
    private launchservice Lservice;

    // for getting all item
    @GetMapping("/launch")
    public List<Launch> getall() {

        return Lservice.gLaunchs();
    }

    // get by price
    @GetMapping("/launch/{price}")
    public Launch getbyprice(@PathVariable int price) {

        return Lservice.Byprice(price);
    }

    // for posting item
    @PostMapping(value = "/launch")
    public Launch postlLaunch(@RequestBody Launch l) {
        return Lservice.addLaunch(l);

    }

    // for update / put
    @PutMapping("/launch/{id}")
    public Launch putlaunch(@RequestBody Launch l, @PathVariable("id") int id) {
        return Lservice.updateLaunch(l, id);
    }

    @DeleteMapping("/launch/{id}")
    public String dlaunch(@PathVariable("id") int id) {

        return Lservice.deletelaunch(id);
    }
}

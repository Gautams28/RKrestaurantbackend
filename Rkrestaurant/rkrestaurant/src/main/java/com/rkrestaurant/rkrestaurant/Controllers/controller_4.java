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

import com.rkrestaurant.rkrestaurant.Entity.Nasta.ColdDrink;
import com.rkrestaurant.rkrestaurant.Service.Nastaservice.Colddrinkservice;

@RestController
public class controller_4 {
    @Autowired
    private Colddrinkservice colddrinkservice;

    // for getting all drinks
    @GetMapping("/haveadrink")
    public List<ColdDrink> GEtall() {

        return colddrinkservice.gList();
    }

    // get colddrink by price
    @GetMapping("/haveadrink/{price}")
    public ColdDrink Byprice(@PathVariable("price") int price) {
        return colddrinkservice.getbyprice(price);
    }

    // for posting new colddrink
    @PostMapping("/haveadrink")
    public ColdDrink adddrink(@RequestBody ColdDrink C) {

        return colddrinkservice.aDrink(C);

    }

    // for updating existing item/put operation
    @PutMapping("/haveadrink/{id}")
    public ColdDrink putitem(@RequestBody ColdDrink C1, @PathVariable("id") int id) {
        return colddrinkservice.updatedrink(C1, id);

    }

    // for deleting item from database
    @DeleteMapping("/haveadrink/{id}")
    public String ditem(@PathVariable("id") int id)

    {

        return colddrinkservice.deleteitem(id);
    }

}

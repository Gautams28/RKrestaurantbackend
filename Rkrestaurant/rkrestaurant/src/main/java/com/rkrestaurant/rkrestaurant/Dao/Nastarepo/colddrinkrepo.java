package com.rkrestaurant.rkrestaurant.Dao.Nastarepo;

import org.springframework.data.repository.CrudRepository;

import com.rkrestaurant.rkrestaurant.Entity.Nasta.ColdDrink;

public interface colddrinkrepo extends CrudRepository<ColdDrink, Integer> {

    public ColdDrink findByprice(int price);

}

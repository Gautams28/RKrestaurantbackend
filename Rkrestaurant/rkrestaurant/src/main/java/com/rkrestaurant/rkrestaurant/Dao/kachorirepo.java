package com.rkrestaurant.rkrestaurant.Dao;

import org.springframework.data.repository.CrudRepository;

import com.rkrestaurant.rkrestaurant.Entity.Kachori;

public interface kachorirepo extends CrudRepository<Kachori, Integer> {

    public Kachori findByPrice(int price);

}

package com.rkrestaurant.rkrestaurant.Dao.Nastarepo;

import org.springframework.data.repository.CrudRepository;

import com.rkrestaurant.rkrestaurant.Entity.Nasta.Samosa;

public interface Samosarepo extends CrudRepository<Samosa, Integer> {
    public Samosa findByPrice(int price);

}

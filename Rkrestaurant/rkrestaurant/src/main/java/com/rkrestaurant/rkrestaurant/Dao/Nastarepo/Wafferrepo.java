package com.rkrestaurant.rkrestaurant.Dao.Nastarepo;

import org.springframework.data.repository.CrudRepository;

import com.rkrestaurant.rkrestaurant.Entity.Nasta.Waffer;

public interface Wafferrepo extends CrudRepository<Waffer, Integer> {

    public Waffer getByprice(int price);

}

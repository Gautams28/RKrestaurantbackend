package com.rkrestaurant.rkrestaurant.Dao.Tifin;

import org.springframework.data.repository.CrudRepository;

import com.rkrestaurant.rkrestaurant.Entity.Tifin.Launch;

public interface launchrepo extends CrudRepository<Launch, Integer> {

    public Launch findByprice(int price);

}

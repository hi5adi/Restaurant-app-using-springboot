package com.hi5adii.demos.restaurant.controller;

import com.hi5adii.demos.restaurant.Model.Restaurant;
import com.hi5adii.demos.restaurant.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AppController
{
    @Autowired
    RestaurantRepo repository;

    //get all restaurant
    @GetMapping("restaurants")
    public List<Restaurant> getRestaurants()
    {
        return (List<Restaurant>) repository.findAll();
    }

    // save restaurant
    @PostMapping("restaurants")
    public Restaurant saveRestaurant(@RequestBody Restaurant restaurant)
    {
        return repository.save(restaurant);
    }

    //Delete restaurant
    @DeleteMapping("restaurants")
    public String deleteRestaurant(@RequestBody Restaurant restaurant)
    {
        repository.delete(restaurant);
        return "Restaurant deleted";
    }
}

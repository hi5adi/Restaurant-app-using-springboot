package com.hi5adii.demos.restaurant.Repository;

import com.hi5adii.demos.restaurant.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepo extends CrudRepository<Restaurant, Integer>
{

}

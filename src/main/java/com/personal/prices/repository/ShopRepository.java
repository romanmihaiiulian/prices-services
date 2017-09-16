package com.personal.prices.repository;

import com.personal.prices.model.Item;
import com.personal.prices.model.Shop;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ShopRepository extends ReactiveMongoRepository<Shop, String> {
}

package com.personal.prices.repository;

import com.personal.prices.model.Category;
import com.personal.prices.model.Shop;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}

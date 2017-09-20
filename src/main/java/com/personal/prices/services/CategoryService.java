package com.personal.prices.services;

import com.personal.prices.model.Category;
import com.personal.prices.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Flux<Category> all() {
        return this.categoryRepository.findAll();
    }

    public Mono<Category> findById(String id) {
        return this.categoryRepository.findById(id);
    }

    public Mono<Category> save(Category category) {
        return this.categoryRepository.save(category);
    }
}

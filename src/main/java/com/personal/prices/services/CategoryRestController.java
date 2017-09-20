package com.personal.prices.services;

import com.personal.prices.model.Category;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/category")
public class CategoryRestController {

    private final CategoryService categoryService;


    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    Flux<Category> findAll() {
        return categoryService.all();
    }

    @GetMapping("/{id}")
    Mono<Category> findById(@PathVariable String id) {
        return categoryService.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Mono<Category> save(@RequestBody Category category) {
        return categoryService.save(category);
    }
}

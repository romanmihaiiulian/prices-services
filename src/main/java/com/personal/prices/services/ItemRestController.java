package com.personal.prices.services;

import com.personal.prices.model.Item;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/item")
public class ItemRestController {

    private final ItemService itemService;

    public ItemRestController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    Flux<Item> findAll() {
        return itemService.all();
    }

    @GetMapping("/{id}")
    Mono<Item> findById(@PathVariable String id) {
        return itemService.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Mono<Item> insert(@RequestBody Item item) {
        return itemService.save(item);
    }

}

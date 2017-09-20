package com.personal.prices.services;

import com.personal.prices.model.Shop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/shop")
public class ShopRestController {

    private final ShopService shopService;

    public ShopRestController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    Flux<Shop> findAll() {
        return shopService.all();
    }

    @GetMapping("/{id}")
    Mono<Shop> findById(@PathVariable String id) {
        return shopService.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Mono<Shop> save(@RequestBody Shop shop) {
        return shopService.save(shop);
    }

}

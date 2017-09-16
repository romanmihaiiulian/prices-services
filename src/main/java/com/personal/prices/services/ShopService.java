package com.personal.prices.services;

import com.personal.prices.model.Shop;
import com.personal.prices.repository.ShopRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public Flux<Shop> all() {
        return this.shopRepository.findAll();
    }

    public Mono<Shop> findById(String id) {
        return this.shopRepository.findById(id);
    }

    public Mono<Shop> save(Shop shop){
        return this.shopRepository.insert(shop);
    }
}

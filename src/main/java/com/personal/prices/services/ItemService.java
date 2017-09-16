package com.personal.prices.services;

import com.personal.prices.model.Item;
import com.personal.prices.repository.ItemRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Flux<Item> all() {
        return this.itemRepository.findAll();
    }

    public Mono<Item> findById(String id) {
        return this.itemRepository.findById(id);
    }

    public Mono<Item> save(Item item){
        return this.itemRepository.insert(item);
    }
}

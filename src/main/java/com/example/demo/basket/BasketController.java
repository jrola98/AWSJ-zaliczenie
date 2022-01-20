package com.example.demo.basket;


import com.example.demo.basket.model.Basket;
import com.example.demo.basket.repository.BasketRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@RestController
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    private BasketRepository basketRepository;

    @RequestMapping(method = GET)
    public List<Basket> getBaskets() {
        log.info("Return all Baskets.");
        return basketRepository.findAll();
    }

    @RequestMapping(value = "/{uuid}", method = GET)
    public Basket getBasket(@PathVariable("uuid") String uuid) {
        log.info("Get Basket with uuid: {}", uuid);
        return basketRepository.findByUserUuid(UUID.fromString(uuid));
    }

}

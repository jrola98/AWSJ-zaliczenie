package com.example.demo.basket.repository;

import com.example.demo.basket.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BasketRepository extends JpaRepository<Basket, Long> {

    @Override
    List<Basket> findAll();

    Basket findByUserUuid(UUID uuid);
}

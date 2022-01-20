package com.example.demo.basket.model;

import com.example.demo.product.model.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "id"})
@Entity
@Data
@AllArgsConstructor
public class Basket {

    public Basket() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "user_uuid")
    private UUID userUuid;

    @ManyToMany
    @JoinTable(
            name = "productinbasket",
            joinColumns = @JoinColumn(name = "basket_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;
}

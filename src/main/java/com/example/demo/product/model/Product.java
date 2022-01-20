package com.example.demo.product.model;

import com.example.demo.status.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "id"})
@Entity
@Data
@AllArgsConstructor
public class Product {

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "votes")
    private int votes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;
}

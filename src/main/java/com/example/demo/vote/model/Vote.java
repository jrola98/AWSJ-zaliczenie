package com.example.demo.vote.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "id"})
@Entity
@Data
@AllArgsConstructor
public class Vote {

    public Vote() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "product_id")
    private long productId;

    @Column(name = "vote")
    private int vote;
}

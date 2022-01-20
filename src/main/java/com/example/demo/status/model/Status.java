package com.example.demo.status.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "id"})
@Entity
@Data
@AllArgsConstructor
public class Status {

    public Status() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
}

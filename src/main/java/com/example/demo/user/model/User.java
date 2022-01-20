package com.example.demo.user.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "id"})
@Entity
@Table(name = "user", schema = "public")
@Data
@AllArgsConstructor
public class User {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "uuid")
    private UUID uuid;
}

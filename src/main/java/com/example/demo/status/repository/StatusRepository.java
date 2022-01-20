package com.example.demo.status.repository;

import com.example.demo.status.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
    @Override
    List<Status> findAll();

    @Override
    Status getById(Long aLong);

}

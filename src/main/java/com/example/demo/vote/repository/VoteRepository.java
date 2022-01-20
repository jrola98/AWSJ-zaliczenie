package com.example.demo.vote.repository;

import com.example.demo.vote.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    @Override
    <S extends Vote> S save(S entity);
}

package com.capgemini.dance.sets.repository;

import com.capgemini.dance.sets.entity.Sets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SetsRepository extends JpaRepository<Sets, Long> {
    Sets findBySetsId(Long setsId); //TODO Does this work?
    List<Sets> findBySetsName(String name);
    List<Sets> findAll(); //TODO Can you just pass a command like this?
}


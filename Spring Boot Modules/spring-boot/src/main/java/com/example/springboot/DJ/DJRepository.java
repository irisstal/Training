package com.example.springboot.DJ;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DJRepository
        extends JpaRepository<DJ, Long> {}


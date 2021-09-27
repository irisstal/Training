package com.capgemini.dance.dj.repository;

import com.capgemini.dance.dj.entity.DJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DJRepository extends JpaRepository<DJ, Long> {}


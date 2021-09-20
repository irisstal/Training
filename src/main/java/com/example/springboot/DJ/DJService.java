package com.example.springboot.DJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DJService {

    private final DJRepository djRepository;

    @Autowired
    public DJService(DJRepository djRepository) {
        this.djRepository = djRepository;
    }

    public List<DJ> GetDJs() {
        return djRepository.findAll();
    }

    public void addNewDJ(DJ dj) {
        System.out.println(dj);
    }
}

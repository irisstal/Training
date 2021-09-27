package com.capgemini.dance.sets;

import com.capgemini.dance.sets.entity.Sets;
import com.capgemini.dance.sets.repository.SetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SetsService {
    private final SetsRepository setsRepository;

    @Autowired
    public SetsService(SetsRepository setsRepository) {
        this.setsRepository = setsRepository; //TODO Should I add a test to the app like the snippet?
    }

    public List<Sets> getSets() {
        return setsRepository.findAll();
    }

    public void addNewSet(Sets sets) {
        System.out.println(sets);
    }

    public Sets getOneSet(Long setId) {
        return setsRepository.getById(setId);
    }

}

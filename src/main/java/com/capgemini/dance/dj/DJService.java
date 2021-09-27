package com.capgemini.dance.dj;

import com.capgemini.dance.dj.entity.DJ;
import com.capgemini.dance.dj.repository.DJRepository;
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

    public List<DJ> getDJs() {
        return djRepository.findAll();
    }

    public void addNewDJ(DJ dj) {
        System.out.println(dj);
    }

    public DJ getOneDj(Long dj_Id) {
        return djRepository.getById(dj_Id);
    }

}

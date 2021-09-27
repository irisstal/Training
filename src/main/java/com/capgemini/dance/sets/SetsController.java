package com.capgemini.dance.sets;

import com.capgemini.dance.sets.entity.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/sets")
public class SetsController {

    private final SetsService setsService;

    @Autowired
    public SetsController(SetsService setsService) {
        this.setsService = setsService;
    }

    @GetMapping // Get all sets in list
    public List<Sets> GetSets() {
        return setsService.getSets();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Sets get(@PathVariable Long setId) {
        return setsService.getOneSet(setId);
    }

    @PostMapping //
    @ResponseStatus(HttpStatus.CREATED)
    public void registerNewSet(@RequestBody Sets set){
        setsService.addNewSet(set);
    }


}

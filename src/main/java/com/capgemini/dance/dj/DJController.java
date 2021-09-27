package com.capgemini.dance.dj;

import com.capgemini.dance.dj.entity.DJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/djs")
public class DJController {

    private final DJService djService;

    @Autowired
    public DJController(DJService djService) {
        this.djService = djService;
    }

    @GetMapping // Get all djs in table
    public List<DJ> GetDJs() {
        return djService.getDJs();
    }

    @GetMapping
    @RequestMapping("{id}")
    public DJ get(@PathVariable Long dj_Id) {
        return djService.getOneDj(dj_Id);
    }

    @PostMapping //
    @ResponseStatus(HttpStatus.CREATED)
    public void registerNewDJ(@RequestBody DJ dj){
        djService.addNewDJ(dj);
    }

    public void createReview(){}


}

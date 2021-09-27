package com.capgemini.dance.sets.entity;

import javax.persistence.*;

import com.capgemini.dance.dj.entity.DJ;

import java.util.List;

@Entity
@Table(name = "Set")
public class Sets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long setsId;
    private String setsName;

//    @ManyToMany(mappedBy = "sets")
//    private List<DJ> djs;

    public Sets() {

    }

    public Long getSetsId() {
        return setsId;
    }

    public void setSetsId(Long setsId) {
        this.setsId = setsId;
    }

    public String getSetsName() {
        return setsName;
    }

    public void setSetsName(String setsName) {
        this.setsName = setsName;
    }

//    public List<Sets> getSets() {
//        return sets;
//    }
//
//    public void setSets(List<DJ> djs) {
//        this.sets = sets;
//    }

}

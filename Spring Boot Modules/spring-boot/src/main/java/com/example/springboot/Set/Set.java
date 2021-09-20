package com.example.springboot.Set;

import javax.persistence.*;

import com.example.springboot.DJ.*;

import java.util.List;

@Entity
public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long setId;
    private String setName;

    @ManyToMany
    private List<DJ> djs;

    public Set() {
    }

    public Long getSetId() {
        return setId;
    }

    public void setSetId(Long setId) {
        this.setId = setId;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public List<DJ> getDjs() {
        return djs;
    }

    public void setDjs(List<DJ> djs) {
        this.djs = djs;
    }

}

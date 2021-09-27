package com.capgemini.dance.dj.entity;

import com.capgemini.dance.sets.entity.Sets;

import javax.persistence.*;
import java.util.List;

@Entity
public class DJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long djId;
    private String name;
    private Integer age;
    private String style;

    @ManyToMany //Mapped by tussen quotes.
    @JoinTable(
            name = "djs_sets",
            joinColumns = @JoinColumn(name = "djId"),
            inverseJoinColumns = @JoinColumn(name="setId")
    )
    private List<Sets> sets;

    public DJ() { // No-argument constructor
    }

    public DJ(Long djId, // Methods with parameters
              String name,
              Integer age,
              String style) {
        this.djId = djId;
        this.name = name;
        this.age = age;
        this.style = style;
    }

    public DJ(String name, //Method without Id (database will construct one for us)
              Integer age,
              String style) {
        this.name = name;
        this.age = age;
        this.style = style;
    }

    public Long getDjId() {
        return djId;
    }

    public void setDjId(Long djId) {
        this.djId = djId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<Sets> getSets() {
        return sets;
    }

    public void setSets(List<Sets> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "DJ{" +
                "dj_Id=" + djId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", style='" + style + '\'' +
                '}';
    }
}

package com.example.springboot.DJ;

import com.example.springboot.Set.Set;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class DJ {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long dj_Id;
    private String name;
    private Integer age;
    private String style;

    @ManyToMany(mappedBy = "djs") //Mapped by tussen quotes.
    private List<Set> sets;

    public DJ() { // No-argument constructor
    }

    public DJ(Long dj_Id, // Methods with parameters
              String name,
              Integer age,
              String style) {
        this.dj_Id = dj_Id;
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

    public Long getDj_Id() {
        return dj_Id;
    }

    public void setDj_Id(Long dj_Id) {
        this.dj_Id = dj_Id;
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

    public List<Set> getSets() {
        return sets;
    }

    public void setSets(List<Set> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "DJ{" +
                "dj_Id=" + dj_Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", style='" + style + '\'' +
                '}';
    }
}

package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "carCategory")
    Set<Car> cars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}

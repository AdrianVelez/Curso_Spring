package com.example.laptop.entities;


import jakarta.persistence.*;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "model")
    String model;

    @Column(name = "branch")
    String branch;

    @Column(name = "size")
    Double size;

    public Laptop() {
    }

    public Laptop(Long id, String model, String branch, Double size){
        this.id = id;
        this.branch = branch;
        this.size = size;
        this.model=model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}

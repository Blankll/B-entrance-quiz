package com.thoughtworks.capability.gtb.entrancequiz.entities;
//TODO GTB-知识点: * Hero.java:2 了解下Lombok
public class Hero {
    private Integer id;
    private String name;

    public Hero() {}
    public Hero(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

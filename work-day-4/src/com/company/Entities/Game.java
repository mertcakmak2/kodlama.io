package com.company.Entities;

public class Game {

    private int id;
    private String name;

    public Game(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Game() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

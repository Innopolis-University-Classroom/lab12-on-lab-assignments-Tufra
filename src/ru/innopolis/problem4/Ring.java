package ru.innopolis.problem4;

public class Ring implements Item{
    private String name;

    public Ring(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

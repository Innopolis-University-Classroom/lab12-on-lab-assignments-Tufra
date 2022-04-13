package ru.innopolis.problem4;

public class Sword implements Item{
    private String name;

    public Sword(String name) {
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

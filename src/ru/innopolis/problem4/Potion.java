package ru.innopolis.problem4;

public class Potion implements Item{
    private String name;

    public Potion(String name) {
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

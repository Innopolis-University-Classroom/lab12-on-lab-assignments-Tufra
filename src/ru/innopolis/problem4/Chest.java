package ru.innopolis.problem4;

import java.util.ArrayList;
import java.util.List;

public class Chest {

    private List<Item> items;
    private Iterator iterator;

    public Chest(List<Item> items) {
        this.items = items;
        iterator = new Iterator(0, this, null);
    }

    public Chest() {
        items = new ArrayList<>();
        iterator = new Iterator(0, this, null);
    }

    public Iterator getIteratorByType(Class<?> type) {
        iterator = new Iterator(0, this, type);
        return iterator;
    }

    public Iterator getIterator() {
        return iterator;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void insert(Item item) {
        items.add(item);
    }

}

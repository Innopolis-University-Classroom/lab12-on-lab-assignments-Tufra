package ru.innopolis.problem4;

import java.util.Optional;

public class Iterator {
    private int position;
    private Class<?> type = null;
    private final Chest collection;

    public Iterator(int position, Chest collection, Class<?> type) {
        this.position = position;
        this.collection = collection;
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean hasNext() {
        return position < collection.getItems().size();
    }

    public Optional<Item> next() {
        if (type == null) {
            if (hasNext()) {
                Item elem = collection.getItems().get(position);
                position++;
                return Optional.of(elem);
            }
        } else {
            while (hasNext() && !collection.getItems().get(position).getClass().equals(type)) {
                position++;
            }
            if (hasNext()) {
                Item elem = collection.getItems().get(position);
                position++;
                return Optional.of(elem);
            }
        }
        return Optional.empty();
    }
}

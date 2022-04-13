package ru.innopolis.problem4;
// your solution here
//fix all the errors including package errors

import java.util.Optional;

public class problem4 {
    public static void main(String[] args) {
        Chest chest = new Chest();
        chest.insert(new Ring("a"));
        chest.insert(new Ring("b"));
        chest.insert(new Ring("c"));
        chest.insert(new Sword("aa"));
        chest.insert(new Sword("bb"));
        chest.insert(new Potion("aaa"));

        Iterator iter = chest.getIterator();

        while (iter.hasNext()) {
            iter.next().ifPresent((el) -> System.out.println(el.getName()));
        }

        iter = chest.getIteratorByType(Ring.class);
        while (iter.hasNext()) {
            iter.next().ifPresent((el) -> System.out.println(el.getName()));
        }
    }
}

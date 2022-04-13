package ru.innopolis.problem1;

public class Logger implements Chain {
    private Chain next;
    private String target;

    public Logger(String target) {
        this.target = target;
    }

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }

    @Override
    public void perform() {
        System.out.println("write to " + target);
        if (next != null) {
            next.perform();
        }
    }
}

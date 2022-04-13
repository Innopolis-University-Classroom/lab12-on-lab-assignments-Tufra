package ru.innopolis.problem3;

public class OrcSoldier implements Orc{
    private Orc next;

    @Override
    public void to(Orc target) {
        this.next = target;
    }

    @Override
    public void command(String command) {
        System.out.println("command to soldier " + command);
        if (next != null) {
            next.command(command);
        }
    }
}

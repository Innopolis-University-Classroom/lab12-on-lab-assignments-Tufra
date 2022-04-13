package ru.innopolis.problem3;
// your solution here
//fix all the errors including package errors

public class problem3 {
    public static void main(String[] args) {
        Orc commander = new OrcCommander();
        Orc officer = new OrcOfficer();
        Orc soldier = new OrcSoldier();

        commander.to(officer);
        officer.to(soldier);

        commander.command("auf");
    }
}

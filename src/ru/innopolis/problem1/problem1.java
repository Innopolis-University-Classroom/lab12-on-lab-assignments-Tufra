package ru.innopolis.problem1;
// your solution here
//fix all the errors including package errors


public class problem1 {
    public static void main(String[] args) {
        Chain ch1 = new Logger("File");
        Chain ch2 = new Logger("Console");
        Chain ch3 = new Logger("Server");

        ch1.setNext(ch2);
        ch2.setNext(ch3);

        ch1.perform();
    }
}

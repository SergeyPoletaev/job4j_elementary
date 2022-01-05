package ru.job4j.condition;

public class Cinema {

    public static void access(int age) {
        System.out.println("The age of the customer is: " + age);
        int ageOfAccess = 20;
        if (age >= ageOfAccess) {
            System.out.println("Welcome to the cinema!");
        } else {
            System.out.println("It is not for you...");
        }
    }

    public static void main(String[] args) {
        Cinema.access(18);
        Cinema.access(21);
        Cinema.access(20);
    }
}

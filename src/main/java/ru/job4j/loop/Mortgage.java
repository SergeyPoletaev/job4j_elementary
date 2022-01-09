package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        double debt = amount;
        int year = 0;
        while (debt > 0) {
            debt = debt + (debt * percent) / 100 - salary;
            year++;
        }
        return year;
    }
}

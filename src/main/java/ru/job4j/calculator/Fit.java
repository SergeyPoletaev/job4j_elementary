package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womenWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 183;
        double man = Fit.manWeight(height);
        double women = Fit.womenWeight(height);
        System.out.println("Man " + height + " is " + man);
        System.out.println("Women " + height + " is " + women);
    }
}

package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6.0, 2.0);
        System.out.println(" p = 6.0, k = 2.0, s = 2.0, real = " + result);
    }
}

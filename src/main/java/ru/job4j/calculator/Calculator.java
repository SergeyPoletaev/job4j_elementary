package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int minus(int num) {
        return num - x;
    }

    public static int sum(int num) {
        return num + x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int multiple(int num) {
        return num * x;
    }

    public int sumAllOperation(int num) {
        return minus(num) + sum(num) + divide(num) + multiple(num);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sum = one + two;
        int div = six / two;
        int diff = five - two;
        int multiple = four * two;
        System.out.println(sum);
        System.out.println(div);
        System.out.println(diff);
        System.out.println(multiple);
        System.out.println();
        System.out.println(minus(one));
        System.out.println(sum(two));
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(five));
        System.out.println(calculator.multiple(four));
        System.out.println(calculator.sumAllOperation(five));
    }
}

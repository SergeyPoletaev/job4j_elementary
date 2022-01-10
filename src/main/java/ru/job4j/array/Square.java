package ru.job4j.array;

public class Square {

    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < bound; i++) {
            rsl[i] = i * i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = Square.calculate(4);
        for (var el : array) {
            System.out.println(el);
        }
    }
}

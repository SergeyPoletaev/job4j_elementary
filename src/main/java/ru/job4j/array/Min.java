package ru.job4j.array;

public class Min {

    public static int min(int[] array) {
        int min = 0;
        for (int k : array) {
            if (min > k) {
                min = k;
            }
        }
        return min;
    }
}

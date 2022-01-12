package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int[] coins = {10, 5, 2, 1};
        int diff = money - price;
        int count = 0;
        for (int coin : coins) {
            while (diff >= coin) {
                diff -= coin;
                rsl[count++] = coin;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}

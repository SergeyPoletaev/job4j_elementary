package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
  private final int[] COINS = {10, 5, 2, 1};

  public int[] change2(int money, int price) {
    int[] rsl = new int[100];
    int size = 0;
    int k = 0;
    for (int i = 0; i < rsl.length; i++) {
      while ((money - price) - COINS[k] >= 0) {
        rsl[size] = COINS[k];
        money = money - COINS[k];
        size++;
      }
      if (k < COINS.length - 1) {
        k++;
      }
    }
    return Arrays.copyOf(rsl, size);
  }

  public int[] change(int money, int price) {
    int[] rsl = new int[100];
    int size = 0;
    int delta = money - price;
    for (int coin : COINS) {
      while (delta >= coin) {
        delta = delta - coin;
        rsl[size] = coin;
        size++;
      }
    }
    return Arrays.copyOf(rsl, size);
  }
}
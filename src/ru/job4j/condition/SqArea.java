package ru.job4j.condition;

public class SqArea {
  public static double square(int p, int k) {
    int h = p / (2 * (k + 1));
    int L = h * k;
    return L * h;
  }

  public static void main(String[] args) {
    int p = 6;
    int k = 2;
    System.out.println("p = " + p + ", k = " + k +", real = " + SqArea.square(p, k));
  }
}

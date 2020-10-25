package ru.job4j.converter;

public class Converter {
  public static int rubleToEuro(int value) {
    return value / 70;
  }

  public static int rubleToDollar(int value) {
    return value / 60;
  }

  public static boolean testRubleToEuro(int in, int expected) {
    int out = Converter.rubleToEuro(in);
    return expected == out;
  }

  public static boolean testRubleToDollar(int in, int expected) {
    int out = Converter.rubleToDollar(in);
    return expected == out;
  }

  public static void main(String[] args) {
    int rubles = 500;
    System.out.println(rubles + " rubles are " + Converter.rubleToEuro(rubles) + " euro. Test result : "
            + testRubleToEuro(rubles, 7));
    System.out.println(rubles + " rubles are " + Converter.rubleToDollar(rubles) + " dollars. Test result : "
            + testRubleToDollar(rubles, 8));
  }
}

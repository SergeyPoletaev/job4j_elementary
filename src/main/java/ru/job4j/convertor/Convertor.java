package ru.job4j.convertor;

public class Convertor {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Convertor.rubleToEuro(125);
        float dollar = Convertor.rubleToDollar(250);
        System.out.println("125 rubles are " + euro + " euro");
        System.out.println("250 rubles are " + dollar + " dollars");

        float in = 112F;
        float expected = 1.8666667F;
        float out = Convertor.rubleToDollar(in);
        boolean passed = out == expected;
        System.out.println("112 rubles are 1.8666667. Test result: " + passed);
    }
}

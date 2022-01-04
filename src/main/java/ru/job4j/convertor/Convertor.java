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

        float inDollConv = 112F;
        float expectedDollConv = 1.8666667F;
        float outDollConv = Convertor.rubleToDollar(inDollConv);
        boolean passedDollConv = outDollConv == expectedDollConv;
        System.out.println("112 rubles are 1.8666667. Test result: " + passedDollConv);

        float inEuroConv = 140F;
        float expectedEuroConv = 2F;
        float outEuroConv = Convertor.rubleToEuro(inEuroConv);
        boolean passedEuroConv = expectedEuroConv == outEuroConv;
        System.out.println("140 rubles are 2. Test result : " + passedEuroConv);
    }
}

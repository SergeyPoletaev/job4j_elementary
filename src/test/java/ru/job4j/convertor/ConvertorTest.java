package ru.job4j.convertor;

import org.junit.Assert;
import org.junit.Test;

public class ConvertorTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        float in = 140F;
        float expected = 2F;
        float esp = 0.0001F;
        float out = Convertor.rubleToEuro(in);
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert115RubleThen1Dot6428Euro() {
        float in = 115F;
        float expected = 1.6428F;
        float esp = 0.0001F;
        float out = Convertor.rubleToEuro(in);
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert0RubleThen0Euro() {
        float in = 0F;
        float expected = 0F;
        float esp = 0.0001F;
        float out = Convertor.rubleToEuro(in);
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert120RubleThen2Dollar() {
        float in = 120F;
        float expected = 2F;
        float esp = 0.0001F;
        float out = Convertor.rubleToDollar(in);
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert121RubleThen2Dot0166Dollar() {
        float in = 121F;
        float expected = 2.0166F;
        float esp = 0.0001F;
        float out = Convertor.rubleToDollar(in);
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert0RubleThen0Dollar() {
        float in = 0F;
        float expected = 0F;
        float esp = 0.0001F;
        float out = Convertor.rubleToDollar(in);
        Assert.assertEquals(expected, out, esp);
    }
}
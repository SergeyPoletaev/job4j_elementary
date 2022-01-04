package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180ThenWeight92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomen180ThenWeight80Dot5() {
        short in = 180;
        double expected = 80.5;
        double out = Fit.womenWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
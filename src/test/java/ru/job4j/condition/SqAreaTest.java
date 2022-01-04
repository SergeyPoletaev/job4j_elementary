package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP10K4ThenSquare4() {
        double p = 10;
        double k = 4;
        double expected = 4;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP6K2ThenSquare2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP10Dot5K3Dot2ThenSquare5() {
        double p = 10.5;
        double k = 3.2;
        double expected = 5;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}
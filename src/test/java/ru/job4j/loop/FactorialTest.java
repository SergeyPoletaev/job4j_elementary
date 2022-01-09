package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int rsl = Factorial.calc(in);
        int exp = 120;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int rsl = Factorial.calc(in);
        int exp = 1;
        Assert.assertEquals(exp, rsl);
    }
}
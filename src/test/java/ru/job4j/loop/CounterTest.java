package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void when0To5ThenSum15() {
        int start = 0;
        int finish = 5;
        int rsl = Counter.sum(start, finish);
        int exp = 15;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void when3To3ThenSum3() {
        int start = 3;
        int finish = 3;
        int rsl = Counter.sum(start, finish);
        int exp = 3;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int rsl = Counter.sumByEven(start, finish);
        int exp = 30;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int rsl = Counter.sumByEven(start, finish);
        int exp = 0;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToTwoThenTwo() {
        int start = 2;
        int finish = 2;
        int rsl = Counter.sumByEven(start, finish);
        int exp = 2;
        Assert.assertEquals(exp, rsl);
    }
}
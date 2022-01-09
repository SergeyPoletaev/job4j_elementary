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
}
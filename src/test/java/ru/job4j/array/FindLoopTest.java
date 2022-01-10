package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenElementFound() {
        int[] data = new int[]{2, 7, 13, 1};
        int el = 7;
        int rsl = FindLoop.indexOf(data, el);
        int exp = 1;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenElementNotFound() {
        int[] data = new int[]{2, 7, 13, 1};
        int el = 14;
        int rsl = FindLoop.indexOf(data, el);
        int exp = -1;
        Assert.assertEquals(exp, rsl);
    }
}
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

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}
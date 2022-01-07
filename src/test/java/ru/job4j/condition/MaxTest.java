package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int rsl = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int rsl = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int rsl = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(expected, rsl);
    }
}
package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rsl = Square.calculate(bound);
        int[] exp = new int[]{0, 1, 4};
        Assert.assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rsl = Square.calculate(bound);
        int[] exp = new int[]{0, 1, 4, 9, 16};
        Assert.assertArrayEquals(exp, rsl);
    }
}
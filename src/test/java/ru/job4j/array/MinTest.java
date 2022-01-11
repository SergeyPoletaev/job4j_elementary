package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] arr = new int[]{-10, 3, 1, 6};
        int rsl = Min.min(arr);
        int exp = -10;
        Assert.assertEquals(exp, rsl);
    }

    @Test
    public void whenLastMin() {
        int[] arr = new int[]{-10, 3, 1, -16};
        int rsl = Min.min(arr);
        int exp = -16;
        Assert.assertEquals(exp, rsl);
    }
}
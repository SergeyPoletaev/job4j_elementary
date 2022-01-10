package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenArrayContainsAnEvenNumberOfElements() {
        int[] array = new int[]{1, 2, 3, 4};
        int[] rsl = Turn.back(array);
        int[] exp = new int[]{4, 3, 2, 1};
        Assert.assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenArrayContainsAnOddNumberOfElements() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] rsl = Turn.back(array);
        int[] exp = new int[]{5, 4, 3, 2, 1};
        Assert.assertArrayEquals(exp, rsl);
    }

}
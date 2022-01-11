package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenEvenLengthArraySort() {
        int[] data = new int[]{4, 3, 2, 1};
        int[] rsl = SortSelected.sort(data);
        int[] exp = new int[]{1, 2, 3, 4};
        Assert.assertArrayEquals(exp, rsl);
    }

    @Test
    public void whenOddLengthArraySort() {
        int[] data = new int[]{5, 4, 3, 2, 1};
        int[] rsl = SortSelected.sort(data);
        int[] exp = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(exp, rsl);
    }
}
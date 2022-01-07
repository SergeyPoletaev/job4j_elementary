package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotExist() {
        double ab = 1;
        double ac = 3;
        double bc = 5;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(rsl);
    }
}
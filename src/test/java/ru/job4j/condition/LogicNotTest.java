package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void when0ThenIsEvenTrue() {
        int in = 0;
        boolean rsl = LogicNot.isEven(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when6ThenIsEvenTrue() {
        int in = 6;
        boolean rsl = LogicNot.isEven(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenMinus6ThenIsEvenTrue() {
        int in = -6;
        boolean rsl = LogicNot.isEven(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when5ThenIsEvenFalse() {
        int in = 5;
        boolean rsl = LogicNot.isEven(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenMinus5ThenIsEvenFalse() {
        int in = -5;
        boolean rsl = LogicNot.isEven(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when0ThenIsPositiveFalse() {
        int in = 0;
        boolean rsl = LogicNot.isPositive(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenMinus1ThenIsPositiveFalse() {
        int in = -1;
        boolean rsl = LogicNot.isPositive(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when1ThenIsPositiveTrue() {
        int in = 1;
        boolean rsl = LogicNot.isPositive(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when0ThenNotEvenFalse() {
        int in = 0;
        boolean rsl = LogicNot.notEven(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when3ThenNotEvenTrue() {
        int in = 3;
        boolean rsl = LogicNot.notEven(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when4ThenNotEvenFalse() {
        int in = 4;
        boolean rsl = LogicNot.notEven(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenMinus3ThenNotEvenTrue() {
        int in = -3;
        boolean rsl = LogicNot.notEven(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenMinus4ThenNotEvenFalse() {
        int in = -4;
        boolean rsl = LogicNot.notEven(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when0ThenNotPositiveTrue() {
        int in = 0;
        boolean rsl = LogicNot.notPositive(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenMinus1ThenNotPositiveTrue() {
        int in = -1;
        boolean rsl = LogicNot.notPositive(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when1ThenNotPositiveFalse() {
        int in = 1;
        boolean rsl = LogicNot.notPositive(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when0ThenNotEvenAndPositiveFalse() {
        int in = 0;
        boolean rsl = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenMinus1ThenNotEvenAndPositiveFalse() {
        int in = -1;
        boolean rsl = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when1ThenNotEvenAndPositiveTrue() {
        int in = 1;
        boolean rsl = LogicNot.notEvenAndPositive(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when2ThenNotEvenAndPositiveFalse() {
        int in = 2;
        boolean rsl = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when0ThenEvenOrNotPositiveTrue() {
        int in = 0;
        boolean rsl = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenMinus1ThenEvenOrNotPositiveTrue() {
        int in = -1;
        boolean rsl = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when1ThenEvenOrNotPositiveFalse() {
        int in = 1;
        boolean rsl = LogicNot.evenOrNotPositive(in);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when2ThenEvenOrNotPositiveTrue() {
        int in = 2;
        boolean rsl = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(rsl);
    }
}
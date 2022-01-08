package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultiplySwitchWeekTest {

    @Test
    public void whenMondayEngThenNumberOfDay1() {
        String in = "Monday";
        int rsl = MultiplySwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMondayRusThenNumberOfDay1() {
        String in = "Понедельник";
        int rsl = MultiplySwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNotValidEngThenNumberOfDayMinus1() {
        String in = "MondayU";
        int rsl = MultiplySwitchWeek.numberOfDay(in);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNotValidRusThenNumberOfDayMinus1() {
        String in = "понедельник";
        int rsl = MultiplySwitchWeek.numberOfDay(in);
        int expected = -1;
        Assert.assertEquals(expected, rsl);
    }
}
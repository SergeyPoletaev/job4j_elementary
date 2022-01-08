package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when7ThenNameOfDaySunDay() {
        int in = 7;
        String rsl = SwitchWeek.nameOfDay(in);
        String expected = "Sunday";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNotValidDayThenNameOfDayError() {
        int in = 8;
        String rsl = SwitchWeek.nameOfDay(in);
        String expected = "Error";
        Assert.assertEquals(expected, rsl);
    }
}
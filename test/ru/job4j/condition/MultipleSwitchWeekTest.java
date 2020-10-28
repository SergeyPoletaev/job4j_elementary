package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

  @Test
  public void whenMondayThen1() {
    int out = MultipleSwitchWeek.numberOfDay("Monday");
    Assert.assertEquals(1, out);
  }
}
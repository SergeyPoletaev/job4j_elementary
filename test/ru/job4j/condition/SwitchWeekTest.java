package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

  @Test
  public void whenDay1() {
    int in = 1;
    String expected = "Понедельник";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

  @Test
  public void whenDay2() {
    int in = 2;
    String expected = "Вторник";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

  @Test
  public void whenDay3() {
    int in = 3;
    String expected = "Среда";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

  @Test
  public void whenDay4() {
    int in = 4;
    String expected = "Четверг";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

  @Test
  public void whenDay5() {
    int in = 5;
    String expected = "Пятница";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

  @Test
  public void whenDay6() {
    int in = 6;
    String expected = "Суббота";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

  @Test
  public void whenDay7() {
    int in = 7;
    String expected = "Воскресенье";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

  @Test
  public void whenDayErr() {
    int in = 10;
    String expected = "Ошибка!";
    String out = SwitchWeek.nameOfDay(in);
    Assert.assertEquals(expected, out);
  }

}
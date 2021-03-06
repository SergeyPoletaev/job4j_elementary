package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

  @Test
  public void when00to20then2() {
    double expected = 2;
    Point a = new Point(0, 0);
    Point b = new Point(2, 0);
    double out = a.distance(b);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when12to34then141() {
    double expected = 1.41;
    Point a = new Point(1, 3);
    Point b = new Point(2, 4);
    double out = a.distance(b);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when53to45then223() {
    double expected = 2.23;
    Point a = new Point(5, 4);
    Point b = new Point(3, 5);
    double out = a.distance(b);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when531to456then547() {
    double expected = 5.47;
    Point a = new Point(5, 3, 1);
    Point b = new Point(4, 5, 6);
    double out = a.distance3d(b);
    Assert.assertEquals(expected, out, 0.01);
  }
}
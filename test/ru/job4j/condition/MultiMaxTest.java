package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
  @Test
  public void whenFirstMax() {
    int result = MultiMax.max(5, 4, 2);
    assertThat(result, is(5));
  }

  @Test
  public void whenSecondMax() {
    int result = MultiMax.max(1, 4, 2);
    assertThat(result, is(4));
  }

  @Test
  public void whenThridMax() {
    int result = MultiMax.max(1, 4, 9);
    assertThat(result, is(9));
  }

  @Test
  public void whenEq() {
    int result = MultiMax.max(7, 7, 7);
    assertThat(result, is(7));
  }
}
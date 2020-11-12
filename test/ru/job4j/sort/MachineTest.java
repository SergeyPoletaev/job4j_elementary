package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
  @Test
  public void whenEquals() {
    Machine machine = new Machine();
    int[] expected = {};
    int[] rsl = machine.change(100, 100);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when50by35() {
    Machine machine = new Machine();
    int[] expected = {10, 5};
    int[] rsl = machine.change(50, 35);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when60by35() {
    Machine machine = new Machine();
    int[] expected = {10, 10, 5};
    int[] rsl = machine.change(60, 35);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when50by29() {
    Machine machine = new Machine();
    int[] expected = {10, 10, 1};
    int[] rsl = machine.change(50, 29);
    assertThat(rsl, is(expected));
  }

  @Test
  public void when102by29() {
    Machine machine = new Machine();
    int[] expected = {10, 10, 10, 10, 10, 10, 10, 2, 1};
    int[] rsl = machine.change(102, 29);
    assertThat(rsl, is(expected));
  }

}
package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {

    @Test
    public void whenMonoHorizontalIsTrue() {
        char[][] board = new char[][]{{'X', '1', '4'},
                {'X', 'X', 'X'},
                {'4', 'X', 'X'}
        };
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(board, row);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenMonoHorizontalIsFalse() {
        char[][] board = new char[][]{{'X', '1', '4'},
                {'X', 'X', 'X'},
                {'4', 'X', 'X'}
        };
        int row = 2;
        boolean rsl = MatrixCheck.monoHorizontal(board, row);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenMonoVerticalIsTrue() {
        char[][] board = new char[][]{{'X', 'X', '4'},
                {'X', 'X', 'X'},
                {'4', 'X', 'X'}
        };
        int column = 1;
        boolean rsl = MatrixCheck.monoVertical(board, column);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenMonoVerticalIsFalse() {
        char[][] board = new char[][]{{'X', '1', '4'},
                {'X', 'X', 'X'},
                {'4', 'X', 'X'}
        };
        int row = 1;
        boolean rsl = MatrixCheck.monoVertical(board, row);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        Assert.assertArrayEquals(expected, result);
    }
}
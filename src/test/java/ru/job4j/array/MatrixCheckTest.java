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
}
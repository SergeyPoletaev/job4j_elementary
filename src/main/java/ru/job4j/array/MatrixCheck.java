package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }
}

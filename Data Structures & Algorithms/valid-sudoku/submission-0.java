class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Проверка строк
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) return false;
                    row.add(board[i][j]);
                }
            }
        }

        // Проверка столбцов
        for (int j = 0; j < 9; j++) {
            Set<Character> col = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (col.contains(board[i][j])) return false;
                    col.add(board[i][j]);
                }
            }
        }

        // Проверка квадратов 3x3
        int[][] squares = {
            {0, 0}, {0, 3}, {0, 6},
            {3, 0}, {3, 3}, {3, 6},
            {6, 0}, {6, 3}, {6, 6}
        };

        for (int[] square : squares) {
            Set<Character> box = new HashSet<>();
            for (int i = square[0]; i < square[0] + 3; i++) {
                for (int j = square[1]; j < square[1] + 3; j++) {
                    if (board[i][j] != '.') {
                        if (box.contains(board[i][j])) return false;
                        box.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
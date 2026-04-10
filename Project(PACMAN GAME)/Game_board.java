package PROJECT1;

public class Game_board {
    public char [][] board = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '.', '.', '.', '.', '#', '.', '.', '.', '.', '#', '.', '.', '.', '#'},
            {'#', '.', '#', '#', '.', '.', '#', '.', '#', '#', '#', '.', '#', '.', '#'},
            {'#', '#', '#', '.', '#', '.', '#', '.', '.', '.', '.', '.', '#', '.', '#'},
            {'#', '.', '.', '.', '#', '.', '.', '.', '#', '#', '.', '#', '#', '#', '#'},
            {'#', '.', '#', '.', '#', '#', '#', '.', '.', '#', '.', '.', '.', '#', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '.', '#'},
            {'#', '.', '#', '#', '#', '.', '#', '#', '.', '.', '.', '#', '#', '.', '#'},
            {'#', '.', '.', '#', '.', '.', '.', '.', '.', '#', '#', '.', '.', '.', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    public void display_board(Pacman player, Ghost ghost) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (i == player.get_row() && j == player.get_column()) {
                    System.out.print("P ");
                }
                else if (i == ghost.get_row() && j == ghost.get_column()) {
                    System.out.print("G ");
                }
                else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean is_wall(int row, int column) {
        return board[row][column] == '#';
    }

    public boolean has_food(int row, int column) {
        return board[row][column] == '.';
    }

    public boolean food_remaining() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public void remove_food(int row, int column) {
        board[row][column] = ' ';
    }
}


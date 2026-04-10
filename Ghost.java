package PROJECT1;

import java.util.Random;

public class Ghost {
    private int row;
    private int column;

    public Ghost(int r, int c) {
        this.row = r;
        this.column = c;
    }

    public void move(Game_board board) {
        Random random = new Random();

        int new_row = row;
        int new_col = column;

        int direction = random.nextInt(4);

        if (direction == 0) {
            new_row--;
        } else if (direction == 1) {
            new_row++;
        } else if (direction == 2) {
            new_col--;
        } else {
            new_col++;
        }

        if (new_row >= 0 && new_row < 15 &&
                new_col >= 0 && new_col < 15 &&
                !board.is_wall(new_row, new_col)) {

            row = new_row;
            column = new_col;
        }
    }

    public int get_row() {
        return row;
    }

    public int get_column() {
        return column;
    }

    public boolean hitsPacman(Pacman player) {
        return row == player.get_row() &&
                column == player.get_column();
    }
}
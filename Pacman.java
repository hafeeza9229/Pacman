package PROJECT1;

public class Pacman {
    private int row;
    private int column;
    private int score;

    public Pacman () {
        this.row = 3;
        this.column = 2;
        this.score = 0;
    }

    public Pacman (int r, int c) {
        this.row = r;
        this.column = c;
        this.score = 0;
    }

    public void move(char direction, Game_board board, Food food) {
        int new_row = row;
        int new_col = column;

        if (direction == 'w' || direction == 'W')  {
            new_row--;
        } else if (direction == 'S' || direction == 's') {
            new_row++;
        } else if (direction == 'A' || direction == 'a') {
            new_col--;
        } else if (direction == 'D' || direction == 'd') {
            new_col++;
        } else {
            System.out.println("Invalid move!!");
        }

        if(new_row >= 0 && new_row < 15 &&
                new_col >= 0 && new_col < 15 &&
                !board.is_wall(new_row, new_col))
        {
            row = new_row;
            column = new_col;

            if(board.has_food(row, column)) {
                board.remove_food(row, column);
                food.eatFood();
                score += 10;

                System.out.println("Food eaten! Score: " + score);
                System.out.println("Remaining food: " + food.getRemainingFood());
            }

        } else {
            System.out.println("Wall hit!!");
        }

    }

    public int get_row() {
        return row;
    }

    public int get_column() {
        return column;
    }

    public int get_score() {
        return score;
    }
}
package PROJECT1;

public class Food {
    private int totalFood;

    public Food(Game_board board) {
        totalFood = countFood(board);
    }

    private int countFood(Game_board board) {
        int count = 0;

        for (int i = 0; i < board.board.length; i++) {
            for (int j = 0; j < board.board[i].length; j++) {
                if (board.board[i][j] == '.') {
                    count++;
                }
            }
        }

        return count;
    }

    public void eatFood() {
        totalFood--;
    }

    public boolean allFoodEaten() {
        return totalFood == 0;
    }

    public int getRemainingFood() {
        return totalFood;
    }
}
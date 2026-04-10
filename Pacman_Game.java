package PROJECT1;

import java.util.Scanner;

public class Pacman_Game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Game_board board = new Game_board();
        Pacman player = new Pacman();
        Food food = new Food(board);
        Ghost ghost = new Ghost(1, 4);

        while (true) {
            board.display_board(player, ghost);
            System.out.println("Score: " + player.get_score());

            System.out.print("Moves (W/A/S/D) : ");
            char move = input.next().charAt(0);

            player.move(move, board, food);

            if (food.allFoodEaten()) {
                board.display_board(player, ghost);
                System.out.println("YOU WIN! All food eaten!");
                System.out.println("Final Score: " + player.get_score());
                break;
            }

            if (ghost.hitsPacman(player)) {
                System.out.println("GAME OVER! Ghost caught Pacman");
                break;
            }

            ghost.move(board);

            if (ghost.hitsPacman(player)) {
                System.out.println("GAME OVER! Ghost caught Pacman");
                break;
            }
        }

    }
}


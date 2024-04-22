
/** Author: William Martinez
Assignment by Outlier.org */

import java.util.Scanner;
import java.lang.Math;

public class GemRun {

    public static void main(String[] args) {
        final int MAZE_SIZE = 20; // uneditable board size measurement

        // Scanner incantation
        Scanner input = new Scanner(System.in);

        // Ask user for player and gem positions
        // 'gem' is an int -1-19; if -1, randomize position
        // 'player' is an int -1-19; if -1, randomize position
        System.out.print("Enter 0-19 for gem position or -1 to randomize: ");
        int gem = input.nextInt();
        System.out.print("Enter 0-19 for player position or -1 to randomize: ");
        int player = input.nextInt();
        input.nextLine(); // Scanner incantation


        /* TODO: Initializing The Game
         * - Initialize the player and/or gem positions if user entered -1
         * - Print the starter board */
        // Sets the randomPosition variable to a random number between 0 and 19
        int randomPosition = (int) ((MAZE_SIZE - 1) * Math.random());
        // Checks if either player or gem is equal to -1 if so then sets it to the randomPosition value
        if (player == -1) {
            player = randomPosition;
        }

        if (gem == -1) {
            gem = randomPosition;
        }

        // Prints the starter board
        for (int i = 0; i < MAZE_SIZE; i++) {
            // Sets the "P" based on player input then skips the iteration
            if (player == i) {
                System.out.print("P");
                continue;
            }
            System.out.print("_");
        }


        /* TODO: Progressing The Game
         * - Ask for player input
         * - Update variables and print messages accordingly
         * - Print the updated board */
         while (player != gem) {
            System.out.print("Enter a direction (left or right): ");
            char dir = input.next().toLowerCase().charAt(0);
            ;
            input.nextLine();
            if (dir == 'l') {
                // Places "P" one position to the left then prints a new board
                if (player > 0 && player < MAZE_SIZE) {
                    player--;
                    for (int i = 0; i < MAZE_SIZE; i++) {
                        if (player == i) {
                            System.out.print("P");
                            continue;
                        }
                        System.out.print("_");
                    }
                    System.out.println("\n");
                }
            } else if (dir == 'r') {
                // Places "P" one position to the right then prints a new board
                if (player > 0 && player < MAZE_SIZE) {
                    player++;
                    for (int i = 0; i < MAZE_SIZE; i++) {
                        if (player == i) {
                            System.out.print("P");
                            continue;
                        }
                        System.out.print("_");
                    }
                    System.out.println("\n");
                }
            }

            // Checks the absolute value of player subtracted by gem to print helpful
            // distance messages
            if (Math.abs(player - gem) >= 7) {
                System.out.println("Very cold!");
            } else if (Math.abs(player - gem) == 1) {
                System.out.println("Very Warm!");
            }
        }

        /* TODO: Ending The Game
         * - Print the final board
         * - Print the victory message */
        for (int i = 0; i < MAZE_SIZE; i++) {
            if (player == i) {
                System.out.print("*");
                continue;
            }
            System.out.print("_");
        }
        System.out.println("\n");
        System.out.println("Found the gem!");

        // Scanner incantation finish
        input.close();
    }
}

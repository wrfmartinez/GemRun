
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



        /* TODO: Progressing The Game
         * - Ask for player input
         * - Update variables and print messages accordingly
         * - Print the updated board */



        /* TODO: Ending The Game
         * - Print the final board
         * - Print the victory message */


         

        // Scanner incantation finish
        input.close();
    }
}
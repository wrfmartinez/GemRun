# GGU Capstone Assignment Part One: Gem Run

### Setting Up
Go to [Repl.it](https://replit.com/@williamm275/GemRun)

Note that I did not need to understand how the code works for this assignment! Comments explain the existing code. The TODO comments mark steps of implementation. The Use of corresponding sections in the Implementation section below was used to code one TODO item at a time. Then, with the use of top-bottom design or bottom-top design I planned and executed my implementation.

### Purpose
The purpose of this assignment is to apply the programming skills I have acquired to a practical and in-depth project. In this assignment, I practiced designing and using print statements, variables, conditional statements, and loops.

### Main Task
OUTLIER ODYSSEY

My ultimate goal is to build a game called Outlier Odyssey. In this game, a player will navigate a two-dimensional map from one corner to another with limited resources while encountering hazards. During each part of the project, I will build an aspect of the game. Each part will be used in the final product.

PART ONE: GEM RUN

For this assignment, I will work in the file and class GemRun to create a game that uses input from the player to move a character left or right on a horizontal line in search of a gem. This will be part of the functionality that will allow the player to move through the map in the finished game.

### Implementation
INITIALIZING THE GAME

The game takes place on a horizontal line that is 20 characters wide and made up of underscores (_). At the beginning of the game, the user is asked to choose a location for the gem (*) and the player (P)—the code that asks for a location has been done for you. If the user does not want to choose, the gem (*) and player (P) should each be placed at a random position on a horizontal line. The player and the gem cannot start in the same random position.

Once placed, the line with the player character should be printed out. The player and gem positions begin counting at zero. For example, a line where player = 1 would look like this:

_P__________________

When this step is finished, the program should accept a player coordinate and a gem coordinate, then print a starting board.

PROGRESSING THE GAME

Once initialized, the program should ask what direction the user would like move: left or right. If the user enters "left", the character should move one space to the left. If the user enters "right", the character should move one space to the right. Make use of the useful code snippets to collect input from the user.

If the player is NOT on the same space as the gem, print a helpful message. If the difference between the player’s position and the gem’s position is:

Greater than or equal to 7, print “Very cold!”
1 (the gem is next to the player), print “Very warm!”
Then, print the new state of the board and repeat the game progression until the gem is found.

When this step is finished, the program should allow your player to move left and right on the board an infinite number of times.

ENDING THE GAME

Repeat “Progressing the Game” until the player “finds” the gem by landing on the space where the gem is placed. Once the gem is located:

Print the new state of the line with the gem instead of the player character
Print out “Found the gem!” for the player

Tic-Tac-Toe Game

This is a simple console-based Tic-Tac-Toe game developed in Java. The game allows two players to play against each other on a 3x3 grid.

-Table of Contents
-Overview
-Project Structure
-How to Play
-Classes and Methods
-Future Enhancements

Overview:
This Tic-Tac-Toe game is a classic implementation of the popular two-player game. Players take turns placing their symbols (X or O) on a 3x3 grid. The objective is to be the first player to align three of their symbols horizontally, vertically, or diagonally.

Project Structure:
-Players.java: Defines the Players class which represents a player with a name and a symbol (X or O).
-Board.java: Manages the game board, including player moves, checking for a win condition, and printing the board.
-TicTacToe.java: Contains the TicTacToe class, which is the main class that runs the game. It handles player input and the game loop.


How to Play:
-When prompted, enter the names and symbols for Player 1 and Player 2. The symbols must be unique.
-Players will take turns to enter the coordinates (x, y) for their move.
-The game checks for a win or a draw after each move and prints the game board.
-The game ends when one player wins or when all cells are filled, resulting in a draw.

Classes and Methods

1. Players.java:
-Players(String name, char symbol): Constructor that initializes a player with a name and a symbol.
-void setName(String name): Sets the name of the player.
-void setSymbol(char symbol): Sets the symbol of the player.
-String getName(): Returns the name of the player.
-char getSymbol(): Returns the symbol of the player.

2. Board.java

-Board(char p1Symbol, char p2Symbol): Constructor that initializes the game board and sets the symbols for Player 1 and Player 2.
-int move(int x, int y, char symbol): Handles a player's move and checks for a win or draw condition.
-void print(): Prints the current state of the game board.

3. TicTacToe.java

-void startGame(): Manages the game flow, including taking player input and handling the game loop.
-Players takeInputPlayer(int num): Prompts the user for player details and returns a new Players object.

Future Enhancements

-Add AI: Implement a single-player mode where a player can play against the computer.
-Improved Input Validation: Enhance the input handling to prevent invalid or out-of-bound moves more effectively.
-Graphical User Interface (GUI): Develop a GUI version of the game for a more interactive experience.


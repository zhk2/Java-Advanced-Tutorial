import java.util.Scanner;

/**
 * TicTacToe Game.
 * 
 * This game allows two players to play Tic Tac Toe in the terminal.
 * Player 1 uses 'X' and Player 2 uses 'O'.
 * The game loops until a win condition is met or the board is full.
 */
public class game {

    int SIZE = 3;
    char[][] board = new char[SIZE][SIZE];
    char PLAYER1 = 'X';
    char PLAYER2 = 'O';

    //  to initialize the game board
    public game() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';  // Initializing each cell with '-'
            }
        }
    }

    /**
     * Method to set a cell's value based on player's move.
     * 
     * @param player The player symbol ('X' or 'O')
     * @param row The target row
     * @param col The target column
     * @return true if the move was successful, false otherwise
     */
    public boolean setCell(char player, int row, int col) {
        if (row >= 0 && col >= 0 && row < SIZE && col < SIZE && board[row][col] == '-') {
            board[row][col] = player;  // Place the player's symbol on the board
            return true;
        }
        return false;  // Invalid move
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        game game = new game();

       
    }
}

import java.util.Scanner;

/**
 * TicTacToe Game.
 # TASK : Make a game of Tic Tac Toe in Java using the terminal! Start with Player1 , who will place down an ‘X’ and then Player2 will place down an ‘O’. The player input will loop until a win condition is found.

- **`do-while`** loop - ( for player input)
- **`for`** loop - (iterating through array)
- methods - (functions to make the game easier to understand)
- multidimensional arrays - (store game data)
- player id - (determine which icon to use for play)

Input ( ROW # )

Input ( COLUMN # )

### Methods

- SetCell( playerID , row , column )
- Check Win()
    - Check Row
    - Check Column
    - Check Diagonal
 * 
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
        System.out.println("Player 1, your move");
        System.out.print("Enter row (0, 1, 2): ");
        int row = scanner.nextInt();
        System.out.print("Enter column (0, 1, 2): ");
        int column = scanner.nextInt(); 
        scanner.close();





       
    }
}

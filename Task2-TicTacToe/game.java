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
class Game {

    int SIZE = 3;
    char[][] board = new char[SIZE][SIZE];
    char PLAYER1 = 'X';
    char PLAYER2 = 'O';


    //  to initialize the game board
    public Game() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';  // Initializing each cell with '-'
            }
        }
    }
    public void displayBoard(){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println(); 
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
    public boolean checkWin(char player) {
        return checkRow(player) || checkColumn(player) || checkDiagonal(player);
    }

    public boolean checkRow(char player) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColumn(char player) {
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonal(char player) {
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(); 
        game.displayBoard();
        System.out.println("Player 1, your move");
        System.out.print("Enter row (0, 1, 2): ");
        int row = scanner.nextInt();
        System.out.print("Enter column (0, 1, 2): ");
        int column = scanner.nextInt(); 
        scanner.close();





       
    }
}

package GAME_TicTacToe;

public class Board {

    private char [][] board;
    private int boardSize = 3;
    private char p1Symbol;
    private char p2Symbol;
    public static final int PLAYER_1_WINS = 1;
    public static final int PLAYER_2_WINS = 2;
    public static final int DRAW = 3;
    public static final int INCOMPLETE = 4;
    public static final int INVALID = 5;


     int count=0;

     public Board(char p1Symbol, char p2Symbol )
     {
         // constructor
         board = new char[boardSize][boardSize];
         for(int i=0;i<boardSize;i++)
         {
             for(int j=0;j<boardSize;j++)
             {
                 board[i][j] = ' ';
             }
         }

         this.p1Symbol = p1Symbol;
         this.p2Symbol = p2Symbol;
     }

    public int move(int x, int y, char symbol) {

         if(x<0 || x>=boardSize || y<0 || y>=boardSize || board[x][y] != ' ')
         {
                      return INVALID;
         }

         board[x][y] = symbol;
         count++;

         //check  row
        if(board[x][0] == board[x][1] && board[x][0] == board[x][2])
        {
            return symbol==p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // check colm
        if(board[0][y] == board[1][y] && board[0][y] == board[2][y])
        {
            return symbol==p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // check 1st diagonal
        if( board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
        {
            return symbol==p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        // check 2nd diagonal
        if(board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
        {
            return symbol==p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }

        if(count==(boardSize*boardSize))
        {
            return DRAW;
        }
        return INCOMPLETE;
    }

    public void print() {
        System.out.println("------------");
        for (int i=0;i<boardSize;i++)
        {
            for (int j=0;j<boardSize;j++)
            {
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------");

    }
}

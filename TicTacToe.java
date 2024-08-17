package GAME_TicTacToe;

import java.util.Scanner;

public class TicTacToe {

   private Players player1 , player2;
   private Board board;

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }

   public void startGame()
   {
       // players input
       Scanner s = new Scanner(System.in);
        player1 = takeInputPlayer(1);
        player2 = takeInputPlayer(2);
       while (player1.getSymbol() == player2.getSymbol())
       {
           System.out.println("Symbol already taken ! Pick another symbol !!");
           char symbol = s.next().charAt(0);
           player2.setSymbol(symbol);
       }

       // create board
       board = new Board(player1.getSymbol(), player2.getSymbol());

       // conduct the game
       boolean player1turn = true;
       int status = Board.INCOMPLETE;
       while (status==Board.INCOMPLETE || status==Board.INVALID)
       {
           if(player1turn)
           {
               System.out.println("Player 1 - " + player1.getName() + "'s turn" );
               System.out.println("Enter x : ") ;
               int x= s.nextInt();
               System.out.println("Enter y : ");
               int y = s.nextInt();
              status =   board.move(x,y,player1.getSymbol());
             if (status != Board.INVALID)
             {
                 player1turn = false;
                 board.print();

             }
             else {
                 System.out.println("Invalid move ! TRY AGAIN !!");
             }

           }
           else
           {
               System.out.println("Player 2 - " + player2.getName() + "'s turn" );
               System.out.println("Enter x : ") ;
               int x= s.nextInt();
               System.out.println("Enter y : ");
               int y = s.nextInt();
                status =   board.move(x,y,player2.getSymbol());
               if (status != Board.INVALID)
               {
                   player1turn = true;
                   board.print();

               }
               else {
                   System.out.println("Invalid move ! TRY AGAIN !!");
               }
           }
       }

       if(status==Board.PLAYER_1_WINS)
       {
           System.out.println("Player1 - "+ player1.getName() + " wins!!");
       } else if (status==Board.PLAYER_2_WINS) {
           System.out.println("Player2 - "+ player2.getName() + " wins!!");
       }
       else {
           System.out.println("It's a DRAW");
       }
   }

   private Players takeInputPlayer(int num)
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter player" + num + " name : ");
       String name = s.nextLine();
       System.out.println("Enter player"+ num + " symbol: ");
       char symbol = s.next().charAt(0);
       Players p = new Players(name,symbol);
       return p;
   }
}

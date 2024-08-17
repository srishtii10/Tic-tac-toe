package GAME_TicTacToe;

public class Players {
   private String name;
     private char symbol;

     public Players(String name, char symbol)
     {        // constructor
          setName(name);
          setSymbol(symbol);
     }

     public void setName(String name)
     {
         if(!name.isEmpty())
         {
             this.name = name;
         }

     }
     public void setSymbol(char symbol)
     {
         if(symbol!= '\0')  // symbol should be not null
         {
             this.symbol = symbol;
         }
     }
     public String getName()
     {
         return this.name;
     }
     public char getSymbol()
     {
         return this.symbol;
     }
}

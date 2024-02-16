import java.util.Scanner;

public class tictactoe 
{
  public static void main(String[] args) {
    char [][]board=new char[3][3];
    for(int i=0;i<board.length;i++)
    {
      for(int j=0;j<board.length;j++)
      {
        board[i][j]=' ';
      }
    }
    char player1='X';
    boolean gameover=false;
    Scanner scn=new Scanner(System.in);
    while(!gameover)
    {
      printboard(board);
      System.out.println("Player "+player1+"Enter your coordinates");
      int row=scn.nextInt();
      int col=scn.nextInt();
      if(board[row][col]==' ')
      {
        board[row][col]=player1;
        gameover=haveWon(board,player1);
        if(gameover)
        {
          System.out.println("Player"+player1+"has won");
        }
        else
        {
          player1=(player1=='X')?'O':'X';
        }
      }
      else
      {
        System.out.println("Invalid Move! Try Again");
      }

    }
    printboard(board);
  }

  private static boolean haveWon(char[][] board, char player) 
  {
    // check the rows
    for(int i=0;i<board.length;i++)
    {
      if(board[i][0]==player && board[i][1]==player && board[i][2]==player)
      {
        return true;
      }
    }
    //check for column
    for(int i=0;i<board[0].length;i++)
    {
      if(board[0][i]==player && board[1][i]==player && board[2][i]==player)
      {
        return true;
      }
    }
    //check diagnols
    if((board[0][0]==player&&board[1][1]==player&&board[2][2]==player)||
                                      (board[0][2]==player&&board[1][1]==player&&board[2][0]==player))
      return true;
    return false;
    
  }

  private static void printboard(char[][] board) 
  {
    for(int i=0;i<board.length;i++)
    {
      for(int j=0;j<board[0].length;j++)
      {
        System.out.print(board[i][j]+" |");
      }
      System.out.println();
    }
    
  }
  
}

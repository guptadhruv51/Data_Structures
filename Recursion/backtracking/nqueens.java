package backtracking;

public class nqueens 
{
  public static void main(String[] args) 
  {
    int n=4;
    boolean [][]board=new boolean[n][n];
queens(board, 0);
  }
  static int queens(boolean[][] board, int row)
  {
    if(row==board.length)
    {
      display(board);
      System.out.println();
      return 1; 
    }
    int count=0;
    for(int col=0;col<board.length;col++)
    {
        
        if(isSafe(board,row,col))
        {
          board[row][col]=true;
          count+=queens(board,row+1);
          board[row][col]=false;
        }
    }
    return count;
  }
  
  private static boolean isSafe(boolean[][] board, int row, int col) 
  {
   
    for(int i=0;i<row;i++)
    {
      if(board[i][col]==true)
      return false;
    }
    int left=Math.min(col,row);
    for(int i=1;i<=left;i++)
    {
      if(board[row-i][col-i]==true)
        return false;
    }
    int right=Math.min(row,board.length-col-1);
    for(int i=1;i<=right;i++)
    {
      if(board[row-i][col+i]==true)
          return false;
    }
    return true;
  }
  private static void display(boolean [][]board)
  {
    for(boolean []arr:board)
    {
      for(boolean element:arr)
      {
        if(element)
          System.out.print("Q ");
        else
        System.out.print("X ");
      }
      System.out.println();
    }
     
  }
  
}

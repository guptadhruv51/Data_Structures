package backtracking;

public class sudokusolver 
{
  public static void main(String[] args) {
    
  }
  static boolean solve(int [][] board)
  {
    int n=board.length;
    int row=-1;
    int col=-1;
    boolean emptyleft=true;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(board[i][j]==0)
        {
          row=i;
          col=j;
          emptyleft=false;
          break;
        }
      }
      if(emptyleft==false)
      break;
    }
    if(emptyleft==true)
    return true;
    for(int number =1;number <=9;number++)
    {
      if(isSafe(board,row,col,number))
      {
        board[row][col]=number;
        if(solve(board))
        {
          return true;
        }
        else{
          board[row][col]=0;
        }
      }
    }
    return false;
  }
  static boolean isSafe(int [][] board, int row, int col, int num)
{
  // checking if number is in the row
    for(int i=0;i<board.length;i++)
    if(board[row][col]==num)
    return false;
  // chekcing if the number is in the column
    for(int []nums:board)
      if(nums[col]==num)
      return false;
  // checking int the square 
  int sqart=(int)(Math.sqrt(board.length));
  int rowstart=row-row%sqart;
  int colstart=col-col%sqart;
  for(int r=rowstart;r<rowstart+sqart;r++)
  {
    for(int c=colstart;c<colstart+sqart;c++)
    {
      if(board[r][c]==num)
         return false;
    }
  }

  return true;
}
}

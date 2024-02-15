package DP;

import java.util.Arrays;

public class mazepath 
{
    public static void main(String[] args) 
    {
        int n=20;
        System.out.println(MPTD(0,0,n,n,new int[n+1][n+1] ));
        
    }
    public static int MPRec(int cr, int cc,int er, int ec)
    {
        if(cc==ec &&cr==er)
        {
            return 1; 
        }
        if(cc>ec||cr>er)
        {
            return 0;
        }
       int ch= MPRec(cr, cc+1, er, ec);
       int cv= MPRec(cr+1, cc, er, ec);
       return ch+cv;
    }
    public static int MPTD(int cr, int cc,int er, int ec,int [][]strg)
    {
         
        if(cc==ec &&cr==er)
        {
            return 1;
        }
        if(cc>ec||cr>er)
        {
            return 0;
        }
        if(strg[cr][cc]!=0)
        {
            return strg[cr][cc];
        }
       int ch= MPTD(cr, cc+1, er, ec,strg);
       int cv= MPTD(cr+1, cc, er, ec,strg);
       strg[cr][cc]=ch+cv;
       return ch+cv;
    }
      
    public static int MPBU(int er,int ec)
    {
         int [][]strg=new int[er+2][ec+2];
         for(int row=er;row>=0;row--)
         {
            for(int col=ec;col>=0;col--)
            {
                if(row==er && col==ec)
                {
                    strg[row][col]=1;
                }
                else{
                    strg[row][col]=strg[row][col+1]+strg[row+1][col];
                }
            }
         }
         return strg[0][0];
        
     }
     public static int MPBUSE(int er, int ec)
     {
        int [] strg=new int[ec];
        Arrays.fill(strg,1);
        for(int slide=er-1;slide>=0;slide--)
        {
             for(int col=ec;col>=0;col--)
             {
                if(col==ec)
                {
                    strg[col]=1;
                }
                else{
                    strg[col]=strg[col]+strg[col+1];
                }
             }
        }
        return strg[0];
     }

    
}

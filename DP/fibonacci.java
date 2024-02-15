package DP;

public class fibonacci 
{
    //TC: O(n)
    //SC: O(n)+recursion space

    public static int fibTD(int n, int [] strg)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        if(strg[n]!=0) //reuse
        {
            return strg[n];
        }
        int t1=fibTD(n-1,strg);
        int t2=fibTD(n-2,strg);
        strg[n]=t1+t2; // store

        return t1+t2;

    }
    // TC: O(n)
    //SC: O(n)
    public static int fibBU(int n)
    {
        int [] strg=new int[n+1];
        strg[0]=0;
        strg[1]=1;
        for(int i=2;i<=n;i++)
        {
            strg[i]=strg[i-1]+strg[i-2];

        }
        return strg[n];

    }
    public static int fibBUSE(int n)
    {
        int [] strg=new int[2];
        strg[0]=0;
        strg[1]=1;
        for(int slide=1;slide<=n;slide++)
        {
            int sum=strg[0]+strg[1];
            strg[0]=strg[1];
            strg[1]=sum;
        }
        return strg[1];
    }
        public static void main(String[] args)
     {
        int n=10000;
        //System.out.println(fibTD(n,new int[n+1]));
        System.out.println(fibBU(n));
    }
    
}

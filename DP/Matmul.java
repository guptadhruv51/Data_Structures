package DP;

public class Matmul 
{
    public static void main(String[] args) 
    {
     int []arr=new int[1000];
     for(int i=0;i<arr.length;i++)
     {
        arr[i]=i+1;
     }   
     //System.out.println(matTD(arr, 0, arr.length-1, new int [arr.length][arr.length]));
     System.out.println(matBU(arr));
    }
    public static int matRec(int []arr,int si, int ei)
    {
        if(si+1==ei)
        {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        
        for(int k=si+1;k<=ei-1;k++)
        {
           int o1= matRec(arr,si,k); //arr[si]*arr[k]
            int o2=matRec(arr,k,si); //arr[k]*arr[ei]
            //resultant matrices operations
            int self=arr[si]*arr[k]*arr[ei];
            int total =o1+o2+self;
            if (total<min)
            {
                min=total;
            }
        }
        return min;
    }
    public static int matTD(int [] arr, int si, int ei,int [][]strg)
    {

        if(si+1==ei)
        {
            return 0;
        }
        if(strg[si][ei]!=0)
        {
            return strg[si][ei];
        }
        int min=Integer.MAX_VALUE;
        
        for(int k=si+1;k<=ei-1;k++)
        {
           int o1= matTD(arr,si,k,strg); //arr[si]*arr[k]
            int o2=matTD(arr,k,ei,strg); //arr[k]*arr[ei]
            //resultant matrices operations
            int self=arr[si]*arr[k]*arr[ei];
            int total =o1+o2+self;
            if (total<min)
            {
                min=total;
            }
        }
        strg[ei][si]=min;
        return min;
    }
    public static int matBU(int [] arr)
    {
        int [][]strg=new int[arr.length][arr.length];
        for(int slide=1;slide<=arr.length-1;slide++)
        {
            for(int si=0;si<=arr.length-slide-1;si++)
            {
                int ei=si+slide;
                // logic from top down
                if(si+1==ei)
                {
                    strg[si][ei]=0;
                }
                int min=Integer.MAX_VALUE;
                for(int k=si+1;k<=ei-1;k++)
                {
                    int fp=strg[si][k];
                    int sp=strg[k][ei];
                    int sw=arr[si]*arr[k]*arr[ei];
                    int total=fp+sp+sw;
                    if (total<min)
                    {
                min=total;
                    }
                }
                strg[ei][si]=min;
            }
        }
        return strg[0][arr.length-1];

    }
}

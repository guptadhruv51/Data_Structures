package DP;

public class Mixtures 
{
    public static int MixturesRec(int [] arr, int start, int end)
    {
        int min=Integer.MAX_VALUE;
        for(int k=start;k<end;k++ )
        {
            int fp=MixturesRec(arr, start,k);
            int sp=MixturesRec(arr, k+1, end);
            int sw=color(arr, start,k)*color(arr, k+1,end);
            int total=fp+sp+sw;
            if(total<min)
            {
                min=total;
            }
        }
        return min;
    }
    public static int color(int []arr,int i,int j)
    {
        int sum=0;
        for(int k=i;k<=j;k++)
        {
            sum+=arr[k];
        }
        return sum%100;
    }
    
}

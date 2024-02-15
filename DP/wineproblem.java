package DP;

public class wineproblem 
{
    public static int WPRec(int []arr,int si, int ei, int yr)
    {
        if(si==ei)
        {
            return arr[si]*yr;
        }
        int start=WPRec(arr, si+1, ei, yr+1)+arr[si]*yr;
        int end=WPRec(arr, si, ei-1, yr+1)+arr[ei]*yr;
        return Math.max(start,end);
    }
    public static int WPTD(int []arr, int si, int ei, int [][] strg)
    {
        int yr=arr.length-(ei-si+1)+1;
        if(si==ei)
        {
            return arr[si]*yr;
        }
        if(strg[si][ei]!=0)
        {
            return strg[si][ei];
        }
        int start=WPRec(arr, si+1, ei, yr+1)+arr[si]*yr;
        int end=WPRec(arr, si, ei-1, yr+1)+arr[ei]*yr;
        int ans=Math.max(start,end);
        strg[si][ei]=ans;
        return ans;
    }
    public static int WPBU(int [] arr)
    {
        int [][]strg=new int[arr.length][arr.length];
        for(int slide=0;slide<arr.length;slide++)
        {
            for(int si=0;si<=arr.length-slide-1;si++)
            {
                int ei=si+slide;  
                int yr=arr.length-(ei-si+1)+1;
                    if(si==ei)
                    {
                        strg[si][ei]=arr[si]*yr;
                    }
                    else
                    {
                 int start=strg[si+1][ei]+arr[si]*yr;
                 int end=strg[si][ei-1]+arr[ei]*yr;
            int ans=Math.max(start,end);
            strg[si][ei]=ans;
                }

            }
        }
        return strg[0][arr.length-1];
    }
    
}

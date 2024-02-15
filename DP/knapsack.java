package DP;

public class knapsack 
{
    public static void main(String[] args) {
        int[] wt={1,3,4,5};
        int [] price={1,4,5,7};
        System.out.println(knapRec(wt, price,0, 7));
        System.out.println(BU(wt, price, 7));
    }
    public static int knapRec(int []wt, int [] price, int idx,int cap)
    {
        if(idx==wt.length || cap==0)
        {
            return 0;
        }
        //exclude
        int e=knapRec(wt,price,idx+1,cap);
        //include
        int i=0;
        if(cap>=wt[idx])
        
        {
            i=knapRec(wt,price,idx+1,cap-wt[idx])+price[idx];
        }
        int ans=Math.max(e, i);
        return ans;
        }
         
        public static int knapTD(int []wt, int [] price, int idx,int cap,int [][]strg)
    {
        if(idx==wt.length || cap==0)
        {
            return 0;
        }
        if(strg[idx][cap]!=0)
        {
            return strg[idx][cap];
        }
        //exclude
        int e=knapTD(wt,price,idx+1,cap,strg);
        //include
        int i=0;
        if(cap>=wt[idx])
        
        {
            i=knapTD(wt,price,idx+1,cap-wt[idx],strg)+price[idx];
        }
        int ans=Math.max(e, i);
        strg[idx][cap]=ans;
        return ans;
        }
        public static int BU(int []wt, int [] price,int cap)
        {
            int [][]strg=new int[wt.length+1][cap+1];
            for(int i=wt.length-1;i>=0;i--)
            {
                for(int j=1;j<strg[0].length;j++)
                {
                    int e=strg[i+1][j];
                    int inc=0;
                    if(j>=wt[i])
                    inc=strg[i][j-wt[i]]+price[i];
                    int ans=Math.max(e,inc);
                strg[i][j]=ans;
                }
            }
            return strg[0][cap];
        }
        
    
}

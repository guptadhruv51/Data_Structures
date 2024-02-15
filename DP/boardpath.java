package DP;

public class boardpath 
{
    public static int BPRec(int curr, int end)
    {
        if(curr==end)
        {
            return 1;
        }
        if(curr>end)
        {
            return 0;
        }
        int sum=0;
        for(int i=1;i<=6;i++)
        {
             sum+=BPRec(curr+i, end);
        }
        return sum;
    }
    public static int BPTD(int curr, int end, int []strg)
    {
        if(curr==end)
        {
            return 1;
        }
        if(curr>end)
        {
            return 0;
        }
        if(strg[curr]!=0)
        {
            return strg[curr];
        }
        int sum=0;
        for(int i=1;i<=6;i++)
        {
             sum+=BPRec(curr+i, end);
        }
        strg[curr]=sum;
        return sum;
    }
    public static int BPBU(int end)
    {
        int [] strg=new int[end+6];
        strg[end]=1;
        for(int i=end-1;end>=0;end--)
        {
            strg[i]=strg[i+1]+strg[i+2]+strg[i+3]+strg[i+4]+strg[i+5]+strg[i+6];
        }
        return strg[0];

    }
    public static int BPBUSE(int end)
    {
        int [] strg=new int[6];
        strg[0]=1;
        for(int slide=1;slide<=end;slide++)
        {
            int sum=strg[0]+strg[1]+strg[2]+strg[3]+strg[4]+strg[5];
            strg[5]=strg[4];
            strg[4]=strg[3];
            strg[3]=strg[2];
            strg[2]=strg[1];
            strg[1]=strg[0];
            strg[0]=sum;
        }
        return strg[0];
    }
    
}
 
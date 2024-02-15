package DP;

public class LCS {
    public static int LCSRecusrion(String s1, String s2)
    {
        if(s1.length()==0 || s2.length()==0)
        return 0;
        char ch1=s1.charAt(0);
        char ch2=s2.charAt(0);
        String ros1=s1.substring(1);
        String ros2=s2.substring(1);
        int ans=0;
        if(ch1==ch2)
        {
            ans=LCSRecusrion(ros1, ros2)+1;
        }
        else{
           int o1= LCSRecusrion(s1, ros2);
            int o2=LCSRecusrion(ros1,s2);
            ans=Math.max(o1,o2);
        }
        return ans;
    }
    public static int LCSRecusrionVIdx(String s1, String s2,int vidx1,int vidx2)
    {
        if(s1.length()==vidx1 || s2.length()==vidx2)
        return 0;
        char ch1=s1.charAt(vidx1);
        char ch2=s2.charAt(vidx2);
        int ans=0;
        if(ch1==ch2)
        {
            ans=LCSRecusrionVIdx(s1,s2,vidx1+1,vidx2+1)+1;
        }
        else{
           int o1= LCSRecusrionVIdx(s1, s2,vidx1,vidx2+1);
            int o2=LCSRecusrionVIdx(s1,s2,vidx1+1,vidx2);
            ans=Math.max(o1,o2);
        }
        return ans;
    }
    public static int LCSRecusrionBU(String s1, String s2)
    {
        int [][]strg=new int[s1.length()+1][s2.length()+1];
        for(int row=s1.length()-1;row>=0;row--)
        {
            for(int col=s2.length()-1;col>=0;col--)
            {
                if(s1.charAt(row)==s2.charAt(col))
                {
                    strg[row][col]=strg[row+1][col+1]+1;
                }
                else{
                    strg[row][col]=Math.max(strg[row+1][col],strg[row][col+1]);
                }
            }
        }
        return strg[0][0];

    }
    public static int LCSRecusrionTD(String s1, String s2,int vidx1,int vidx2,int [][]strg)
    {
        if(s1.length()==vidx1 || s2.length()==vidx2)
        return 0;
        if(strg[vidx1][vidx2]!=-1)
        return strg[vidx1][vidx2];

        char ch1=s1.charAt(vidx1);
        char ch2=s2.charAt(vidx2);
        int ans=0;
        if(ch1==ch2)
        {
            ans=LCSRecusrionTD(s1,s2,vidx1+1,vidx2+1,strg)+1;
        }
        else{
           int o1= LCSRecusrionTD(s1, s2,vidx1,vidx2+1,strg);
            int o2=LCSRecusrionTD(s1,s2,vidx1+1,vidx2,strg);
            ans=Math.max(o1,o2);
        }
        strg[vidx1][vidx2]=ans;
        return ans;
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="agcfd";
        System.out.println(LCSRecusrion(s1, s2));
        System.out.println(LCSRecusrionVIdx(s1, s2, 0, 0));
        int [][]strg=new int[s1.length()][s2.length()];
        for(int i=0;i<strg.length;i++)
        {
            for(int j=0;j<strg[0].length;j++)
             strg[i][j]=-1;
        }

        System.out.println(LCSRecusrionTD(s1, s2, 0, 0,strg));
        
    }
}

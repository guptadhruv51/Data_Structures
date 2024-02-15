package DP;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class editdistance
 {
    public static void main(String[] args) 
    {
        String s1="abcd";
        String s2="abcfd";
        int [][]strg=new int [s1.length()][s2.length()];
        for(int i=0;i<strg.length;i++)
        Arrays.fill(strg[i],-1);
        System.out.println(EDTD(s1, s2, 0, 0, strg));
        System.out.println(EDrec(s1,s2));
        System.out.println(EDrecvidx(s1,s2,0,0));
        System.out.println(EDBU(s1, s2));

    }
    public static int EDrec(String s1, String s2)
    {
        if(s1.length()==0 || s2.length()==0)
        {
            return Math.max(s1.length(),s2.length());
        }
        char ch1=s1.charAt(0);
        char ch2=s2.charAt(0);
        String ros1=s1.substring(1);
        String ros2=s2.substring(1); 
        int ans=0;
        if(ch1==ch2)
        {
            ans=EDrec(ros1, ros2);
        }
        else
        {
            int i=EDrec(ros1, s2);
            int d=EDrec(s1, ros2);
            int r=EDrec(ros1, ros2);
            ans=Math.min(i,Math.min(d,r))+1;

        }
        return ans;
    }
    public static int EDrecvidx(String s1, String s2,int vidx1,int vidx2)
    {
        if(s1.length()==vidx1 || s2.length()==vidx2)
        {
            return Math.max(s1.length()-vidx1,s2.length()-vidx2);
        }
        char ch1=s1.charAt(vidx1);
        char ch2=s2.charAt(vidx2);
        int ans=0;
        if(ch1==ch2)
        {
            ans=EDrecvidx(s1,s2,vidx1+1,vidx2+1);
        }
        else
        {
            int i=EDrecvidx(s1, s2,vidx1+1,vidx2);
            int d=EDrecvidx(s1, s2,vidx1,vidx2+1);
            int r=EDrecvidx(s1, s2,vidx1+1,vidx2+1);
            ans=Math.min(i,Math.min(d,r))+1;

        }
        return ans;
    }
    public static int EDTD(String s1, String s2,int vidx1,int vidx2,int [][]strg)
    {
        if(s1.length()==vidx1 || s2.length()==vidx2)
        {
            return Math.max(s1.length()-vidx1,s2.length()-vidx2);
        }
        if(strg[vidx1][vidx2]!=-1)
        {
            return strg[vidx1][vidx2];
        }
        char ch1=s1.charAt(vidx1);
        char ch2=s2.charAt(vidx2);
        int ans=0;
        if(ch1==ch2)
        {
            ans=EDTD(s1,s2,vidx1+1,vidx2+1,strg);
        }
        else
        {
            int i=EDTD(s1, s2,vidx1+1,vidx2,strg);
            int d=EDTD(s1, s2,vidx1,vidx2+1,strg);
            int r=EDTD(s1, s2,vidx1+1,vidx2+1,strg);
            ans=Math.min(i,Math.min(d,r))+1;

        }
        strg[vidx1][vidx2]=ans;
        return ans;
    }

    public static int EDBU(String s1, String s2)
    {
        int [][]strg=new int[s1.length()+1][s2.length()+1];
        //for(int i=0;i<=s2.length();i++)
        //{
          //  strg[s1.length()][i]=s2.length()-i;
        //}
        //for(int i=0;i<=s1.length();i++)
        //{
          //  strg[i][s2.length()]=s1.length()-i;
       // }
        for(int i=s1.length();i>=0;i--)
        {
            for(int j=s2.length();j>=0;j--)
            {
                if(i==s1.length())
                {
                    strg[i][j]=s2.length()-j;
                }
                else if(j==s2.length())
                {
                    strg[i][j]=s1.length()-i;
                }
                else
                {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    strg[i][j]=strg[i+1][j+1];
                }
                else
                {
                    strg[i][j]=Math.min(strg[i+1][j],Math.min(strg[i+1][j+1],strg[i][j+1]))+1;
                }
            }
            }
        }
        return strg[0][0];

    }
}

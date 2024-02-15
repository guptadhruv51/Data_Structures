package Recursion;

import java.util.ArrayList;

public class getpermutation {
    public static ArrayList<String> getP(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add(" ");
            return base;
        }

        char cc=str.charAt(0);
        String res=str.substring(1);
        ArrayList<String> rres=getP(res);
        ArrayList<String> myres=new ArrayList<>();
        for(String rrs:rres)
        {
            for(int i=0;i<rrs.length();i++)
            {
                String s=rrs.substring(0,i)+cc+rrs.substring(i);
                myres.add(s);
            }
        }
        return myres;
    }
    public static void main(String[] args) {
        System.out.println(getP("abb"));
    }
}

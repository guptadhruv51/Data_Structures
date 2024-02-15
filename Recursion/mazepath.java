package Recursion;

import java.util.ArrayList;

public class mazepath 
{
    public static ArrayList<String> getpath(int cr,int cc,int er, int ec)
    {
        if(cr==er && cc==ec)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(cr>er || cc>ec)
        {
            ArrayList<String> base=new ArrayList<>();
            //base.add("");
            return base;
        }
        ArrayList<String> mres=new ArrayList<>();
       ArrayList<String>rrh= getpath(cr, cc+1, er, ec);
       for(String rrs:rrh)
       {
        mres.add("H"+rrs);
       }
       ArrayList<String>rrv= getpath(cr+1, cc, er, ec);
       for(String rrs:rrv)
       {
        mres.add("V"+rrs);
       }
       return mres;

}
public static void main(String[] args) {
    System.out.println(getpath(0, 0, 2, 2));
}
    
}

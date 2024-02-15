package Recursion;

import java.util.ArrayList;

public class Subsequences 
{
    public static ArrayList<String> getss(String str)
    {   
        if(str.length()==0)
        {
            ArrayList<String> baseresult=new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> recresult=getss(ros);
        ArrayList<String> myresult=new ArrayList<>();
        for(int i=0;i<recresult.size();i++)
        {
            myresult.add(recresult.get(i));
            myresult.add(cc+recresult.get(i));
        }
        return myresult; 


    }
    public static void main(String[] args) 
    {
        System.out.println( getss("abc"));
        
    }
    
}

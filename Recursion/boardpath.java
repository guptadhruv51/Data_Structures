package Recursion;
import java.util.*;
public class boardpath 
{

    public static ArrayList<String> getboardpath(int current,int end)
    {
        if(current==end)
        {
            ArrayList<String> br=new ArrayList<>();
            br.add(" ");
            return br;

        }
        if(current>end)
        {
            ArrayList<String> br=new ArrayList<>();
            return br;
        }
        ArrayList<String> mr=new ArrayList<>();
        for(int dice=1;dice<=6;dice++)
        {
            ArrayList<String>rr= getboardpath(current+dice, end);
            for(String rrs:rr)
            {
                mr.add(dice+rrs);
            }

          
    }
    return mr;  
}
public static void main(String[] args) {
    System.out.println(getboardpath(0, 10));
}
}

package Hashmap;

import java.util.HashMap;
import java.security.KeyStore.Entry;
import java.util.*;

public class hashmapdemo 
{

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("USA",200);
        map.put("CHINA",100);
        map.put("UK",300);
        map.put("India",400);
        System.out.println(map);
        System.out.println(map.get("India"));
        System.out.println(map.get("Japan"));
        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key);
        }
        Collection<Integer> val=map.values();
        for(Integer values: val)
        System.out.println(values);
       //  System.out.println(keys);
       Set<Map.Entry<String,Integer>> entryset=map.entrySet();
       System.out.println("***********Entry Set");
       for(Map.Entry<String,Integer> entry: entryset)
       {
        System.out.println(entry.getKey()+"=>"+entry.getValue() );

       }
       System.out.println("**********Max occuring character**********");
       String str="aaaaaaabbbbddddcc";
       System.out.println(getMaxFrew(str));
       System.out.println("*********Intersection************");
       int []one={1,2,3,4,5,6,7,8};
       int [] two={3,4,5,10,11,13};
       ArrayList<Integer> ls=getIntersect(one,two);
       System.out.println(ls);
       
    }
    public static char getMaxFrew(String str)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char cc=str.charAt(i);
            if(map.containsKey(cc))
            {
                int ov=map.get(cc);
                int nv=ov+1;
                map.put(cc,nv);
            }
            else
            {
                map.put(cc, 1);
            }
        }
        int maxval=0;
        char maxchar='\0';
        Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
        for(Map.Entry<Character,Integer> entry:entryset)
        {
            if(entry.getValue()>maxval)
            {
            maxchar=entry.getKey();
            maxval=entry.getValue();
            }
        }
        return maxchar;
    }
    public static ArrayList<Integer> getIntersect(int []one,int[]two)
    {

            HashMap<Integer,Boolean> map=new HashMap<>();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<one.length;i++)
            {
                map.put(one[i],false);

            }
            for(int i=0;i<two.length;i++)
            {
                if(map.containsKey(two[i]))
                {
                    map.put(two[i],true);
                }
            }
            Set<Map.Entry<Integer,Boolean>> entryset= map.entrySet();
            for(Map.Entry<Integer,Boolean> entry:entryset)
            {
                if(entry.getValue()==true)
                {
                    list.add(entry.getKey());
                }
            }
            return list;
    } 
}

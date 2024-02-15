import java.util.HashMap;

class hashmap
{
  public static char max_freq(String str)
  {
    HashMap<Character,Integer> hm=new HashMap<>();
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if(hm.containsKey(ch))
      {
        int old=hm.get(ch);
        hm.put(ch,old+1);
      }
      else
      {
        hm.put(ch,1);
      }
    }
    char max=str.charAt(0);
    for(Character ch:hm.keySet())
    {
      if(hm.get(ch)>hm.get(max))
      max=ch;
    }
    return max;

  }
public static void get_common(int a[],int b[])
{
  HashMap<Integer,Integer> hm=new HashMap<>();
  for(int i=0;i<a.length;i++)
  {
    if(hm.containsKey(a[i]))
    {
      int old=hm.get(a[i]);
      hm.put(a[i],old+1);
    }
    else
    {
      hm.put(a[i],1);
    }
  }
  for(int val: b)
  {
    if(hm.containsKey(val))
    {
      System.out.println(val);
      hm.remove(val);
    }
  }
}
public static void longest_sub(int a[])
{
  HashMap<Integer,Boolean> hm=new HashMap<>();
  for(int val:a)
  {
    hm.put(val,true);
  }
  for(int i:hm.keySet())
  {
    int val=i-1;
    if(hm.containsKey(val))
    {
      hm.put(i,false);
    }
  }
  int msp=0;
  int ml=0;
  for(int val:a)
  {
    if(hm.get(val)==true)
    {
      int t1=1;
      int tsp=val;
      while(hm.containsKey(tsp+t1))
      {
        t1++;
      }
      if(t1>ml)
      {
        msp=tsp;
        ml=t1;
      }
    }
  }
  for(int i=0;i<ml;i++)
  {
    System.out.println(msp+i);
  }

}  
public static void main(String[] args) 
  {
    System.out.println(max_freq("Dhruv"));
  }
}
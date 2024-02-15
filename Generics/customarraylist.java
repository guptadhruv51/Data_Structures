package Generics;

import java.util.ArrayList;

public class customarraylist<T> 
{
  private Object []data;
  private int size;
  private int DEFAULT_CAPACITY=10;
  public customarraylist()
  {
    this.data=new Object[DEFAULT_CAPACITY];
  } 
  public void add(T num)
  {
    if(isFull())
        resize();
    this.data[size++]=num;
  }
  private boolean isFull()
  {
    return data.length==size;
  }
  private void resize()
  {
    Object[]temp=new Object[data.length*2];
    for(int i=0;i<data.length;i++)
    {
      temp[i]=data[i];
    }
    data=temp;
  }
  public T remove()
  {
    T removed=(T)(data[--size]);
    return removed;
  }
public int size()
{
return size;
}
public void set(int index,T value)
{
  data[index]=value;
}
@Override
public String toString()
    {
        String temp="";
        for(Object ob:data)
        {

            temp=temp+ob+',';
            
        }
        String temp1=temp.substring(0, temp.length()-1);
        return "["+temp1+"]";
    }

public static void main(String[] args) {
  customarraylist<Integer>ls=new customarraylist<>();
  for(int i=0;i<14;i++)
  ls.add(i);

  System.out.println(ls);
}
}

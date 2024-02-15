package Stacks;

public class customstack 
{
  protected int [] data;
  private static final int DEFAULT_SIZE=10; 
  private int ptr=-1;
  public customstack()
  {
    this(DEFAULT_SIZE);
  }
  public customstack(int size)
  {
    this.data=new int[size];
  }
  public boolean push(int val)
  {
    if(isFull())
    {
      System.out.println("Stack is Full");
      return false;
    }
    ptr++;
    data[ptr]=val;
    return true;
  }
  public int peek() throws Exception
  {
    if(isEmpty())
    {
      throw new Exception("Stack is Empty");
    }
    return data[ptr];
  }
  public int pop()
  {
    if(isEmpty())
    {
      System.out.println("Stack is Empty");
      return -1;
    }
    int val=data[ptr];
    ptr--;
    return val;
  }
  protected boolean isFull()
  {
    if(ptr==this.data.length-1)
    {
      return true;
    }
    return false;
  }
  private boolean isEmpty()
  {
    return ptr==-1;
  }

}

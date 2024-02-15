package Queue;
public class customqueue 
{
  private int[]data;
  private static final int Default_size=10;
  private int end=0;
  public customqueue()
  {
    this(Default_size);
  }
  public customqueue(int size)
  {
    this.data=new int[size];
  }
  public boolean insert(int val)
  {
    if(isFull())
    {
      System.out.println("Queue is Full");
      return false;
    }
    data[end++]=val;
    return true;
  }
  public int display() throws Exception
  {
    if(isEmpty())
    {
      throw new Exception("Queue is Empty");
    }
    return data[0];
  }
  public int remove () throws Exception
  {
    if(isEmpty())
    {
      throw new Exception("Queue is Empty");
    }
    int removed=data[0];
    for(int i=1;i<data.length;i++)
    {
      data[i-1]=data[i];
    }
    end--;
    return removed;
    
  }
  protected boolean isFull()
  {
    if(end==this.data.length-1)
    {
      return true;
    }
    return false;
  }
  private boolean isEmpty()
  {
    return end==0;
  } 
}

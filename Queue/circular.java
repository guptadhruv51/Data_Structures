package Queue;

public class circular 
{
  private int[]data;
  private static final int Default_size=10;
  private int end=0;
  private int front=0;
  private int size=0;
  public circular()
  {
    this(Default_size);
  }
  public circular(int size)
  {
    this.data=new int[size];
  }
  public int remove () throws Exception
  {
    if(isEmpty())
    {
      throw new Exception("Queue is Empty");
    }
    int removed=data[front++];
    front=front%data.length;
    size--;
    return removed;
    
  } 
  public boolean insert(int val)
  {
    if(isFull())
    {
      System.out.println("Queue is Full");
      return false;
    }
    data[end++]=val;
    end=end%data.length;
    size++;
    return true;
  }
  protected boolean isFull()
  {
    if(size==this.data.length-1)
    {
      return true;
    }
    return false;
  }
  private boolean isEmpty()
  {
    return end==0;
  } 
  public int front() throws Exception
  {
    if(isEmpty())
    {
      throw new Exception("Queue is empty");
    }
    return data[front];

  }
}

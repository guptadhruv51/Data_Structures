import java.util.Collections;
import java.util.PriorityQueue;

public class medianpq 
{
  // create two priority queues 
  // left priority is max priority queue keeps max in the peak
  // right priority is min priority 
  // make sure that the number of elements in both the queues don't differ by more than 1
  // by default add in left 
  // add in right only if there's something in the right and queue and element is bigger than the peak element
  // to check median check size of both and the median will be the peak of the queue with bigger length
  public static class MedianPriorityQueue
  {
    PriorityQueue<Integer> first;
    PriorityQueue<Integer> second;
    public MedianPriorityQueue()
    {
      first=new PriorityQueue<>(Collections.reverseOrder());
      second=new PriorityQueue<>();  
    
    }
    public void add(int val)
    {
      if(second.size()>0 && val>second.peek())
      {
        second.add(val);
      }
      else{
        first.add(val);
      }
      if(first.size()-second.size()==2)
      {
        second.add(first.remove());
      }
      else if(second.size()-first.size()==2)
      {
        first.add(second.remove());
      }


    }
    public int remove()
    {
      if(this.size()==0)
      {
        System.out.println("Underflow");
        return -1;
      }

      else if(first.size()>=second.size())
      {
        return first.remove();
      }
      else 
      {
        return second.remove();
      }


    }
    public int peek()
    {
      if(this.size()==0)
      {
        System.out.println("Underflow");
        return -1;
      }

      else if(first.size()>=second.size())
      {
        return first.peek();
      }
      else 
      {
        return second.peek();
      }
    }
    public int size()
    {
      return first.size()+second.size();
    }

    }

    public static void main(String[] args) throws Exception{
      MedianPriorityQueue qu=new MedianPriorityQueue();
      qu.add(10);
      qu.add(20);
      qu.add(30);
      qu.add(40);
      qu.peek();
      qu.add(50);
      qu.peek();
      qu.remove();
      qu.peek();
      qu.remove();
      qu.peek();
      System.out.println(qu.peek());
    }
  }

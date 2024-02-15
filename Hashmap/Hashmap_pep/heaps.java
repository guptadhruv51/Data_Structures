import java.util.PriorityQueue;

public class heaps 
{
public static void kLargest(int arr[],int k)
  {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); higher priority to bigger value
    for(int i=0;i<arr.length;i++)
    {
    if(i<k)
    {
      pq.add(arr[i]);
    }
    else 
    {
      if(arr[i]>pq.peek())
      {
        pq.remove();
        pq.add(arr[i]);
      }
    }
  }
  while(pq.size()>0)
  {
    System.out.println(pq.remove());
  }
}
public static void K_unsort(int arr[], int k)
{
  PriorityQueue<Integer> pq=new PriorityQueue<>();
  for(int i=0;i<=k;i++)
  {
    pq.add(arr[i]);
  }
  for(int i=k+1;i<arr.length;i++)
  {
    System.out.println(pq.remove());
    pq.add(arr[i]);
  }
while(pq.size()!=0)
{
  System.out.println(pq.remove());
}
} 

public static void main(String[] args) 
  {
    int a[]={2,3,1,4,6,7,5,8,9};
    kLargest(a,4);
    K_unsort(a, 2);
    
  }
  
}

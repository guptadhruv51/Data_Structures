package Arrays;

public class maxsumsubarray 
{
  public static void main(String[] args) 
  {
    int []arr=new int[]{-5,1,-2,3,-1,2,-2};
    System.out.println(maxsum(arr));
    
  }
  public static int maxsum(int [] arr)
  {
    int sum=arr[0];
    int maxending=arr[0];
    for(int i=1;i<arr.length;i++)
    {
      maxending=Math.max(arr[i]+maxending,arr[i]);
      sum=Math.max(maxending, sum);
    }
    return sum;
  }
  
}

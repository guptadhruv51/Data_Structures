package DP;
import java.util.*;

public class test
{
    
    public static void main(String args[]) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr=new int[n];
		int [] arr1=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			int count=0;
			int dec=0;
			while(arr[i]!=0)
			{
				dec+=(arr[i]%10)*Math.pow(2,count);
				arr[i]=arr[i]/10;
				count++;
			}
	arr1[i]=dec;
		}	
		for(int i=0;i<n;i++)
        System.out.println(arr1[i]);
    
}
}


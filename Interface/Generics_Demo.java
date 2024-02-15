package Interface;

import java.util.Comparator;

public class Generics_Demo {
    public static void main(String[] args) 
    {
        Car[] cars=new Car[5];
        cars[0]=new Car(1000,100,"Red");
        cars[1]=new Car(900 ,200,"Red1");
        cars[2]=new Car(3000,300,"Red2");
        cars[3]=new Car(4000,400,"Red3");
        cars[4]=new Car(5000,500,"Red4");

       // display(cars);// prints the address of the onbject 
        // every class in java by default extends object class
        //Object obj=new Object();
        bubblesort(cars,new carspeedcomparator() );
        display(cars);
        
    }
    public static <T> void display(T[] arr)
    {
        for(T val:arr)
        {
            System.out.println(val+" ");
        }
        System.out.println();
    }
public static <T extends Comparable<T>> void bubblesort(T[] arr)
{
    for(int counter=0;counter<arr.length-1;counter++) //indexing is always integer type
    {
        for(int j=0;j<arr.length-1-counter;j++)
        {
            if(arr[j].compareTo(arr[j+1])>0)
            {
                T temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    } 
}

public static <T> void bubblesort(T[] arr,Comparator <T> comp)
{
    for(int counter=0;counter<arr.length-1;counter++) //indexing is always integer type
    {
        for(int j=0;j<arr.length-1-counter;j++)
        {
            if(comp.compare(arr[j],arr[j+1]) >0)
            {
                T temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    } 
}
    
}

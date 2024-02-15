package Heap;
import Interface.*;

public class Heapgenericclient 
{
    public static void main(String[] args) {
        
        Car[] cars=new Car[5];
        cars[0]=new Car(1000,100,"Red");
        cars[1]=new Car(900 ,200,"Red1");
        cars[2]=new Car(3000,300,"Red2");
        cars[3]=new Car(4000,400,"Red3");
        cars[4]=new Car(5000,500,"Red4");
        HeapGenerics<Car> heapg=new HeapGenerics<>();
        heapg.add(cars[0]);
        heapg.add(cars[1]);
        heapg.add(cars[2]);
        heapg.add(cars[3]);
        heapg.add(cars[4]);

        System.out.println(heapg.remove());
        System.out.println(heapg.remove());
        System.out.println(heapg.remove());
        System.out.println(heapg.remove());
        System.out.println(heapg.remove());
        


    }
    
}

package Interface;
// Comparable is an interface 
// needs to give body to comparable's functions
public class Car implements Comparable<Car> 
{
    int speed;
    int price;
    String color;
    public Car(int speed, int price, String color)
    {
        this.speed=speed;
        this.price=price;
        this.color=color;
    }
    @Override
    public String toString() 
    {
        // TODO Auto-generated method stub
        return "S:" +this.speed+" P: "+this.price+" C: "+this.color;
    }
    //@Override
    public int compareTo(Car other) {
        // whenever we use c1.compare(c2) ci is this and c2 is other 
        // if this.priority greater return +ve else -ve 
        return this.speed-other.speed;
        // TODO Auto-generated method stub
        //  return 0;
    }
        
}

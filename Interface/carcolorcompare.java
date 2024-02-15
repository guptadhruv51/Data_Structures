package Interface;

import java.util.Comparator;

public class carcolorcompare implements Comparator <Car> 
{
     @Override
     public int compare(Car o1, Car o2) {
         // TODO Auto-generated method stub
         return o1.color.compareTo(o2.color); 
     }
    
}

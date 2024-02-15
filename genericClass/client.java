package genericClass;

public class client 
{
    public static void main(String[] args) {
       Pair<String> pair =new Pair<>();
        pair.one="abc";
        pair.two="def";
        Pair<Integer> pair2=new Pair<>();
        pair2.one=1;
        pair2.two=2;
        Pair2<Integer,String> p1=new Pair2<>();
        p1.one=20;
        p1.two="Hi";
    }
    
}

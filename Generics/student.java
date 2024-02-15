package Generics;



public class student implements Comparable<student>
{
  private int roll;
  private int marks;
  student(int roll, int marks)
  {
    this.marks=marks;
    this.roll=roll;
  }

  @Override
  public int compareTo(student o) {
    // TODO Auto-generated method stub
    int diff=this.marks-o.marks;
    //if diff==0 equal, diff<0 o is greater  
    return diff;
  }
public static void main(String[] args) {
  student Dhruv=new student(1, 91);
  student Yuvi=new student(2, 92);
  student sachin=new student(3, 93);
  student rahul=new student(4, 94);
  student arpit=new student(5, 95);
  student bhavya=new student(6, 96);
  student[]ls={Dhruv,Yuvi,sachin,rahul,arpit,bhavya};
  System.out.println(Dhruv.compareTo(Yuvi));
}  
}

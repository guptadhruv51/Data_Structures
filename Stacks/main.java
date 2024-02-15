package Stacks;

public class main 
{
  public static void main(String[] args) 
  {
    customstack stack=new customstack();
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    System.out.println(stack.pop());
    
  }
  
}

package Linked_List;

public class llmain {
    public static void main(String[] args) 
    {
        ll l1=new ll();
        l1.insertFirst(1);
        l1.insertLast(3);
        l1.inserAt(2, 1);
        l1.display();
       System.out.println(l1.deleteAt(1));
        l1.display();
        
    }
    
}

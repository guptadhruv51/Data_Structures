package genericClass;

public class LinkedListgeneric <T>

{

    private class Node{
        T data; // wherever the return data is the data of the node change it from int to T 
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void display(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
}

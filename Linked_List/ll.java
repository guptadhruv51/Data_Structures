package Linked_List;

public class ll {
    private Node head;
    private Node tail;
    private int size;
    public ll()
    {
        this.size=0;
    }
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }   
        size++; 
    }
    public void insertLast(int val)
    {
        if(head==null)
        {
         Node temp=new Node(val);
         head=temp;
         size++;
         return;
        }
        Node temp=head;
        
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new Node(val);
        size++;
    }
    public void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("Empty LL");
        }
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public void inserAt(int val,int index)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        Node x=new Node(val);
        x.next=temp.next;
        temp.next=x;
        size++;

    }
    public int deleteFirst()
    {
        if(size==1)
        {
            int data=head.data;
            head=null;
            size--;
            return data;
        }
        int data=head.data;
        head=head.next;
        size--;
        return  data;

    }
    public int deleteEnd()
    {
        if(size<=1)
        {
            return deleteFirst();
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        return val;
    }
    public int deleteAt(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==size)
        {
            return deleteEnd();
        }
        Node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=temp.next.next;
        size--;
        return val;
    }
    
    private class Node
    {
        private int data;
        private Node next;
        public Node(int value)
        {
            this.data=value;
        }
        public Node(int value, Node next)
        {
            this.data=value;
            this.next=next;
        }
    }
    
    
}

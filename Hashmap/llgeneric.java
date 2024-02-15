package Hashmap;



public class llgeneric <T>

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
    public T getFirst() throws Exception{
        if(this.size==0)
        {
            throw new Exception("Empty");
        }
        return this.head.data; 
    }
    public T getLast() throws Exception{
        if(this.size==0)
        {
            throw new Exception("Empty");
        }
        return this.tail.data;
    }
    public T getAt(int idx) throws Exception{
        if(this.size==0)
        {
            throw new Exception("Empty");
        }
        if(idx<0 || idx>this.size)
        {
            throw new Exception("Invalid idx");
        }
        Node temp=this.head;
        for(int i=1;i<=idx;i++)
        {
            temp=temp.next;
        }
        return temp.data;

    }
    private Node getNodeAt(int idx) throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Empty");
        }
        if(idx<0 || idx>=this.size)
        {
            throw new Exception("Invalid idx");
        }
        Node temp=this.head;
        for(int i=1;i<=idx;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void addLast(T item)
    {
        Node nn= new Node();
        nn.data=item;
        nn.next=null;
        if(this.size>=1)
        {
            this.tail.next=nn;
        }
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size++;

        }
        else{
            this.tail=nn;
            this.size++;
        }

    }
    public void addFirst(T item)
    {
        Node nn=new Node();
        nn.data=item;
        nn.next=null;
        if(this.size>=1)
        {
            nn.next=head;
        }
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else
        {
            this.head=nn;
            this.size++;
        }
    }
    public void addAt(T item,int idx) throws Exception{
        if(idx<0 || idx>size)
        {
            throw new Exception("Invalid index");
        }
        if(idx==0)
        {
            addFirst(item);
        }
        else if(idx==this.size)
        {
            addLast(item);
        }
        else 
        {
            Node nn=new Node();
            nn.data=item;
            nn.next=null;

            Node nm1=getNodeAt(idx-1);
            Node np1=nm1.next;
            nm1.next=nn;
            nn.next=np1;
            this.size++;
        }
    }
    public T removeFirst() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Empty");
        }
        T rv=this.head.data;
        if(this.size==1)
        {
             this.head=null;
             this.tail=null;
             this.size=0;   
        }
        else
        {
            this.head=head.next;
            this.size--;
        }
        return rv;
    }
    public T removeLast() throws Exception{
        if(this.size==0)
        {
            throw new Exception("Empty");
        }
        T rv=this.tail.data;
        if(this.size==1)
        {
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        else{
            Node sm2=getNodeAt(this.size-2);
            this.tail=sm2;
            this.tail.next=null;
            this.size--;
        }
        return rv;
    }
    public T removeAt(int idx) throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Empty");
        }
        else if(idx<0 || idx>=this.size)
        {
            throw new Exception("Invalid");
        }
        if(idx==0)
        {
            return removeFirst();
        }
        else if(idx==this.size-1)
        {
            return removeLast();
        }
        else 
        {
            Node sz1=getNodeAt(idx-1);
            Node n=sz1.next;
            Node np1=n.next;
            sz1.next=np1;
            this.size--;
            return n.data;
        }
        
    }
    public int find(T data)
    {
        int idx=0;
        for(Node temp=this.head; temp!=null;temp=temp.next)
        {
            if(temp.data.equals(data))
            {
                return idx;
            }
            idx++;
        }
        return -1;
    }

}


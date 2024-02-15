package Trees;
import java.util.ArrayList;
import java.util.Scanner;
public class GenericTree {
    private class Node{
        int data;
        ArrayList<Node> children;
        Node(int data)
        {
            this.data=data;
            this.children=new ArrayList<>();
        }

    }
    private Node root;
    private int size;
    GenericTree()
    {
        Scanner scn=new Scanner(System.in);
        this.root=takeinput(scn,null,0);
    }
    // input for tree
    private Node takeinput(Scanner s, Node parent,int itchild)
    {
        if(parent==null)
        {
            System.out.println("Enter data for root node");

            
        }
        else
        {
            System.out.println("Enter data for "+itchild+"child of"+parent.data);
        }
        int data=s.nextInt();
        Node node=new Node(data);
        this.size++;
        System.out.println("Enter number of children"+node.data);
        int children=s.nextInt();
        for(int i=0;i<children;i++)
        {
            Node child=takeinput(s, node, i);
            node.children.add(child);
        }
        return node;
        
    }
    public void display()
    {
        this.display(this.root);

    }
    private void display(Node node)
    {
        String str=node.data+"->";
        for(int i=0;i<node.children.size();i++)
        {
            str=str+node.children.get(i).data+", ";
        }
        str=str+"END";
        System.out.println(str);
        for(int i=0;i<node.children.size();i++)
        this.display(node.children.get(i));
    }

    
}

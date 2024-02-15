package Trees;

import java.util.ArrayList;
import java.util.Scanner;
public class BinaryTree 
{
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    private Node root=null;
    private int size=0;
    BinaryTree()
    {
        Scanner s=new Scanner(System.in);
        this.root=takeInput(s,null,false);
    }
    private Node takeInput(Scanner s, Node parent,boolean isLeftorRight) 
//if false right else left child
    {
        if (parent==null)
        {
            System.out.println("Enter data for root node");
        }
        else
        {
            if(isLeftorRight)
            {
                System.out.println("Enter data for left child of "+parent.data);
            }
            else
            {
                System.out.println("Enter data for right child of "+parent.data);

            }

        }
        int nodedata=s.nextInt();
        Node node=new Node(nodedata,null,null); // null represents data for left child and right child
        this.size++;
        boolean choice=false;
        System.out.println("Do you have left child");
        choice=s.nextBoolean();
        if(choice)
        {
            node.left=takeInput(s, node, true);
        }

        choice=false;
        System.out.println("Do you have right child");
        choice=s.nextBoolean();
        if(choice)
        {
            node.right=takeInput(s, node, false);
        }
        return node;
    }
public void display()
{
this.display(this.root);
}
private void display(Node node)
{
    // print left child + root+ right child
    String str="";
    if(node.left!=null)
    {
        str=str+node.left.data+"=>";
    }
    else{
        str=str+"EnD=>";
    }
    str=str+node.data;
    if(node.right!=null)
    {
        str=str+"<="+node.right.data;
    }
    else{
        str=str+"<=EnD";
    }
    System.out.println(str);
    if(node.left!=null)
    {
        this.display(node.left);
    }
    if(node.right!=null)
    {
        this.display(node.right);
    }
}
public int height()
{
    return this.height(this.root);
}
public void postOrder()
{
    this.postOrder(this.root);
}
private void postOrder(Node node)
{
    if(node==null)
    return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data+",");
}
public void preOrder()
{
    this.preOrder(this.root);
}
private void preOrder(Node node)
{
    if(node==null)
    return;
    System.out.print(node.data+",");
    postOrder(node.left);
    postOrder(node.right);
    
}
public void inOrder()
{
    this.inOrder(this.root);
}
private void inOrder(Node node)
{
    if(node==null)
    return;
    inOrder(node.left);
    System.out.print(node.data+",");
    inOrder(node.right);
    
}
//public void levelOrder()
//{
    //LinkedList<Node> queue=new LinkedList<>();
//}
//private void levelOrder(Node node)
//{

//}
private int height(Node node)
{
    // if node is null return height=-1
    // add +1 to the max of height given by the subtrees (left and right)
    if(node==null)
    {
        return -1;
    }
    int lheight=this.height(node.left);
    int rheight=this.height(node.right);
    int height=Math.max(lheight,rheight)+1;
    return height;

}
public boolean isBst()
{
    return this.isBst(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);

}
private boolean isBst(Node node,int min,int max)
{
    if(node==null)
    {
    return true;
    }
    if(node.data>max || node.data<min)
    {
        return false;
    }
    else if(!this.isBst(node.left,min,node.data))
    {
        return false;
    }
    else if(!this.isBst(node.right,node.data,max))
    {
        return false;
    }
    return true;


}
public int diameter()
{
    return this.diameter(this.root);
}
private int diameter(Node node)
{
    if(node==null)
    return 0;
    int case1=this.height(node.left)+this.height(node.right)+2;
    int case2=this.height(node.left);
    int case3=this.height(node.right);
    int ans=Math.max(case1,Math.max(case2,case3));
    return ans;
}
public int diameterbtr()
{
    return this.diameterbtr(this.root).diameter;
}
private DiaPair diameterbtr(Node node)
{   if(node==null)
    {
        DiaPair bp=new DiaPair(-1,0);
        return bp;
    }
    DiaPair lp=this.diameterbtr(node.left);
    DiaPair rp=this.diameterbtr(node.right);
    DiaPair mp=new DiaPair();
    mp.height=Math.max(lp.height,rp.height)+1;
    mp.diameter=Math.max(lp.height+rp.height+2,Math.max(lp.diameter,rp.diameter));
    return mp;
}
public class DiaPair{
    int height;
    int diameter;
    // diamter of all nodes
    DiaPair()
    {

    }
    DiaPair(int height,int diameter)
    {
        this.height=height;
        this.diameter=diameter;
    }
}
public int sumleaf()
{
return this.sumleaf(this.root);
}   
private int sumleaf(Node node)
{   if(node==null)
    {
        return 0;
    }
    if(node.left==null&&node.right==null)
    return node.data;

    int lsum=sumleaf(node.left);
    int rsum=sumleaf(node.right);
    return lsum+rsum;
}
    
}

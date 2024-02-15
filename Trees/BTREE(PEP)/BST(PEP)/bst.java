class bst
{
  public static class Node
  {
    int data;
    Node right;
    Node left;
    Node(int data,Node left,Node right)
    {
      this.data=data;
      this.right=right;
      this.left=left;
    }
  } 
public static Node construct(int []arr,int lo, int hi)
{
  if(lo>hi)
  {
    return null;
  }
  int mid=(lo+hi)/2;
  int data=arr[mid];
  Node lc=construct(arr,lo,mid-1);
  Node rc=construct(arr,mid+1,hi);
  Node root=new Node(data,lc,rc);
  return root;
}
public static int size(Node root)
{
  if(root==null)
  {
    return 0;
  }
  int size=size(root.left)+size(root.right)+1;
  return size;
}
public static int max_1(Node root)
{
if(root==null)
{
  return Integer.MIN_VALUE;
}
  int max=Math.max(root.data,Math.max(max_1(root.right),max_1(root.left)));
  return max;
}
public static void display(Node root)
{
  if(root==null)
  {
    return;
  }
  if(root.left!=null && root.right!=null)
  {
    System.out.println(root.left.data+"->"+root.data+"<-"+root.right.data);
  }
  else if(root.left==null && root.right!=null)
  {
    System.out.println(".->"+root.data+"<-"+root.right.data);
  }
  else if(root.right==null && root.left!=null)
  {
    System.out.println(root.left.data+"->"+root.data+"<-.");
  }
  else 
  {
    System.out.println(".->"+root.data+"<-.");
  }
  display(root.left);
  display(root.right);
}
public static int height(Node root)
{
  if(root==null)
  {
    return 0;
  }

  int height=Math.max(height(root.left),height(root.right))+1;
  return height;
}
public static Node add(Node node,int data)
{
  if(node==null)
  {
    return new Node(data,null,null);
  }
  if(data>node.data)
  {
    node.right=add(node.right,data);
  }
  else if(node.data>data)
  {
    node.left=add(node.left,data);
  }
  else{
    return new Node(data,null,null);
  }
return node;
}
public static Node remove(Node node, int data)
{
  if(node==null)
  {
    return null;
  }
  if(node.data>data)
  {
    remove(node.left,data);
  }
  else if(node.data<data)
  {
    remove(node.right,data);
  }
  else 
  {
    if(node.left!=null && node.right!=null)
    {
      int lmax=max_1(node.left);
      node.data=lmax;
      node.left=remove(node.left,lmax);
      return node;

    }
    else if(node.left!=null)
    {
      return node.left;
    }
    else if(node.right!=null)
    {
      return node.right;
    }
    else
    {
      return null;
    }
  }
  return node;
}
public static int sum=0;
public static void rwsol(Node node)
{
  if(node==null)
  {
    return;
  }
  //reverse in order
  rwsol(node.right);
  int od=node.data;
  node.data=sum;
  sum+=od;
  rwsol(node.left);
}
public static int lca(Node node,int d1,int d2)
{
  if(d1<node.data && d2<node.data)
  {
    return lca(node.left,d1,d2);
  }
  else if(d1>node.data && d2>node.data)
  {
    return lca(node.right,d1,d2);
  }
  else
  {
    return node.data;
  }

}
public static void pir(Node node,int d1,int d2)
{
  if(node.data>d1 && node.data>d2)
  {
    pir(node.left,d1,d2);
  }
  else if(node.data<d1 && node.data<d2)
  {
    pir(node.right,d1,d2);
  }
  else 
  {
    pir(node.left,d1,d2);
    System.out.println(node.data);
    pir(node.right,d1,d2);
  }

}
public static boolean find(Node root,int data)
{
  boolean val=false;
  if(data>root.data)
  {
    val=find(root.right,data);
  }
  else if(data<root.data)
  {
    val=find(root.left,data);
  }
  else if(data==root.data)
  {
    return true;
  }
  return val;
}
public static void travelandPrint(Node root,Node node, int tar)
{
travelandPrint(root,node.left, tar);
int comp=tar-node.data;
if(node.data<comp) //removes duplicates
{
if(find(root,comp))
{
  System.out.println(node.data+" "+comp);
}
}
}
public static void main(String[] args) throws Exception
  {
    int []arr={12,25,37,50,62,75,87};
    Node root= construct(arr,0,arr.length-1);
    display(root);
    System.out.println(max_1(root));
    System.out.println(height(root));
    
  }
}
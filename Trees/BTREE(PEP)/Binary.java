import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayList;
public class Binary
{
public static class Node
{
  int data;
  Node right;
  Node left;
  Node()
  {

  }
  Node(int data,Node left,Node right)
  {
    this.data=data;
    this.right=right;
    this.left=left;
  }
}
//public static Node construct
public static class Pair
{
Node node;
int state;
Pair(){}
Pair(Node node,int state)
{
  this .node=node;
  this.state=state;
}
}
public static Node construct(Integer[]arr) {
  Node root = new Node(arr[0],null,null);

  Stack< Pair>st = new Stack< >();
  Pair root_pair = new Pair(root, 1);

  st.push(root_pair);
  int idx = 1;

  while (st.size() > 0) {
    Pair top = st.peek();

    if (top.state == 1) {
      //waiting for left child
      top.state++;
      if (arr[idx] != null) {
        Node lc = new Node(arr[idx],null,null);
        top.node.left = lc;

        Pair lcp = new Pair(lc, 1);
        st.push(lcp);
      }
      idx++;
    }
    else if (top.state == 2) {
      //waiting for right child
      top.state++;
      if (arr[idx] != null) {
        Node rc = new Node(arr[idx],null,null);
        top.node.right = rc;

        Pair rcp = new Pair(rc, 1);
        st.push(rcp);
      }
      idx++;
    }
    else if (top.state == 3) {
      st.pop();
    }
  }
  return root;

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
public static int size(Node root)
{int size=0;
if(root==null)
{
  return size;
}
 size=size(root.left)+size(root.right)+1; 

  return size;
}
public static int sum(Node root)
{
  int sum=0;
  if(root==null)
  {
    return sum;
  }
  sum+=sum(root.left)+sum(root.right)+root.data;
  return sum;
}
public static int Max(Node root)
{
  if(root==null)
  {
    return Integer.MIN_VALUE;
  }
  int max=Math.max(Max(root.left),Max(root.right));
  max=Math.max(max,root.data);
  return max;
}
public static int height(Node root)
{
  if(root==null)
  {
    return -1;
  }
int lh=height(root.left);
int rh=height(root.right);
int th=Math.max(lh,rh)+1;
return th;
}
public static void preOrder(Node root)
{
  if(root==null)
  {
    return;
  }
  System.out.println(root.data);
  preOrder(root.left);
  preOrder(root.right);
}
public static void inOrder(Node root)
{
  if(root==null)
  {
    return;
  }
  inOrder(root.left);
  System.out.println(root.data);
  inOrder(root.right);
}
public static void postOrder(Node root)
{
  if(root==null)
  {
    return;
  }
  postOrder(root.left);
  postOrder(root.right);
  System.out.println(root.data);
}
public static void LevelOrder(Node root)
{
  if(root==null)
  {
    return;
  }
  Queue<Node> q=new ArrayDeque<>();
  q.add(root);
  while(q.size()!=0)
  {
    int size=q.size();
    for(int i=0;i<size;i++)
    {
    Node node=q.remove();
    System.out.print(node.data+" ");
    if(node.left!=null)
    {
      q.add(node.left);
    }
    if(node.right!=null)
    {
      q.add(node.right);
    }
  }
  System.out.println();
  }
} 
public static ArrayList<Integer> NodeToRootPath(Node root,int x)
{
  if(root==null)
  {
    return new ArrayList<>();
     
  }
  if(root.data==x)
  {
    ArrayList<Integer> br=new ArrayList<>();
    br.add(root.data);
    return br;
  }
  ArrayList<Integer>llist=NodeToRootPath(root.left, x);
  if(llist.size()!=0)
  {
    llist.add(root.data);
    return llist;
  }
  ArrayList<Integer>rlist=NodeToRootPath(root.right, x);
  if(rlist.size()!=0)
  {
    rlist.add(root.data);
    return rlist;
  }
  return new ArrayList<>();
  
}
public static void kLevels(Node root,int k)
{
  if(k<0 || root==null)
  {
    return;
  }
  if(k==0)
  {
    System.out.println(root.data);
    return;
  }
  kLevels(root.left, k-1);
  kLevels(root.right, k-1);
}
static ArrayList<Node> path;
public static boolean find(Node node, int data)
{
  if(node==null)
  return false;
  if(node.data==data)
  {
    path.add(node);
    return true;
  }
  boolean filc=find(node.left,data);
  if(filc)
  {
    path.add(node);
    return true;
  }
  boolean firc=find(node.right,data);
  if(firc)
  {
    path.add(node);
    return true;
  }
  return false;
}
public static void printKNodesFar(Node node,int data, int k)
{
path=new ArrayList<>();
find(node, data);
for(int i=0;i<path.size()&&i<k;i++)
{
  kLevels(path.get(i),k-i,i==0?null:path.get(i-1));
}
}
public static void kLevels(Node root,int k,Node block)
{
  if(k<0 || root==null|| root==block)
  {
    return;
  }
  if(k==0)
  {
    System.out.println(root.data);
    return;
  }
  kLevels(root.left, k-1,block);
  kLevels(root.right, k-1,block);
}
public static void pathtoLeafFromRoot(Node node, String path, int sum, int lo, int hi)
{
  if(node==null)
  {
    return;
  }
  if(node.left==null && node.right==null)
  {
    sum=node.data+sum;
    if(sum>=lo && sum<=hi)
    {
      System.out.println(path+node.data);
      return;
    }
  }
  pathtoLeafFromRoot(node.left, path+node.data+" ", sum+node.data, lo, hi);
  pathtoLeafFromRoot(node.right, path+node.data+" ", sum+node.data, lo, hi);
}
public static Node createLeftClone(Node root)
{
  if(root==null)
  {
    return null;
  }  
  Node lcr=createLeftClone(root.left);
  Node rcr=createLeftClone(root.right);
  root.right=rcr;
  Node nl=new Node(root.data,lcr,null);
  root.left=nl;
return root;

}
public static Node LeftCloneRev(Node root)
{
  if(root==null)
  {
    return null;
  }
  Node l=LeftCloneRev(root.left.left);
  Node r=LeftCloneRev(root.right);
  root.left=l;
  root.right=r;
  return root;
}
public static void printSingleChildNodes(Node node, Node parent)
{
  if(node==null)
  {
    return;
  }
  if(parent!=null && parent.left==node && parent.right==null)
  {
    System.out.println(node.data);
    return;
  }
  else if(parent!=null && parent.right==node && parent.left==null)
  {
    System.out.println(node.data);
    return;
  }
  printSingleChildNodes(node.left, node);
  printSingleChildNodes(node.right, node);
  // write your code here
}
public static Node removeLeaves(Node node)
{
  if(node==null)
  {
    return null;
  }
  if(node.left==null && node.right==null)
  {
    return null;
  }
  Node lc=removeLeaves(node.left);
  Node rc=removeLeaves(node.right);
  node.left=lc;
  node.right=rc;
  return node;
}
static int tilt=0;
public static int Tilt(Node node)
{
  int l=Tilt(node.left);
  int r=Tilt(node.right);
  int ts=l+r+node.data;
  tilt+=Math.abs(l-r);
  return ts;
  
}
public static class BSTPair
{
boolean isBst;
int min;
int max;
}
public static BSTPair isBst(Node node)
{
  if(node==null)
  {
    BSTPair bp=new BSTPair();
    bp.min=Integer.MAX_VALUE;
    bp.max=Integer.MIN_VALUE;
    bp.isBst=true;
    return bp;
  }
  BSTPair lp=isBst(node.left);
  BSTPair rp=isBst(node.right);
  BSTPair mp=new BSTPair();
  mp.isBst=lp.isBst && rp.isBst&&
          (node.data>=lp.max && node.data<=rp.min);
  mp.min=Math.min(node.data,Math.min(lp.min,rp.min));
  mp.max=Math.max(node.data,Math.max(lp.max,rp.max));
  return mp;        
}
static boolean isbalanced=true;
public static int isbalanced(Node root)
{
  if(root==null)
  {
    return 0;
  }
  int l=isbalanced(root.left);
  int r=isbalanced(root.right);
  if(Math.abs(l-r)>1)
  {
    isbalanced=false;
  }
  int h=Math.max(l, r)+1;
  return h;
}
public static void main(String[] args) throws Exception
{
Integer []arr={50,25,12,null,null,37,30,null,
              null,null,75,62,null,70,null,null,87,null,null};
Node root=construct(arr);
display(root);
System.out.println(size(root));
System.out.println(sum(root));
System.out.println(Max(root));
System.out.println();
preOrder(root);
System.out.println();
inOrder(root);
System.out.println();
postOrder(root);
System.out.println();
LevelOrder(root);
ArrayList<Integer> path=NodeToRootPath(root, 70);
System.out.println(path);
System.out.println();
kLevels(root, 1);
printKNodesFar(root, 12, 2);
//root=removeLeaves(root);
//display(root);
}
}
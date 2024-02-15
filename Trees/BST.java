package Trees;

import javax.lang.model.util.ElementScanner14;

public class BST 
{
    private class Node {
        int data;
        Node left;
        Node right;
    }
        private Node root;
        //Node(int data,Node left,Node right)
        //{
          //  this.data=data;
            //this.left=left;
            //this.right=right; 
        //}
        public BST(int[] arr)
        {
            this.root=construct(arr,0,arr.length-1);
             
        }
        private Node construct(int[] arr, int lo,int hi)
        {   
            if(lo>hi)
            {
                return null;
            }
            // mid
            int mid=(lo+hi)/2;
            //new Node 
            Node nn=new Node();
            nn.data=arr[mid];
            nn.left=construct(arr,lo,mid-1);  
            nn.right=construct(arr,mid+1, hi);
            return  nn;
        }
        public void display()
        {
            this.display(this.root);
        }
        private void display(Node node)
        {
            if(node==null)
            return ;
            String str="";
            if(node.left!=null)
            {
                str=str+node.left.data;
            }
            else{
                str=str+".";
            }
            str=str+"-> "+node.data+"<-";
            if(node.right!=null)
            {
                str=str+"<- "+node.right.data;
            }
            else{
                str=str+".";
            }
            System.out.println(str);
           this.display(node.left);
        this.display(node.right);

        }
        public boolean find(int number)
        {
            return this.find(this.root,number);
        }
        private boolean find(Node node, int num)
        {   
            if(node==null)
            {
                return false;
            }
            if(node.data>num)
            {
                return find(node.left,num);
            }
            else if(node.data<num)
            {
                return find(node.right,num);
            }
            else{
                return true;
            }

        }
        public void add(int num)
        {
            this.add(this.root,num);
        }
        private void add(Node node, int num)
        {
             if(num>node.data)
             {  if(node.right==null)
                {
                    Node nn=new Node();
                    nn.data=num;
                    node.right=nn;
                }
                else
                {
                    add(node.right,num);
                }
             }
             else
             {
                    if(node.left==null)
                    {
                        Node nn=new Node();
                        nn.data=num;
                        node.left=nn;
                    }
                    else{
                        add(node.left,num);
                    }

             }
        }
        public int max()
        {
            return this.max(this.root);
        }
        private int max(Node node)
        {
            if(node.right!=null)
            {
                return max(node.right);
            }
            else{
                return node.data;
            }
        }
        public void remove(int n)
        {
            this.remove(this.root,null,false,n);
        }
        private void remove(Node node,Node parent ,boolean value,int num)
        {   
            if(node==null)
            {
                return;
            }
            if(num>node.data)
            {
                remove(node.right, node, false, num);
            } 
            else if(num<node.data)
            {
                remove(node.left,node,true,num);
            }
            else 
            {
                if(node.left==null && node.right==null)
                {
                    if(value)
                    {
                        parent.left=null;
                    }
                    else
                    {
                        parent.right=null;
                    }
                }
                else if(node.left==null && node.right!=null)
                {
                    if(value)
                    {
                        parent.left=node.right;
                    }
                    else
                    {
                        parent.right=node.right;
                    }
                }
                else if(node.left!=null && node.right==null)
                {
                    if(value)
                    {
                        parent.left=node.left;
                    }
                    else{
                        parent.right=node.left;
                    }
                }
                else 
                {
                    int max1=max(node.left);
                    node.data=max1;
                    remove(node.left,node,true,max1);

                }

            }

        }


    }


    


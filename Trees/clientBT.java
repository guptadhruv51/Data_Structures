package Trees;

public class clientBT 
{
    public static void main(String[] args)
    {
        BinaryTree tree=new BinaryTree();
        tree.display();
        //50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false 
        System.out.println("Height is"+tree.height());
        tree.preOrder();
        System.out.println(" Post Order now");
        tree.postOrder();
        System.out.println(" In Order now");
        tree.inOrder();
        System.out.println(tree.isBst());
        tree.diameter();
    }
 

    
}

package Recursion;

public class permutation_print 
{
    public static void perm_print(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            String roq=ques.substring(0, i)+ques.substring(i+1);
            perm_print(roq, ans+ch);

        }
    }
    public static void main(String[] args) {
        perm_print("abc","");
    }
    
}

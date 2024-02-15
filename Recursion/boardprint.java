package Recursion;

public class boardprint {

    public static void print_board(int curr, int end, String ans)
    {
        if(curr==end)
        {
            System.out.println(ans);
            return;
        }
        if(curr>end)
        {
            return;
        }
        for(int i=1;i<=6;i++)
        {
            print_board(curr+i, end, ans+i);
        }
    }
    public static void main(String[] args) {
        print_board(0, 10, "");
    }
}

package Recursion;

public class countboard_print 
{
    public static int count_board(int curr,int end)
    {
        
        if(curr==end)
        {
            return 1;
        }
        if(curr>end)
        {
            return 0;
        }
        int count=0;
        for(int i=1;i<=6;i++)
        {
            count+=count_board(curr+i, end);
        }
        return count; 
    }
    public static void main(String[] args) {
        System.out.println(count_board(0, 10));
    }
}

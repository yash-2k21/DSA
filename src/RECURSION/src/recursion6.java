import java.util.Scanner;

public class recursion6
{
    static void decimaltobinary(int n)
    {
        if(n<=0)
        {
            //System.out.println();
            return ;
        }
        else
        {
            System.out.print((n%2));
        }
        decimaltobinary(n/2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        decimaltobinary(n);
    }
}

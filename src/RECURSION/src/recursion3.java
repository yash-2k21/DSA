// Calculate the factorial of a number using recursion

import java.util.*;

public class recursion3
{
    static int factorial(int n)
    {
        if(n<=1 )
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your choice ");
        int num= sc.nextInt();
        System.out.println(factorial(num));
    }
}

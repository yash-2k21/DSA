// Find the nth fibonacci number

import java.util.*;

public class recursion2
{
    static int func(int n)
    {
        if(n<2)       //base condition
        {
            return n;
        }
        else             //recursive condition
        {
            return func(n-1)  + func(n-2);
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}

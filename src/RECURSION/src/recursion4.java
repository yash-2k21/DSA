// To print the number using RECURSION

import java.util.*;
import java.lang.*;

public class recursion4
{
    static int s=0,r;
    static void reverse(int n)
    {
        //int s;
        if(n<=0)      // base condition
        {
            System.out.println(s);
            return ;
        }
        else
        {
            //System.out.print((n%10));
            r=n%10;
            s=s*10 + r;
        }
        reverse(n/10);          //recursive condition
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        reverse(num);

    }
}

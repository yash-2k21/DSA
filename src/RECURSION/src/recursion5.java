// To find the power raised to the number through recursion

import java.util.Scanner;

public class recursion5
{
    static int p=1;
    static int power(int a,int b)
    {
        if(b==0)             //base condition
        {
            //System.out.println(p);
            return p;
        }
        else
        {
            p=p*a;
        }
        b=b-1;
        return power(a,b);          //recursive condtion
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x,y));
    }
}

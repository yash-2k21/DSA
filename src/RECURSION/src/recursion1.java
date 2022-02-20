// print number 1 to 10 through recursion

public class recursion1
{
    static void print(int n)
    {
        if(n==10)       //Base Condition
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);                   //Recursive call
    }
    public static void main(String[] args) {
        print(1);
    }
}

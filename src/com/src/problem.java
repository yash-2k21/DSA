import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class problem
{
    static void getSquareSortedArray (int[] arr)
    {
        int n = arr.length;
        int temp;
        int[] res = new int[n];
        for(int i=0 ; i<arr.length ; i++)
        {
            res[i] = arr[i]*arr[i];
            //System.out.print(res[i]+" ");
        }
        System.out.println(Arrays.toString(res));
        for(int j=0 ; j<n ; j++)
        {
            for(int i=1 ; i<n ; i++)
            {
                if(res[i] < res[i-1])
                {
                    temp = res[i-1];
                    res[i-1] = res[i];
                    res[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args)
    {
        int[] arr = {6, -8, 3, -1, 4};
        getSquareSortedArray(arr);
        //System.out.println(yes);
    }
}

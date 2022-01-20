package com.yash;

import java.util.Scanner;

public class FindMin
{
    public static int func(int[] arr )
    {
        int min=arr[0];
        for(int i=0 ; i<arr.length ; i++)
        {
            int num = arr[i];
            if(num < min)
            {
                min=num ;
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        int[] arr = {12,3,45,9,8,1};
        int ans = func(arr);
        System.out.println(ans);
    }
}

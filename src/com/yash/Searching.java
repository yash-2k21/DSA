package com.yash;

import java.util.Scanner;

public class Searching
{
    public static int func(int[] arr , int target)
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            int num = arr[i];
            if(num ==target)
            {
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Searching element = ");
        int target = sc.nextInt();
        int ans = func(arr,target);
        System.out.println(ans);
    }
}

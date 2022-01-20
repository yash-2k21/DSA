package com.yash;

import java.util.Scanner;

public class SearchInRange
{
    public static int func(int[] arr , int target , int start , int end)
    {
        for(int i=start ; i<=end; i++)
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
        System.out.println("Enter the Range = ");
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Enter the Searching element = ");
        int target = sc.nextInt();
        int ans = func(arr,target,s,e);
        System.out.println(ans);
    }
}

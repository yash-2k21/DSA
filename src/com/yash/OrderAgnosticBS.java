package com.yash;

public class OrderAgnosticBS
{
    static int Search(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1 ;
        if(arr[start] > arr[end])
        {
            System.out.println("hii");
            while (start <= end)
            {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        else
        {
            System.out.println("hii");
            while(start <= end)
            {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr ={-15,-13,-8,2,3,4,6,8,13,34,56,67};   //{34,21,18,15,13,12,9,7};
        int t = 13;
        int ans = Search(arr,t);
        System.out.println("hello");
        System.out.println(ans);
    }
}

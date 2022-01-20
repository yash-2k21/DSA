package com.yash;

public class StringSearch
{
    public static int func(String S , char t)
    {
         for(int i=0 ; i<S.length() ; i++)
         {
             if(S.charAt(i)==t)
             {
                 return i;
             }
         }
         return -1;
    }
    public static void main(String[] args)
    {
        String S = "Yash";
        char t = 'm';
        System.out.println(func(S,t));
    }
}

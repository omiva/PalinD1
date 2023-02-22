package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int rev, sum=0, temp;
        int n=454;

        temp=n;
        while(n>0)
        {
            rev=n%10;
            sum=(sum*10)+rev;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("true");
        }
        else
         System.out.println("false");
    }
}

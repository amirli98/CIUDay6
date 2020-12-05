package com.company.chapter6;

public class Recursion {
    static int triangle(int n)
    {
        int total = 0;
        while (n>0)
        {
            total += n;
            n--;
        }
        return total;
    }

    static int recursiveTriangle(int n)
    {
        if(n==1)
            return 1;
        else return n + recursiveTriangle(n-1);
    }

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        int a = triangle(100_00);
        long end = System.currentTimeMillis();
        System.out.println(end-now);
        long now1 = System.currentTimeMillis();
        int b = recursiveTriangle(100_00);
        long end1 = System.currentTimeMillis();
        System.out.println(end1-now1);
        System.out.println(a+" "+b);
    }
}

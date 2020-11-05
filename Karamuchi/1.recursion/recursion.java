package Karamuchi.recursion;

import java.util.Scanner;

public class recursion {
    static final StringBuilder sb = new StringBuilder();

    static int Factorials(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorials(n - 1);
        }
    }

    static int Fibonacci(int limit, int a ,int b ) {
        if (a >= limit) {
            return 1;
        } else {
            sb.append(a).append(" ");
            int temp = b;
            b = b+a;
            a = b;
            return Fibonacci(limit, a,b);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        recursion rec = new recursion(); if your method is non static
        System.out.print("Print no. to calculate Factorial: ");
        int test = Factorials(Integer.parseInt(sc.nextLine()));
        System.out.println(test);

        System.out.print("Print upto what no. you need fibonacci: ");
        int limit = Fibonacci(Integer.parseInt(sc.nextLine()),0,1);
        System.out.println(sb);

    }
}

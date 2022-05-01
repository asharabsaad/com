package com.asharab;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        boolean ans = isPrime(a);
//        System.out.println(ans);
//        int b = in.nextInt();

        for(int i = 100 ; i < 1000; i++)
            if (Armstrong(i)) System.out.print(i + " ");
    }
    static Boolean Armstrong(int n){
        int original = n;

        int ans = 0;
        while(n > 0){

            int rem = n % 10;
            ans = ans + rem * rem * rem;
            n = n / 10;
        }
        return ans == original;
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c= 2;
        while (c * c < n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}

package com.asharab;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        for( int i = 2; i < n; i++){
            if ( n % i == 0 ){
                System.out.println("NOn Prime");
                break;
            }
            else {
                System.out.println("prime");
            }
        }
    }
}

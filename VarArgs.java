package com.asharab;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,4,4,54,54,5,45,4,5,6,5,6,3);
        multiple(2,4,"Asharab","Ali");
    }

    static void multiple (int a , int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

}

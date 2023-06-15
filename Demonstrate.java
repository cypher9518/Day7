package com.basicjava;

public class Demonstrate {
    static int x = 50;
    static int y;
    static void fun(int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    static{
        y = x+5;
    }
    public static void main(String[] args) {
        fun(8);
    }
}

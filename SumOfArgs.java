package com.basicjava;

public class SumOfArgs {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int total = x + y;
        System.out.println("Sum is :" + total);
    }
}

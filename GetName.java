package com.basicjava;

import java.util.Scanner;

public class GetName {
    public static void main(String[] args) {
//      System.out.println(args[0]);
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = ab.nextLine();
        System.out.println("Name is : " + name);
    }
}

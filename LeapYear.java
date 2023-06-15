package com.basicjava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = ab.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " is leap year");
                }
                else
                    System.out.println(year + " is NOT leap year");
            }
            else
                System.out.println(year + " is leap year");
        }
        else
            System.out.println(year + " is NOT leap year");
    }
}

package com.bootcoding;

import java.util.Scanner;

public class InputEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x = sc.nextInt();
        System.out.println("Enter Second Number:");
        int y = sc.nextInt();
        if(x == y) {
            System.out.println("Number are same!");
        }else{
            System.out.println("Number are different!");
        }
    }
}

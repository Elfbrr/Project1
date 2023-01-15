package Homeworks;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Methods60 {
    public static void main(String[] args) {
        //2- Define a program to find out whether a given number is even or odd.
        Scanner sc = new Scanner(System.in);
        int num5;
        System.out.println("Enter the value");
        num5 = sc.nextInt();
        if (num5 % 2 == 0) {
            System.out.println(num5 + " is a even number");
        } else {
            System.out.println(num5 + "  is a odd number");
        }


    }
}


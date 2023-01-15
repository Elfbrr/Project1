package Homeworks;

import java.util.Scanner;


public class Methods8 {
    public static void main(String[] args) {
        sample();
        Methods8 sum2= new Methods8();
        sum2.addition(1,2);
        int totalAddition= sum2.sum(2,2);
        System.out.println(totalAddition);
    }
    public void addition(int z, int t){
        System.out.println(z+t);
    }

    /**11- Given two int values, return their sum. Unless the two values are the same,
         then return double their sum.

    sumDouble(1, 2) → 3
     sumDouble(3, 2) → 5
     sumDouble(2, 2) → 8*/
    public int sum(int z, int t) {
        if(z==t){
            return ((z+t)*2);
        }
        else{
            return z+t;
        }


    }

    //2- Write a method that returns true when x is equal to y; otherwise return false.
    public static boolean xequaly(int x, int y) {
        return (x == y);
    }
    public static void sample() {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        x = sc.nextInt();
        System.out.println("Enter y");
        y = sc.nextInt();
        System.out.println(xequaly(x, y));

    }




    }




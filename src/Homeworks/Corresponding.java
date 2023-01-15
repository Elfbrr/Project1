package Homeworks;
import java.util.Scanner;
import java.util.Arrays;
public class Corresponding {
    public static void main(String[] args) {


        /*6. Write a Java method to multiply corresponding elements of two arrays of integers.
        Sample input:
        Array1: [1, 3, -5, 4]
        Array2: [1, 4, -5, -2]*/


        int[] leftArray = {1, 3, -5, 4};
        int[] rightArray = {1, 4, -5, -2};
        String result = "";
        for (int i = 0; i < leftArray.length; i++) {
            result += Integer.toString(leftArray[i] * rightArray[i]) + " ";
        }
        System.out.println(result);


        /**7. Write a Java program start with an integer n,
         *divide n by 2 if n is even or multiply by 3 and add
         *  1 if n is odd, repeat the process until n = 1.*/
        System.out.println("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n + 1) / 2;
            }
        }
        System.out.println("n = " + n);
        in.close();



    }
}
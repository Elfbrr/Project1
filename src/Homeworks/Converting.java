package Homeworks;
import java.util.Arrays;
import java.util.Scanner;

public class Converting {
         //1- Write a method that takes an integer minutes, converts it to seconds and returns as long.
        //1. write a method that can convert km to miles
        // 2. write a method that can convert gallons to litters

        public static void main(String[] args) {
            Converting sc = new Converting();
            sc.calculation1(120, 0, 0.612); //km to miles
            sc.calculation1(30, 0, 3.75); //gallon to litre
            sc.calculation(1, 0, 60); //minute to second

            //3. write a method that can print out the array in Descending order
            int[] numbers1 = {40, 50, 78, 12, 6};
            sc.convertNumber(numbers1);
            System.out.println();


        }
        public void calculation1(int a, double b, double e) {
            System.out.println(b = a * e);

        }

        public void calculation(int a, int b, int e) {
            System.out.println(b = a * e);
        }


        public void convertNumber(int[] array) {
            Arrays.sort(array);
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();

            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(array[j] + " ");


            }
        }

}

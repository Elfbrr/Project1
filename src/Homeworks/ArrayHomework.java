package Homeworks;

import java.util.Arrays;
public class ArrayHomework {
    public static void main(String[] args) {

        /**Homework 1
         * Example 1:
         * Create a function that finds the second-smallest item in integer array;
         * Input{1903,1905,1907,1961,1999,2011,2023}
         * Output: 1905
         */


            int[] numbers = {1903, 1905, 1907, 1961, 1999, 2011, 2023};
            Arrays.sort(numbers);
            System.out.println(numbers[1]);

            System.out.println("------------------");

            /** Example 2:
             * Create a program that displays a right triangle with contents of an array

             Input{1,2,3,4}
             Output:
             1
             12
             123
             1234
             Input{A,B,C,D}
             Output
             A
             AB
             ABC
             ABCD*/

            int List[] = {1, 2, 3, 4};
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(List[j] + " ");
                }
                System.out.println();
            }


            System.out.println("------------------");
            String[] letters = {"A", "B", "C", "D",};
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(letters[j] + " ");

                }
                System.out.println();
            }

            System.out.println("------------------");


            /**Example 3:

             Create a program that rotates the contents of an array to the right, returning new array

             Input:{1,2,3,4,5}
             Output:{5,1,2,3,4}
             Output:{4,5,1,2,3}

             */


            /** question 3/1 */
            int[] numbs = {1, 2, 3, 4, 5};
            //needs to find index value
            int last = numbs[numbs.length - 1]; // to store last element= (5 elements) length-index *means (size-1)
            int n = 1;      //1 <= 1
            for (int j = 1; j <= n; j++) { //external loop
                //(5)               //4 index      4>0 3>0 2>0 1>0
                for (int i = numbs.length - 1; i > 0; i--) { //i-- because decreasing
                    numbs[i] = numbs[i - 1];
                }                //5-1 = 4 0 1 2 3 4
                numbs[0] = last;

            }

            System.out.println(Arrays.toString(numbs)); //we need to convert int to string
            System.out.println("------------------");


        int[] Q3Array1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array : " + Arrays.toString(Q3Array1));
        for (int i = n;i > 0; i--) {
            int temp = Q3Array1[Q3Array1.length - 1];
            int j = Q3Array1.length - 1;
            for (; j > 0; j--) {
                Q3Array1[j] = Q3Array1[j - 1];
            }
            Q3Array1[0] = temp;
            //++n
            System.out.println("New right rotated array: " + Arrays.toString(Q3Array1));
            // if(n==Q3Array1.length)break;
        }
        System.out.println("1================1");


            /** question 3/2 */
            int[] numbs1 = {1, 2, 3, 4, 5};
            //needs to find index value
            int lasts = numbs1[numbs1.length-1]; // to store last element= (5 elements) length-index *means (size-1)
            int k = 1;
            for (int b = 1; b <= k; b++) { //external loop

                for (int i = numbs1.length-1; i > 0; i--) { //i-- because decreasing
                    numbs1[i] = numbs[i - 1];
                }
                numbs1[0] = last-1;
            }

            System.out.println(Arrays.toString(numbs1));

            System.out.println("------------------");


            /**Example 4: Create a program that moves all the zeros in a given array to the end in place

             Input:[1,0,1,1,0,0,0,1]
             Output:[1,1,1,1,0,0,0,0]*/

            int[] givenNumbers = {1, 0, 1, 1, 0, 0, 0, 1};
            int count = 0;
            int z = 8;
            for (int i = 0; i < z; i++) {
                if (givenNumbers[i] > 0) { //
                    givenNumbers[count++] = givenNumbers[i]; //1,1,1,1,0, 0, 0, 0 count=4
                }
            }
            while (count < z) { //count=4 4<8 5<8 6<8 7<8
                givenNumbers[count++] = 0; //0,0,0
            }


            for (int i = 0; i < z; i++) {  //i = 0 1 2 3 4 5 6 7
                System.out.print(givenNumbers[i] + " ");  //1,1,1,1,0,0,0,0
            }

            System.out.println();
            System.out.println("------------------");


            /**Example 5:

             Create a program that reverses an array in place
             Modify the contents of the inputted array

             Input:{1,2,3,4,5}
             Output:{5,4,3,2,1}?*/

            int[] a = {1,2,3,4,5};
            int b = 0;
            int[] reversedArray = new int[5];
            for (int i = a.length - 1; i >= 0; i--) {
                //System.out.println(a[i]);
                reversedArray[b] = a[i];
                b++;
            }
            System.out.print(Arrays.toString(reversedArray));
            System.out.println();
            System.out.println("------------------");


            /**Example 6:

             Create a program using arrays that sorts a list of integers in descending order.
             Descending order is the highest value to lowest.
             In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
             ultimately have an array with 106,81,26, 15, 5 in it.
             Set up the program so that the numbers to sort are read in from the keyboard.

             Implement the following methods - getIntegers, printArray, and sortIntegers
             getIntegers returns an array of entered integers from keyboard
             printArray prints out the contents of the array
             and sortIntegers should sort the array and return a new array containing the sorted numbers
             you will have to figure out how to copy the array elements from the passed array into a new
             array and sort them and return the new sorted array.*/

            int[] numbers1 = {15, 37, 4, 86, 77};

            Arrays.sort(numbers1);
            System.out.print(Arrays.toString(numbers1));
            System.out.println();

            System.out.println("------------------");

            for (int i = numbers1.length - 1; i >= 0; i--) {
                System.out.print(numbers1[i] + " ");
            }

            System.out.println();

            for (int i = numbers1.length - 5; i <= 4; i++) {
                System.out.print(numbers1[i] + " ");

            }
            System.out.println();
            System.out.println("------------------");

        /** Create a program that displays a right triangle with contents of an array

         Input{1,2,3,4}
         Output:
         1
         12
         123
         1234
         Input{A,B,C,D}
         Output
         A
         AB
         ABC
         ABCD*/

        String numbers2[]= {"A","B","C","D"};
        for (int i=0; i<numbers2.length; i++){
            for (int j=0; j<=i; j++){
                System.out.print(numbers2[j]);

            }
            System.out.println();
     }





}
}



package Homeworks;

import java.util.Scanner;
public class ScannerConverting {

        public static void main(String[] args){
            /**3- Write a java program to convert Fahrenheit to Celsius using user input.
             Formula: Celsius= (Fahrenheit-32)*5/9
             Given : 87F
             Calculation:  (87-32)*5/9=30.5 Celcius
             **/
            Scanner input=new Scanner (System.in);
            System.out.println("Enter the Fahrenheit value");

            double fahrenheit=input.nextDouble();
            double celsius=(fahrenheit-32)*5/9;
            System.out.println("Celsius: " +celsius);

           /**4- Write a java program to swap two numbers (user scanner class for user inputs):
 Given: a=20, b=30
 Output: a=30, b=20
 */

            Scanner numb = new Scanner(System.in);
            System.out.println("Enter two number that you want to swap");

            int a= numb.nextInt();
            int b= numb.nextInt();
            System.out.println("You entered a= " +a +"b= " +b);

            int temp=0;
            temp=a;
            a=b;
            b=temp;

            System.out.println("Swapped values a" +a+ "b= " +b);


            //6- Write a java program to find the smallest number (user scanner class for user inputs)

            Scanner normal=new Scanner(System.in);
            System.out.println("Enter the numbers");

            int number1=normal.nextInt();



            /**5- Write a java program for adding 2 numbers (user scanner class for user inputs):
             */
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter two numbers you wanna add");
            int firstNumber= obj.nextInt();
            int secondNumber=obj.nextInt();
            int total=firstNumber+secondNumber;
            System.out.println("Total:" +total);


            /** 13- Write a java program to print the multiplication table for the given range by user input.
             input: 1 10
             output:
             2 * 1 =2 		3 *1 = 3 		4 * 1 =4 		5 * 1 =5
             2 * 2 =4 		3 *2 = 6 		4 * 2=8 		5 * 2 =10
             */

            Scanner scanner =new Scanner(System.in);
            System.out.println("Please put your first number");
            int number2= scanner.nextInt();
            System.out.println("Please put your second number");
            int number3=scanner.nextInt();

            int results=1;
            for(int i=number1; i<=number2;i++){
                for(int j=number1;j<=12;j++){
                    results=i*j;
                    System.out.println(i+"*"+j+"="+results+" \t");

                }
                scanner.close();
            }

            /**
             9- Write a java program to reverse a given number (user scanner class for user inputs)
             input: 45678 , Output: 87654
             10- Write a java program that accepts user input as integer from keyboard until enter 0 to stop.
             11- Write a java program to print the alphabets with the given range via keyboard.
             12- Write a java program to print the multiplication table for given user input.
             13- Write a java program to print the multiplication table for the given range by user input.
             input: 2 5
             output:
             2 * 1 =2 		3 *1 = 3 		4 * 1 =4 		5 * 1 =5
             2 * 2 =4 		3 *2 = 6 		4 * 2=8 		5 * 2 =10
             14-Write a java program to find the given number is Armstrong number or not?
             }
             */
        }

    }


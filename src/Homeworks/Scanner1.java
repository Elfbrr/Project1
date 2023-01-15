package Homeworks;


import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        //1- Write a java program to print integers from 1 to 100
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        //2-Write a java program to get below inputs from user
        //     Enter your Name
        //     Enter your Gender
        //     Enter your Age
        //     Enter your Phone Number
        //     Enter your City
        //     And print these in puts in below format:


        //Please verify below details are correct:
        //     Choose one of the option(1 or 2):
        //     1- All given information are correct
        //     2- I need to re-enter the information
        //     Name 			: John Doe
        //     Gender			: Male
        //     Age				: 35
        //     Phone Number	: 7775554433
        //     City			: Colorado
        //     If user enters 1 then print the below message:
        //     Thanks for your confirmation, we saved your details.
        //     If user enters 2 then go to the beginning and start asking the same questions again.

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your Name");
            String name = input.next();


            System.out.println("Enter your Gender");
            String gender = input.next();


            System.out.println("Enter your Age");
            byte age = input.nextByte();


            System.out.println("Enter your Phone Number");
            long phoneNumber = input.nextLong();


            System.out.println("Enter your city");
            String city = input.next();


            System.out.println("Please verify below details are correct:\n" +
                    "Choose one of the option(1 or 2):" +
                    "\t1- All given information are correct\n" +
                    "\t2- I need to re-enter the information");


            System.out.println("Name\t\t\t: " + name);
            System.out.println("Gender\t\t\t:" + gender);
            System.out.println("Age\t\t\t\t:" + age);
            System.out.println("Phone number\t:" + phoneNumber);
            System.out.println("City\t\t\t:" + city);

            byte selection = input.nextByte();
            if (selection == 1) {
                System.out.println("Thanks for your confirmation, we saved your details.");
                break;
            }
        }
        /**3- Write a java program to convert Fahrenheit to Celsius using user input.
         Formula: Celsius= (Fahrenheit-32)*5/9
         Given : 87F
         Calculation:  (87-32)*5/9=30.5 Celcius*/
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit value");

        double fahrenheit = input1.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);


        /**4- Write a java program to swap two numbers (user scanner class for user inputs):
         Given: a=20, b=30
         Output: a=30, b=20
         */

        Scanner numb = new Scanner(System.in);
        System.out.println("Enter two number that you want to swap");

        int a = numb.nextInt();
        int b = numb.nextInt();
        System.out.println("You entered a= " + a + "b= " + b);

        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped values a" + a + "b= " + b);

        /**
         /**5- Write a java program for adding 2 numbers (user scanner class for user inputs):
         */
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers you wanna add");
        int firstNumber = obj.nextInt();
        int secondNumber = obj.nextInt();
        int total = firstNumber + secondNumber;
        System.out.println("Total:" + total);


        //6- Write a java program to find the smallest number (user scanner class for user inputs)

        Scanner input2 = new Scanner(System.in);
        int firstNumber1, secondNumber1, thirdNumber;

        System.out.println("Enter the first number");
        firstNumber1 = input1.nextInt();
        System.out.println("Enter the second number");
        secondNumber1 = input1.nextInt();
        System.out.println("Enter the third number");
        thirdNumber = input1.nextInt();


        if (firstNumber1 < secondNumber1 && firstNumber1 < thirdNumber) {
            System.out.println(firstNumber1 + " is the smallest");
        } else if (secondNumber1 < thirdNumber) {
            System.out.println(secondNumber1 + " is the smallest");
        } else {
            System.out.println(thirdNumber + " is the smallest");
        }

          /*7- Write a java program to find if the student is passed the exam (user scanner class for user inputs)
        Note: passing mark is : 65 */

        Scanner student = new Scanner(System.in);
        System.out.println("Write your score");
        int exam = student.nextInt();
        int score1 = 0;
        if (score1 >= 65) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        // 8- Write a java program to find the given number is odd or even (user scanner class for user inputs)

        Scanner evenNumb = new Scanner(System.in);
        System.out.println("Enter the number");
        int numbers = evenNumb.nextInt();
        int givenNumb = 0;
        if (givenNumb % 2 == 0) {
            System.out.println("It's even number");
        } else if (givenNumb % 2 == 1) {
            System.out.println("Its odd number");


        }


    }
}



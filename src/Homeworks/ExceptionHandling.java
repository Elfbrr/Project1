package Homeworks;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Hello");
        // Thread.sleep(1000); // checked exception
        System.out.println("Hi");


        try {
            int number = Integer.parseInt("4aa"); //unchecked exception
            System.out.println("number =" + number);
        }catch (NumberFormatException nfe){ //where we are handling exception //or you can use Exception e to check problem
            System.out.println("Opps");
            nfe.printStackTrace();

        }

        try {
            int a = 5 / 0;
            System.out.println(a);
        }catch (ArithmeticException ae){
            System.out.println("You can not drive");
            ae.printStackTrace();
        }finally {
            //logout.click
            System.out.println("finally block runs everything no matter catch exception or not");

        }
        /**
         * Opening a web page
         * I go to login page
         * I enter user name password
         * I click login page
         * I saw the dashboard
         * I click logout button
         */

    }
}

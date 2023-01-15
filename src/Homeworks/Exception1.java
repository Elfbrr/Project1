package Homeworks;

public class Exception1 {
    public static void main(String[] args) {


       /** System.out.println("Hello");
       // Thread.sleep(1000); // checked exception
        System.out.println("Hi");


        try {
            int number = Integer.parseInt("4aa"); //unchecked exception
            System.out.println("number =" + number);
            System.out.println("Hi again");
            }catch (NumberFormatException nfe){ //where we are handling exception
            //If you want, you can keep empty
            //or you can print something
            System.out.println("Opps");
            nfe.printStackTrace();

        }*/

        try{
            int num=2;
            int result=num/0;
            System.out.println("result is= " + result);
        } catch (ArithmeticException ae) {
            System.out.println("You can not make that operation: " + ae.getMessage());

        }catch (Exception e){
            System.out.println("Opps");

        }

        try {
            int num = 2;
            int result = num / 0;
            System.out.println("result is= " + result);

        }finally{

        }



    }
}

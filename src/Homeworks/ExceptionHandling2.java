package Homeworks;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("4");
            System.out.println("number =" + number);
            int a = 5 / 0;
            System.out.println(a);

        }catch (NumberFormatException nfe) {
            System.out.println("Opps");
            nfe.printStackTrace();
        }catch (ArithmeticException ae){
            System.out.println("You can not divide to zero");

        }
        System.out.println("end of the code");
    }
}

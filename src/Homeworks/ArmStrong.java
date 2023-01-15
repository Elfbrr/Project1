package Homeworks;

public class ArmStrong {
    public static void main(String[] args) {
        /**8. Write a Java program to check if a number is Armstrong's number or not?
         (input 153= 1*1*1 + 5*5*5 + 3*3*3 =153 output true,  123 output false)*/
        int y=1634;
        int temp=y;
        int total=0;
        String number= Integer.toString(y);
        int length = number.length();
        for (int i=0; i<length; i++){
           int result = temp%10;
           total= (int) (total+Math.pow(result, length));
           temp=temp/10;
    }
       if (total==y) {
           System.out.println(true);
       }else {
           System.out.println(false);
       }


    }


}

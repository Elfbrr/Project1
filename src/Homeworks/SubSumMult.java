package Homeworks;

public class SubSumMult {
    public static void main(String[] args) {

        // q1
        // Fix the below issue
        int num1 = 1238;
        byte num2 = 12;
        int q1Total = num1 + num2;

        System.out.println(q1Total);


        // q2
        // Fix the below issue
        int num3 = 129, num4 = 1200;
        int q2Total = num3 + num4;

        System.out.println(num3+"+" +num4+ " is equal to " +q2Total);

        //q3
        // Print the result of num3-num4
        int num5 = 129, num6 = 1200;
        int subs = num5 - num6;

        System.out.println(subs);

/*  NOTE:
    In Java, any number of underscore characters (_) can appear anywhere between digits in a numerical literal.
    e.g. 123_154_44_89_8_6969_ , e.g. $ 123_000_00
    This feature enables you, for example, to separate groups of digits in numeric literals,
    which can improve the readability of your code.
    For details:
    https://docs.oracle.com/javase/7/docs/technotes/guides/language/underscores-literals.html
*/


        // q4
        // Print the result of num5/num6 by using a variable. Define the type of the result
        int num7 = 7_963_965;
        double num8 = 140.25;
        double division = num7/num8;

        System.out.println(" Division of two number is " + division);

        //q5
         /* Print the below string in your console
         2022Clarusway2022
         */
        byte num11 = 20;
        int num9 = 2021;
        byte num12 = 22;
        byte num10 = 1;
        String str = "Clarusway";
        System.out.println(num10 + num9 + str+ num11  + num12);

        //q6
        /*
    Write some code that stores the length (8) and width (5) of a rectangle in variables.
    Create another variable that stores the area (calculated using the width and length).
    Create another variable that stores the perimeter (calculated using the width and length).
    Print the values of all four variables as shown.
    Length: 8
    Width: 5
    Area: 40
    Perimeter: 26
       */
        int length=8;
        int width=5;
        int ar = length * width;
        int p = 2 * (length * width);
        System.out.println(ar);
        System.out.println(p);


        //q7
        // Print first 4 and then 5 by using the only given unary operators,
        // You can change the unary operator places
        int i = 3;
        i++;
        // print 4 with below print statement
        System.out.println(--i);
        ++i;
        // print 5 with below print statement
        System.out.println(++i);

        System.out.println("========================");


        //q8
        // Print below boolean values by using the a and b variables with relational operators
        // True
        // False
        int a = 10;
        int b = a - 5;
        System.out.println(a>=b);
        System.out.println(a<=b);


        //q9
        //Print true by using either && or ||
        boolean q9 = 5 < 44;
        boolean q99 = false;
        boolean x = q9 && q99;
        System.out.println(x);

        //q10
        // print 3 times True by using below values and relational operators > , != and <=
        int q10 = 13;
        int q11 = 34;
        int q12 = 100;
        int q13 = 33;
        boolean t = q12>q13;
        boolean u = q10!=q11;
        boolean k = q10<=q13;
        System.out.println(t);
        System.out.println(u);
        System.out.println(k);


        int number = 567;
        while (number != 0) {
            System.out.println(number % 10);
            number = number / 10;
    }
}
}





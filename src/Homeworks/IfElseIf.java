package Homeworks;

public class IfElseIf {
    /** Homework-1
     write a program that annual earning
     Perfect start for work => =>100
     Good start for work => 80 ~ 99
     Good start for work => 70 ~ 79
     below average start for work => 60 ~ 69
     Not acceptable =>  0 ~ 59
     *please just use if-else staement
     */

    public static void main(String[] args) {
        int earning =72;
        if (earning>=100) {
            System.out.println("Perfect start for work");

        } else if (earning>=80 && earning<=99) {
            System.out.println("Good start for work");

        } else if (earning>=70 && earning<=79) {
            System.out.println("Good start for work");
        } else if (earning>=60 && earning<=69) {
            System.out.println("Below average start for work");

        } else {
            System.out.println("Not acceptable");
        }


        /**
         Homework-2
         assign int midterm exam result between 0-100, int mtExam
         then assign final exam result between 0-100, int
         then calculate midterm exam of %40,and final exam %60,
         if it is more than 70, print result as "Passed".
         */


        int mtExam;
        int midterm=80;
        int finalExam=70;
        mtExam=(midterm*40)/100+(finalExam*60)/100;
        //  System.out.println(mtExam);
        if (mtExam>=70 && mtExam<=100){
            System.out.println("Passed");
        } else if (mtExam>=0 && mtExam<70){
            System.out.println("Failed");
        } else {
            System.out.println("Correct exam result");

        }


        /**Homework-3
         Assign age and weight,
         for blood donation,
         people should be bigger than 21
         and
         more than 90 pound
         please use nested if
         */

        int age=22;
        int weight=100;
        if (age>21){

            if (weight>90){
                System.out.println("You can donate your blood");

            } else if(age<21 && weight<90){
                System.out.println("You can not donate");
            }
        }



    /**Homework-4
     declare variable year and department
     years should be 1,2,3,4
     departments Computer and Machine Learning
     Use the first if statement to check the department of the student.
     Use the inner if statement to check in which year the student is.
     Display the result.
     i.e;
     The student is in the Computer Science department
     The student is in 2nd year
     */

    int year=1;
    String department="Computer and Machine Learning";
}
}

package Homeworks;

import java.util.Scanner;

public class CalculateGrade {

  /**5. write a method that can calculate grade
    //			if score is 100 ~ 90 ==> A
    //			if score is 89 ~ 80 ==> B
    //			if score is 79 ~ 70 ==> C
    //			if score is 69 ~ 60 ==> D
    //			if score is 0 ~ 59 ==> F
    //			otherwise ==> Invalid Score*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        int numb= sc.nextInt();
        CalculateGrade mo=new CalculateGrade();
        mo.grade(numb);

    }
    public void grade(int numb) {


        if (numb >= 90 && numb <= 100) {
            System.out.println("A");
        } else if (numb >= 80 && numb <= 89) {
            System.out.println("B");
        } else if (numb >= 70 && numb<=79) {
            System.out.println("C");
        } else if (numb >=60 && numb <= 69) {
            System.out.println("D");
        }else if (numb >=0 && numb <= 59) {
            System.out.println("F");
        }else {
            System.out.println("Invalid score");
        }

    }
}

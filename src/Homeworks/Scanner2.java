package Homeworks;

import java.util.Scanner;

//not done yet
public class Scanner2 {
    public static void main(String[] args) {
        /**
         * homework:
         * Number of Students 10
         * Number of Subjects 4
         * Student Name:
         * Student Roll Num:
         * Student Subjects
         * Student Marks
         * Student address:
         * Student Guardian:
         * <p>
         * Total Students: 10
         * Roll Number  | Name     | Subject | Mark | Guardian | Address
         * 312312      |John Doe |Chemistry | 98 | Mary Jane | 323 No where
         * 312312      |John Doe |Chemistry | 98 | Mary Jane | 323 No where
         * 312312      |John Doe |Chemistry | 98 | Mary Jane | 323 No where
         * 312312      |John Doe |Chemistry | 98 | Mary Jane | 323 No where
         * 312312      |John Doe |Chemistry | 98 | Mary Jane | 323 No where
         * 312312      |John Doe |Chemistry | 98 | Mary Jane | 323 No where
         * 312312      |John Doe |Chemistry | 98 | Mary Jane | 323 No where
         */

        Scanner input = new Scanner(System.in);



        for(int i=0;i<10;i++) {


            System.out.println("Enter Students Name");
            String name = input.next();


            System.out.println("Enter Students Roll Number");
            int roll = input.nextInt();


            System.out.println("Enter Students Subject");
            String subject = input.next();


            System.out.println("Enter Students Mark");
            int mark = input.nextInt();


            System.out.println("Enter Students Address");
            String address = input.next();


            System.out.println("Enter Students Guardian");
            String guardian = input.next();



            System.out.println("Roll Number  | Name     | Subject | Mark | Guardian | Address");


            System.out.print(roll +  " ");
            System.out.print(name + " ");
            System.out.print(subject + " ");
            System.out.print(mark + " ");
            System.out.print(address + " ");
            System.out.print(guardian + " ");
            System.out.println();


        }



    }
}


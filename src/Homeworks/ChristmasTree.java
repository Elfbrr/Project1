package Homeworks;

public class ChristmasTree {
    //not done yet
    public static void main(String[] args) {

        //create Christmas tree with 5 level each

        int height=5;
        int width=5;
        int space=width*5;
        //this loop is for each branch for the rows
        int x = 1;
        for (int a=1; a<=height; a++){
            int b;
            for(b=x; b<=width; b++){
                for (int c=space;c>=b;c--){
                    System.out.println(" ");
                }
            }
            for(int d=1; d<=b; d++){
                System.out.println("* ");

            }
            System.out.println();
        }
        x += x;
        width += 2;
        for (int i=1; i<=4; i++){
            for(int j=space-3;j>=1;j--){
                System.out.println(" ");
            }
            for(int k=1;k<=4;k++){
                System.out.println("* ");
            }
            System.out.println();
        }
        /**int height = 5;
        int width = 5;

        //Assigning Space
        int space = width * 5;

        int x = 1;

        //Code to Print Upper Part of the Tree i.e. Pyramids.
        for (int a = 1; a <= height; a++) {

            for (int i = x; i <= width; i++) {

                for (int j = space; j >= i; j--) {

                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {

                    System.out.print("* ");
                }

                System.out.println();
            }

            x = x + 2;
            width = width + 2;
        } */


        //Printing  Branch of Christmas Tree
        for (int i = 1; i <= 4; i++) {

            for (int j = space - 3; j >= 1; j--) {

                System.out.print(" ");
            }

            for (int k = 1; k <= 4; k++) {
                System.out.print("* ");
            }

            System.out.println();
 }
}
}

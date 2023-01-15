package Homeworks;

public class Pyramid {
    public static void main(String[] args) {

        //1)Program to print half pyramid using *

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }

        System.out.println("  -----------------  ");

        //2)Program to print half pyramid a using numbers

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("  -----------------  ");
        //3)Program to print half pyramid using alphabets
        char ch = 'A';
        for (int z = 1; z <= 5; z++) {
            for (int j = 1; j <= z; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
            ch++;
        }
        System.out.println("  -----------------  ");

        //4)Inverted half pyramid using *


        int n = 5;
        for (int t = 1; t <= n; t++) {
            for (int j = t; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("  -----------------  ");
        //5)Inverted half pyramid using numbers

        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            int p = 1;
            for (int j = i; j <= m; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();

        }
        System.out.println("  -----------------  ");
        //6)Program to print full pyramid using *

        int d = 5;
        for (int y = 1; y <= d; y++) {
            for (int j=y; j<=d; j++){
                System.out.print("  ");
            }

            for (int j = 1; j < y; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= y; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("  -----------------  ");
        //7)Program to print pyramid using numbers

        int rows=5, k=0, count=0 , count1=0;
        for(int i=1; i<=rows; ++i) {
            for(int space=1; space<=rows-i ; ++space) {
                System.out.print("  ");
                ++count;
            }
            while(k!=2*i-1) {
                if(count<=rows-1) {
                    System.out.print((i+k)+" ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i+k-2*count1)+" ");
                }
                ++k;
            }
            count1=count=k=0;
            System.out.println();
        }




        System.out.println("  -----------------  ");
        //8)Inverted full pyramid using *

        int e = 5;
        for (int y =1; y <= e; y++) {
            for (int j=1; j<=y; j++){
                System.out.print("  ");
            }

            for (int j = y; j < e; j++) {
                System.out.print("* ");
            }
            for (int j = y; j <= e; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("  -----------------  ");
        //9)Print Pascal’s triangle

        int row = 6, c = 1;

        for(int i = 0; i < rows; i++) {
            for(int space = 1; space < rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c* (i - j + 1) / j;

                System.out.printf("%4d", c);
            }

            System.out.println();
        }



        System.out.println("  -----------------  ");
        /**10)Print Floyd’s Triangle.
         *    1
         //        2 3
         //        4 5 6
         //        7 8 9 10*/

        int  num3 = 1;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num3+++ " ");
            }
            System.out.println();
        }

        System.out.println("====================");
        for (int i = 1; i <= 5; i+=2) {
            System.out.println(i);
            i++;
        }
        System.out.println();

    }
}


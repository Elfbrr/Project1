package Homeworks;

public class PascalsTriangle {
    public static void main(String[] args) {

    //HOMEWORK - Print Pascal's Triangle

    int rows = 5, c = 1;

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



        for(int i=0; i<=3; i++ ){

        for(int s=1; s<=3-i; ){
            s++;

            System.out.print(" ");
        }
        int number=1;
        for(int j=0; j<=i; j++){

            System.out.print(number + " ");
            number=number*(i-j)/(j+1);// 3=3*(2-1)/(1+1)
        }
        System.out.println();
    }


    //Right answer
    int n=5;
        for (int i = 1; i <= n; i++) {

        for (int j = n; j > i; j--) {
            System.out.print("  ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print(k + " ");
        }

        for (int l = i - 1; l >= 1; l--) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

}
}


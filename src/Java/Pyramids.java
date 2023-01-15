package Java;

public class Pyramids {

    public static void main(String[] args) {
        /**           1
         //         1   1
         //       1   2   1
         //     1   3   3    1
         //   1   4   6   4   1
         // 1   5   10   10  5   1
         */

        int rows = 6, c = 1;
        for (int i = 0; i < rows; i++) {
            for (int space = 1; space < rows - i; ++space) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    c = 1;
                } else {
                    c = c * (i - j + 1) / j;

                    System.out.printf("%4", c);

                }

                System.out.println();

            }

        }

    }


}


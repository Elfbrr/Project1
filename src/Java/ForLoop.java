package Java;

public class ForLoop {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("i = " + i);
            }
            System.out.println("------------------");
            for(int i=1, j=2; i<10 || j<7;i++,j++){
                System.out.println("i = " + i + " j = " + j);

            }
            System.out.println("---------------------");
            for (int i=0; i<5;i++){
                for(int j=0; j<5; j++){
                    System.out.println("i = " + i + " j = " + j);
                }
            }
            System.out.println("--------------------------");
            int i=0;
            int j=1;

            while (i<5){
                j=0;
                while (j<7){
                    System.out.println("i = " + i + " j = " + j);
                    j++;
                }
                i++;

            }

    }

}

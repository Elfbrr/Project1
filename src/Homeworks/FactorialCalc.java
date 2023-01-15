package Homeworks;

import java.util.Arrays;

public class FactorialCalc {
    public static void main(String[] args) {


        FactorialCalc fc = new FactorialCalc();
        int result = fc.factorial(5);
        System.out.println("result" + result);


        int[] abc = {1, 2, 3, 4, 5, 6};
        int j = 0;
        int [] reversedarray = new int[6];
        for (int i = abc.length - 1; i>=0; i--){
            reversedarray[j]= abc[i];
            j++;
        }

        System.out.println(Arrays.toString(reversedarray));



    }
    public int factorial (int facNum){
        int result=1;
        for (int mult=1; mult <= facNum; mult++){
            result=result * mult;
        }
        System.out.println(result);
        return result;

    }


}


package Java;

public class IfStatement {


 /* write a program that annual earning
     Perfect start for work => =>100
        Good start for work => 80 ~ 99
        Average start for work => 70 ~ 79
        below average start for work => 60 ~ 69
        Not acceptable =>*/



    /* write a program that:
	 	1. 0 ~12 ==> good morning
		2. 12 ~ 15 ==> good afternoon
		3. 15 ~ 23 ==> good night
		4. 12 ==> good noon

     */

        public static void main(String[] args) {
            int time =67;
            if (time>=0 && time<12) {
                System.out.println("good morning");


            } else if (time>12 && time<=15) {
                System.out.println("good afternoon");

            } else if (time>15 && time<=24) {
                System.out.println("good night");
            } else if (time==12) {
                System.out.println("good noon");

            } else {
                System.out.println("Please enter write time");
 }


}
    }



package Homeworks;

public class ArithmeticOperators {

    static int varr = 5;

    public static void abc() {
        varr = 25;
    }

    public static void increase() {
        varr = varr + 2;
    }
    public static void main(String[] args) {
        byte maxRange=127;
        final int aa = 127;
        System.out.println(varr);

        varr = 10;
        System.out.println(varr);

        varr = 8;
        System.out.println(varr);

        abc();
        System.out.println(varr);

        increase();
        System.out.println(varr);

        increase();
        System.out.println(varr);

        increase();
        System.out.println(varr);

        increase();
        System.out.println(varr);

        byte minRange=-128;
        byte anyRange=101;
        byte randomRange=1;
        System.out.println(maxRange);
        System.out.println(minRange);
        System.out.println(anyRange);
        System.out.println(randomRange);

        short maxShortRange=32767;
        short minShortRange=-32768;
        short anyShortRange=20000;
        short randomShortRange=-12758;


        System.out.println(maxShortRange);
        System.out.println(minShortRange);
        System.out.println(anyShortRange);
        System.out.println(randomShortRange);

        int maxIntRange=2_147_483_647;
        int minIntRange=-2_147_483_648;
        int anyIntRange=1234566;
        int randomIntRange=-3_456_798;

        System.out.println(maxIntRange);
        System.out.println(minIntRange);
        System.out.println(anyIntRange);
        System.out.println(randomIntRange);

        long maxLongRange= 9_223_372_036_854_775_807L;
        long minLongRange= -9_223_372_036_854_775_808L;
        long anyLongRange=4_123_456_678_922L;
        long randomLongRange=-3_456_798_999_404L;

        System.out.println(maxLongRange);
        System.out.println(minLongRange);
        System.out.println(anyLongRange);
        System.out.println(randomLongRange);


        boolean myBooleanValue= true;
        boolean IAmGoingTo=true;

        System.out.println(myBooleanValue);
        System.out.println(IAmGoingTo);



    }
}




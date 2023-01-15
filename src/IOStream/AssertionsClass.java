package IOStream;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class AssertionsClass {
    public static void main(String[] args) {

        System.out.println(Arrays.asList(args));

        String [] weekends={"Saturday", "Sunday","Monday"};

        assert weekends.length==2;
        assert false;
        System.out.println(weekends.length);

    int value=5;
    assert value >=20 : "Underweight";
        System.out.println(value);

}
}
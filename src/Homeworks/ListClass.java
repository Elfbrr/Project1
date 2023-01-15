package Homeworks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        Integer[] num={3,5,7,9};
        Integer[] numbs=new Integer[]{10};


        List<Integer> numbers = new ArrayList<>();//ArrayList implementation //What that list is supporting
        numbers.add(5); //adding the value using add()method
        numbers.add(10);
        numbers.add(20);
        numbers.addAll(List.of(num));
        numbers.addAll(Arrays.asList(7,8,9,10));//you can say numbers.addAll(Arrays.asList(num));
        numbers.addAll(Arrays.asList(6,2,2,3,3));

        List<Integer> anotherList= new ArrayList<>();
        anotherList.addAll(Arrays.asList(4,5,1,2));
        anotherList.addAll(numbers);
        System.out.println("anotherList " + anotherList);
        anotherList.clear(); // Prints empty anotherList
        System.out.println("anaotherList after a clear method" + anotherList);

        System.out.println("numbers " + numbers);
        numbers.remove(2); //It will take index of 2 in num array
        System.out.println("numbers after removal " + numbers);
        numbers.removeAll(List.of(5,7)); //it will remove all of 9's duplicate
        numbers.removeAll(Arrays.asList(1, 3)); //it will remove all of 9's duplicate
        System.out.println("numbers after removeAll method " + numbers);




        List<String>names= new ArrayList<>();
        names.add("Mehmet");
        names.add("Mikail");
        names.remove("Mehmet");
        System.out.println("names= " +names);
        ArrayList<Integer> numbers1 = new ArrayList<>();

        System.out.println("numbers.get(0)= " + numbers.get(0));
        System.out.println("numbers.get(0)= " + numbers.get(1));
        int result=0;
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            if (numbers.get(i)==9){
                System.out.println("Number found= " + numbers.get(i));
                result=numbers.get(i);
                result= result *5;
                break;
            }
        }
        System.out.println("result= " + result);

        // Converting List to Arrays
        /**Created an Integer object using the List size
         * and using toArrays() method to convert List to Array.
         */
        Integer [] myNumber = new Integer[numbers.size()];
        myNumber=numbers.toArray(myNumber);
        System.out.println(Arrays.toString(myNumber));
     }
}

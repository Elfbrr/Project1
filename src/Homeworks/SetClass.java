package Homeworks;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        //Set doesn't accept duplicates
        //Set doesn't have index
        //Set doesn't use orders
        Set<Integer> myNumbers=new HashSet<>();
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(7);
        myNumbers.addAll(Arrays.asList(7,8,9,10));
        System.out.println(myNumbers);
        System.out.println("===========");
        List<Integer> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(10,45,4,4,5,6,7,7,1));
        System.out.println(myList);
        System.out.println("=========");
        Set<Integer> remoDuplicates=new HashSet<>(myList);
        System.out.println("remoDuplicates= " + remoDuplicates);

        Iterator<Integer> iterator = remoDuplicates.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if(number.equals(7)){
                iterator.next();
                iterator.next();
                System.out.println("Heyy I found" +number);
            }
            System.out.println("iterator.next= " + number);
        }

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("a", "b","c", "d"));
        System.out.println(names.get(0)); //A
        System.out.println(names.get(names.size()-1)); //d
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println(numbers);
        System.out.println(numbers.higher(5));

    }

}

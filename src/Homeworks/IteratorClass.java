package Homeworks;

import java.sql.SQLOutput;
import java.util.*;

public class IteratorClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("A", "B", "C", "D"));

        System.out.println("names= " + names);


        Iterator<String> myIterator= names.iterator(); //Checks one by one, you can check if it has a next value or not.
        while (myIterator.hasNext()){  //if there is not value after hasNext, its quit the loop.
            System.out.println(myIterator.next());
        }

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Jack");
        myList.add("Jack");
        myList.add("Jack");
        myList.add("Jack");
        myList.add("Jack");

        Iterator<String> name = myList.iterator();
        while (name.hasNext()){  //if there is not value after hasNext, its quit the loop.
            System.out.println(name.next());
        }

    }
}

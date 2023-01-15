package Homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(); //You can use both way

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> doubleNumbers = new ArrayList<>();

        names.add("Sabire");
        names.add("Kawsar");
        names.add("Mikail");
        names.add("Ayse");
        names.add("Cigdem");
        names.add("Siham");
        names.add("Elif");
        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println(names.get(6));
        //System.out.println(names.get(7)); //out of index
        System.out.println("names.contains(\"Siham\") = " + names.contains("Siham"));
        if (names.contains("Siham")) {
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).equals("Siham")) {
                    System.out.println("Heyy I found " + names.get(i));
                }
            }

        }
        System.out.println("names before set() = " + names);
         names.set(1,"Omer"); //Replacing the value
        System.out.println("names after set() = " + names);
        System.out.println("names remove(0) by index= " + names.remove(0));
        System.out.println("names.remove (\"Cigdem\") by index set() = " + names);
        names.size();
        names.equals("Elif");
        names.contains("Kawsar");
        //names.addAll();
        //names.get();
        names.indexOf("Siham");
        System.out.println(names.contains("Kawsar"));
    }
}

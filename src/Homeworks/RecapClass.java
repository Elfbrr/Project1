package Homeworks;

import java.util.*;

public class RecapClass {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Atlanta");
        list1.add("NY");
        list1.add("NY");
        System.out.println(list1);


        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);


        List<List<String>> list3 = new ArrayList<>();
        // [[],[],[]
        list3.add(Arrays.asList("LA", "Ohio", "FL"));
        list3.add(Arrays.asList("LA1", "Ohio1", "FL1"));
        list3.add(Arrays.asList("LA2", "Ohio2", "FL2"));
        list3.add(Arrays.asList("LA3", "Ohio3", "FL3"));
        System.out.println(list3);

        List<Map<String, List<String>>> listMap1 = new ArrayList<>();
        List<Map<String, String>> listMap = new ArrayList<>();
        Map<String, String> myMap = new HashMap<>();

        myMap.put("Jack", "Fl");
        myMap.put("John", "NC");
        myMap.put("Meri", "SC");
        myMap.put("Teri", "GA");
        System.out.println("myMap = " + myMap); //there is no order

        Map<String, String> myMap1 = new HashMap<>();
        myMap1.put("Jack", "Fl");
        myMap1.put("John", "NC");
        myMap1.put("Meri", "SC");
        myMap1.put("Teri", "GA");
        System.out.println("myMap1 = " + myMap1); //there is no order


        Map<String, String> myMap2 = new HashMap<>();

        myMap2.put("Jack", "Fl");
        myMap2.put("John", "NC");
        myMap2.put("Meri", "SC");
        myMap2.put("Teri", "GA");
        System.out.println("myMap2 = " + myMap2); //there is no order

        listMap.add(myMap);
        listMap.add(myMap1);
        listMap.add(myMap2);
        System.out.println(listMap); //It will print in oder

        System.out.println("==================");
        System.out.println(listMap.get(0));
        Map<String, String> extractedMap = listMap.get(0);
        System.out.println(extractedMap.get("Teri"));
        System.out.println(extractedMap.values());
        System.out.println(extractedMap.keySet());
        System.out.println(extractedMap.entrySet());


    }

    /**public static String getPersonState(String name) {
        String result="";

        for(Map<String,String> myMap:listMap){
            List<String> mapNames = new ArrayList<>(myMap.keySet());
            System.out.println(mapNames);
            for (int i = 0; i < myMap.size(); i++) {
                System.out.println();
            }

        }

        return "";
    }*/

}

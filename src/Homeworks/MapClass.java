package Homeworks;

import java.security.Key;
import java.time.temporal.ValueRange;
import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        //Key should be unique everytime.It doesn't accept the duplicates
        //Values can have duplicates
        //Map<Key, Value> myObject = new HashMap<>();
        Map<String, Integer> myMap = new HashMap();
        Map<Integer, String> myMap1 = new Hashtable();
        Map<Integer, Integer> myMap2 = new TreeMap();
        Map<Double, Double> myMap3 = new LinkedHashMap();


        HashMap<String, Object> languages = new HashMap<>();
        HashMap<String, ?> languages1 = new HashMap<>();


        HashMap<String, Integer> languages2 = new HashMap<>();
        languages.put("java", 17);
        languages.put("Phyton", 3);
        languages.put("Scala", 5);
        System.out.println(languages);

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        // [A,B,C,D]
        List<List<String>> myListB = new ArrayList<>();
        //[{A,B,C,D},{E,F,G},{H,I,J,K}]
        List<Map<String, String>> myListc = new ArrayList<>();


        HashMap<String, List<String>> myMaps = new HashMap<>(); //It's a wrapper class
        //{Math={a,b,c,d}, English={e,f,g}, Biology= {h,i,j,k}}

        HashMap<Integer, Map<String, Integer>> mps = new HashMap<>();

        HashMap<String, Integer> programmingLanguages = new HashMap<>();
        programmingLanguages.put("Java", 18);
        programmingLanguages.put("Phyton", 4);

        System.out.println(languages);
        Integer value = programmingLanguages.get("Phyton");
        System.out.println("value = " + value);

        System.out.println(programmingLanguages.keySet());
        System.out.println(programmingLanguages.values());
        System.out.println(programmingLanguages.entrySet());

        programmingLanguages.put("Java", 17);
        programmingLanguages.put("Scala", 5);
        programmingLanguages.put("JavaScript", 9);
        for (String key : programmingLanguages.keySet()) {//[Java,Scala,Phyton]
            System.out.println((programmingLanguages.get(key)));
        }

        for (Integer val : programmingLanguages.values()) {//17,5,9
            System.out.println(val);
        }
    }
}

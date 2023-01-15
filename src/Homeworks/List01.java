package Homeworks;

import java.util.*;

public class List01 {
    public static void main(String[] args) {
       /** ArrayList<Integer>list2=new ArrayList<>();
        Integer [] list1={1,2,3,4,5};


        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(7);


        ArrayList<Object>list3=new ArrayList<>();
        list3.addAll(list2);
        System.out.println(list3);

        list3.add(8);
        list3.add(9);
        System.out.println(list3);

        list3.remove(5);
        System.out.println(list3);

        list3.add("Elif");
        list3.add(2.33);
        list3.add(12);
        System.out.println(list3);

        list3.set(1,3);
        System.out.println(list3);

        list3.get(5);
        System.out.println(list3.get(5));

        System.out.println();


        Set<Object> flowers= new HashSet<>();
        flowers.add("rose");
        flowers.add("tulip");
        flowers.add("daisy");
        flowers.add(3.33);
        flowers.add("daisy");
        flowers.add(5);
        System.out.println(flowers);*/



       List<Map<String,List<String>>> listMap1= new ArrayList<>();
       List<Map<String,String>> listMap= new ArrayList<>();

       Map<String,String> list=new HashMap<>();
       list.put("Seyma", "BC");
       list.put("Busra","TR");
       list.put("Nergis","US");
        System.out.println(list);
        System.out.println("list = " + list);

        Map<String,String>list1=new HashMap<>();
        list1.put("Seyma1", "BC");
        list1.put("Busra1","TR");
        list1.put("Nergis1","US");
        System.out.println("list1 = " + list1);

        Map<String,String>list2=new HashMap<>();
        list2.put("Seyma2", "BC");
        list2.put("Busra2","TR");
        list2.put("Nergis2","US");
        System.out.println("list2 = " + list2);

        listMap.add(list);
        listMap.add(list1);
        listMap.add(list2);
        System.out.println("listMap = " + listMap);

       // Map<String,String> list4=

    }
}

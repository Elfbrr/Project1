package Homeworks;

import java.util.Hashtable;
import java.util.Map;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<Integer,String> myHashTable= new Hashtable<>();
        myHashTable.put(2,"Java");
        myHashTable.put(5,"Phyton");
        myHashTable.put(1,"JavaScript");
        System.out.println(myHashTable);
        System.out.println(myHashTable.entrySet()); //Gives total set
        System.out.println(myHashTable.values()); //values(Strings)
        System.out.println(myHashTable.keySet()); // Gives key (numbers)


        for(String val:myHashTable.values()){
            System.out.println(val);
        }
        for (Integer key :myHashTable.keySet()){
            System.out.println(key);
        }
        for (Map.Entry<Integer,String> maps : myHashTable.entrySet()){
            System.out.println(maps.getKey() +" " + maps.getValue());
        }
    }
}

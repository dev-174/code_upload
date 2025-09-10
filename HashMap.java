package collection;

import java.util.*;

class Hashmap001{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //insert
        hm.put("India", 120);
        hm.put("USA", 30);
        hm.put("China", 150);
        System.out.println(hm);
        //replace
        System.out.println(hm.put("China", 170));// if new value is written in sout
                                                 // then It will return the previous value if the key is not present then it prints null

        System.out.println(hm);

        //search
        if (hm.containsKey("india")) {  //case sensitive
            System.out.println("Key is present");
        } else {
            System.out.println("Key is not present");
        }
        System.out.println(hm.get("China"));
        System.out.println(hm.get("HelloBye"));

        //print only values and keys respectively
        System.out.println(hm.values());
        System.out.println(hm.keySet());

        
    }
}

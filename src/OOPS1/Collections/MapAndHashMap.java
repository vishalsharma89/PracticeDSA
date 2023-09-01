package OOPS1.Collections;

import java.util.HashMap;

public class MapAndHashMap {
    public static void main(String[] args) {
        HashMap m= new HashMap<>();
        HashMap<Integer,String> mp= new HashMap<Integer,String>();

        m.put(101,"A");
        m.put(102,"B");
        m.put(103,"C");
        m.put(104,"D");
        m.put(105,"E");

//        Print hashmap
        System.out.println(m);
//        get value
        System.out.println(m.get(104));
//        remove pair from hashmap
        m.remove(105);
        System.out.println(m);

//        Contains key
        System.out.println(m.containsKey(104));
//        Contains Value
        System.out.println(m.containsValue("K"));

//        Check is empty or not
        System.out.println(m.isEmpty());

//        get keys
        System.out.println(m.keySet());

//        Get Values
        System.out.println(m.values());

//        Return all the entries as a set
        System.out.println(m.entrySet());

//        Get keys one by one
        for (Object e:m.keySet()) {
            System.out.println(e);
        }

//        get values one by one
        for (Object e:m.values()) {
            System.out.println(e);
        }
//        get keys and values one by one
        for (Object i:m.keySet()) {
            System.out.println(i+"-"+m.get(i));
        }


    }
}

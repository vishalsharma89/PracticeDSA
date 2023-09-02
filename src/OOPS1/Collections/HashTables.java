package OOPS1.Collections;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {

//        Hashtable has= new Hashtable(); capacity is 11 and load factor is 0.75
//        Hashtable has= new Hashtable(Initial Capacity); create hashtable object with some capacity
//        Hashtable has= new Hashtable(Initial Capacity,Load Factor); create hashtable object with some capacity and Load Factor

        Hashtable<Integer,String> t = new Hashtable<Integer,String>();
        t.put(101,"A");
        t.put(102,"B");
        t.put(103,"C");
        t.put(104,"D");

        System.out.println(t);
        System.out.println(t);
        System.out.println(t.get(103));

//        t.remove(103);
        System.out.println(t.containsKey(103));
        System.out.println(t.containsValue("D"));

        System.out.println(t.keySet());
        System.out.println(t.values());

        for (int k:t.keySet()) {
            System.out.println(k+" "+t.get(k));
        }
    }
}

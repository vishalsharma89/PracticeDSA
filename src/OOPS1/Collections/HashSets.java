package OOPS1.Collections;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

//        HashSet hs = new HashSet(100); Initial capacity 100
//        HashSet hs = new HashSet(100,(float) 0.90);
//        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet hs = new HashSet(); // default capacity 16 and Load Factor = 0.75

        hs.add(1000);
        hs.add("Hashset");
        hs.add('A');
        hs.add(true);
        hs.add(null);
        hs.add(16.8);

        System.out.println(hs);// Insertion order not preserved - [null, A, 1000, Hashset, 16.8, true]

//        remove
        System.out.println("REMOVE ");

        hs.remove(1000);
        System.out.println(hs);

        HashSet hs2 = new HashSet();
        hs2.addAll(hs);
        System.out.println(hs2);

//        remove all
        System.out.println("REMOVE ALL");
        hs2.removeAll(hs);
        System.out.println(hs);
        System.out.println(hs2);

//        contains
        hs.contains(16.8);
        System.out.println(hs.isEmpty());

//        print using for each loop
        for (Object e:hs) {
            System.out.println(e);
        }
    }
}

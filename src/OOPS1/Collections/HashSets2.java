package OOPS1.Collections;

import java.util.HashSet;

public class HashSets2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>(); // default capacity 16 and Load Factor = 0.75

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println("Set1 - "+set1);// Insertion order not preserved - [null, A, 1000, Hashset, 16.8, true]

        HashSet<Integer> set2 = new HashSet<Integer>(); // default capacity 16 and Load Factor = 0.75
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2 - "+set2);// Insertion order not preserved - [null, A, 1000, Hashset, 16.8, true]

//        Union
        set1.addAll(set2);
        System.out.println("Union - "+set1);

//        Intersection
        set1.retainAll(set2);
        System.out.println("Intersection - "+set1);

//        Difference
        set1.retainAll(set2);
        System.out.println("Difference- "+set1);

//        is Subset of set
        System.out.println(set1.containsAll(set2));



    }
}

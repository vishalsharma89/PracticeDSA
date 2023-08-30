package OOPS1.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al2 = new ArrayList<>();
        al2.addAll(al);
        System.out.println(al2);

//        REMOVE ALL Elements
        al2.removeAll(al);
        System.out.println(al2);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

//        SORT
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

//        Shuffle
        Collections.shuffle(al);
        System.out.println(al);
    }
}

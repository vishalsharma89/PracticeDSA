package OOPS1.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

//        Declare Arraylist
//        ArrayList with Heterogeneous data
        ArrayList al = new ArrayList();
//        List al = new ArrayList<>();

//        ArrayList with Integer type Homogeneous data
//        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add("Welcome");
        al.add(10.5);
        al.add('A');
        al.add(true);
        System.out.println(al);

//        Size - No. of elements in ArrayList
        System.out.println(al.size());

//        Remove
//        al.remove(1);
        al.remove("Welcome");
        System.out.println(al);
//        Size - No. of elements in ArrayList
        System.out.println(al.size());

//        Add a new element
//        add(index,object)
        al.add(3,"Hello");
        System.out.println(al);
        System.out.println(al.size());

//        Retrieve value
        System.out.println(al.get(3));

//        Set another value/Change/replace
        al.set(3,"Hola");

        System.out.println(al);

//        search-contains
        System.out.println(al.contains("Hola"));

//        Check if empty or not
        System.out.println(al.isEmpty());

//        Read the data from the ArrayList
//        1) for loop
        System.out.println("Reading element using for loop");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
//        2) for each loop
        System.out.println("Reading element using for each loop");
        for(Object e:al){
            System.out.print(e+ " ");
        }
        System.out.println();
//        3) Iterator
        System.out.println("Reading element using for Iterator");
        Iterator it= al.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}

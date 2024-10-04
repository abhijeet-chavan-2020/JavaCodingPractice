package main.java.org.collectionsPractice;

import java.util.*;

public class SetPractice {

    //Notes:
    //List: Allows duplicates and maintains insertion order. Most implementations allow null values.
    //Set: Does not allow duplicates. Some implementations allow null, while others do not.
    //Queue: Behavior varies; some queues allow null, others do not. Queues generally do not allow duplicates.
    //Map: Map implementations don't allow duplicate keys. Some allow null keys and/or values, while others do not.

//  Type    Implementation          Allows Null?   Allow Duplicates?  Notes
//    Set	    HashSet	                Yes	        No	            Unordered, allows one null value.
//              LinkedHashSet	        Yes 	    No	            Maintains insertion order, allows one null value.
//              TreeSet	                No	        No	            Sorted order, does not allow null values.
//              EnumSet	                No	        No	            Works with enum types only, does not allow null.
//              ConcurrentSkipListSet	No	        No	            Sorted order, thread-safe, does not allow null.
//              CopyOnWriteArraySet	    Yes	        No	            Thread-safe, backed by CopyOnWriteArrayList.
    static SortedSet<String> sortedSet;

    public static void createAList(){
        sortedSet= new TreeSet<>();
        sortedSet.add("Banana");
        System.out.println(sortedSet);
        sortedSet.add("Apple");
        System.out.println(sortedSet);
        sortedSet.add("Mango");
        System.out.println(sortedSet);
        sortedSet.add("Cherry");
        System.out.println(sortedSet);
    }


    public static void main(String[] args) {
        createAList();
        System.out.println(sortedSet);
        SortedSet<String> sortedSubSetNew= new TreeSet<>();
        sortedSubSetNew.add("Papaya");
        sortedSubSetNew.add("Litchi");

        // Display the sorted set
        System.out.println("SortedSet: " + sortedSet);
        System.out.println("sortedSet.headSet(\"Mango\") = " + sortedSet.headSet("Mango"));
        System.out.println("sortedSet.tailSet(\"Apple\") = " + sortedSet.tailSet("Apple"));
        System.out.println("sortedSet.first() = " + sortedSet.first());
        System.out.println("sortedSet.last() = " + sortedSet.last());
        SortedSet<String> sortedSubSet= sortedSet.subSet("Banana", "Mango");
        System.out.println("sortedSubSet = " + sortedSubSet);
        System.out.println("sortedSet.addAll(sortedSubSetNew) = " + sortedSet.addAll(sortedSubSetNew));
        System.out.println("sortedSet After adding all values form sortedSubSetNew = " + sortedSet);
        System.out.println("sortedSet.containsAll(sortedSubSetNew) = " + sortedSet.containsAll(sortedSubSetNew));
        sortedSet.remove("Litchi");
        System.out.println("sortedSet after removing Litchi = " + sortedSet);
        sortedSet.removeAll(sortedSubSetNew);
        System.out.println("sortedSet after removing sortedSubSetNew = " + sortedSet);
        sortedSet.retainAll(sortedSubSetNew);
        System.out.println("sortedSet after retaining all from sortedSubSetNew = " + sortedSet);
        System.out.println("sortedSet.size() = " + sortedSet.size());


        Iterator<String> it= sortedSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}

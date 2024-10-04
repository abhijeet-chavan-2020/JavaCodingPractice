package main.java.org.collectionsPractice;

import java.util.*;

public class HashSetAndLinkedHashSetPractice {

    //a hash table stores information by using a mechanism called hashing.
    //The advantage of hashing is that it allows the execution time of add( ), contains( ), remove( ), and size( ) to remain constant even for large sets.

    //The new HashSet<>(20)  initializes the capacity of the hash set to capacity. (The default capacity is 16.)
    // The new HashSet<>(20, 0.9f) initializes both the capacity and the fill ratio (also called load factor) of the hash set from its arguments. The fill ratio must be between 0.0 and 1.0, and it
    //determines how full the hash set can be before it is resized upward.
    // Specifically, when the number of elements is greater than the capacity of the hash set multiplied by its fill ratio, the hash set is expanded.
    // For constructors that do not take a fill ratio, 0.75 is used.

    //How HashSet works: it stores key as a hascode, The hash code is then used as the index at which the data associated with the key is stored.
    //In Java, a HashSet does not maintain any particular order of elements. The data stored in a HashSet is unordered, meaning that the order of elements is not guaranteed and can appear random. This applies both when storing and retrieving data from a HashSet.
    //Unordered Collection: A HashSet is backed by a HashMap, and the elements are stored based on their hash codes.
    //Use Case: HashSet is best used when you need a collection that prevents duplicates and does not require any order, such as when you want to quickly check the presence of an element in a large dataset.


    public static void createHashSet(){
         Set<String> hashset = new HashSet<>();
         Set<String> hashset1 = new HashSet<>(20);
          Set<String> hashset2 = new HashSet<>(hashset);
          Set<String> hashset3 = new HashSet<>(20, 0.9f);
        hashset.addAll(List.of("Abhijeet","Pankaj"," Rakesh", "Saurabh","Amit", "Rohit"));
        hashset1.addAll(hashset);
        hashset.add("Kedar");
        System.out.println("hashset = " + hashset);
        System.out.println("hashset.contains(\"Raj\") = " + hashset.contains("Raj"));
        System.out.println("hashset.size() = " + hashset.size());
        hashset.remove("Pankaj");
        System.out.println("After hashset.remove(\"Pankaj\") hashset = " + hashset);
        System.out.println("hashset.containsAll(hashset1) = " + hashset.containsAll(hashset1));
        System.out.println("hashset.removeAll(hashset1) = " + hashset.removeAll(hashset1));
        System.out.println("After hashset.removeAll(hashset1) hashset = " + hashset);
        Iterator<String> it= hashset.iterator();
        while(it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }

        hashset.add("Kedar");

        try{
            System.out.println("hashset.add(null) = " + hashset.add(null)); // null values are allowed only once. But it does snot allowed duplicate values.
            System.out.println("hashset.add(null) = " + hashset.add(null)); // null values are allowed only once. But it does snot allowed duplicate values.// this returns false.
            hashset.add("Kedar");

        } catch (UnsupportedOperationException op){
            System.out.println("You can not add null values into HashSet");
        }

    }

    public static void createLinkedHashSet(){
        Set<String> linkedHashset = new LinkedHashSet<>();
        Set<String> linkedHashset1 = new LinkedHashSet<>(20);
        Set<String> linkedHashset2 = new LinkedHashSet<>(linkedHashset);
        Set<String> linkedHashset3 = new LinkedHashSet<>(20, 0.9f);
        linkedHashset.addAll(List.of("Abhijeet","Pankaj"," Rakesh", "Saurabh","Amit", "Rohit"));
        linkedHashset1.addAll(linkedHashset);
        linkedHashset.add("Kedar");
        System.out.println("linkedHashset = " + linkedHashset);
        System.out.println("linkedHashset.contains(\"Raj\") = " + linkedHashset.contains("Raj"));
        System.out.println("linkedHashset.size() = " + linkedHashset.size());
        linkedHashset.remove("Pankaj");
        System.out.println("After linkedHashset.remove(\"Pankaj\") hashset = " + linkedHashset);
        System.out.println("linkedHashset.containsAll(hashset1) = " + linkedHashset.containsAll(linkedHashset1));
        System.out.println("linkedHashset.removeAll(hashset1) = " + linkedHashset.removeAll(linkedHashset1));
        System.out.println("After linkedHashset.removeAll(hashset1) hashset = " + linkedHashset);
        Iterator<String> it= linkedHashset.iterator();
        while(it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }

        try{
            System.out.println("linkedHashset.add(null) = " + linkedHashset.add(null));
        } catch (UnsupportedOperationException op){
            System.out.println("You can not add null values into LinkedHashSet");
        }
    }

    public static void main(String[] args) {
        HashSetAndLinkedHashSetPractice.createHashSet();
        HashSetAndLinkedHashSetPractice.createLinkedHashSet();
    }

}

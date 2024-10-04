package org.collectionsPractice;

import java.util.*;

public class ListPractice {
    static List<String> al;

    public static void createAList() {
        al = new ArrayList<>() {
        };
        al.add("Raj");
        al.add("Prerna");
        al.add("Ankit");
    }


    public static void main(String[] args) {
//        createAList();
//        al.add(1, "Abhijeet");
//        al.add(2, null);
//        System.out.println("al.toArray().toString() = " + al.toString());
//        List<String> newList= new ArrayList<>();
//        newList.add("Santosh");
//        newList.add("Rajesh");
//        newList.add("Shantanu");
//        al.remove(null);
//        newList.addAll(al);
//        newList.addAll(4, al);
//        System.out.println("newList.toString() = " + newList.toString());
//        System.out.println("newList.size() = " + newList.size());
//        List<String> copiedList= List.copyOf(newList);
//        System.out.println("copiedList.toString() = " + copiedList.toString());
//
//        try{
//            copiedList.add("New Member");
//        } catch (UnsupportedOperationException un){
//            System.out.println("This is a copied list which is an unmodifiable list. Hence throwing UnsupportedOperationException exception");
//        }
//        System.out.println("newList.get(5) = " + newList.get(5));
//        newList.add("Abhijeet");
//        System.out.println("newList.toString() = " + newList.toString());
//        System.out.println("newList.indexOf(\"Abhijeet\") = " + newList.indexOf("Abhijeet"));
//        System.out.println("newList.indexOf(\"Abhijeet\") = " + newList.indexOf("Jyoti"));
//        System.out.println("newList.indexOf(\"Abhijeet\") = " + newList.lastIndexOf("Abhijeet"));
//        ListIterator<String> li= newList.listIterator();
//        while(li.hasNext()){
//            System.out.print(li.next()+ " ");
//        }
//        System.out.println("//////////////////");
//        Iterator<String> iterator = newList.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+ " ");
//        }
//
//        System.out.println("newList.set(0, \"New value\") = " + newList.set(0, "New value"));
//        System.out.println("newList.toString() = " + newList.toString());
//        newList.add(1, "Latest");
//        System.out.println("newList.toString() = " + newList.toString());
//
//
//        newList.sort(Comparator.naturalOrder());
//        System.out.println("After sorting newList.toString() = " + newList.toString());
//        newList.sort(Comparator.reverseOrder());
//        System.out.println("After sorting newList.toString() = " + newList.toString());
//
//        List<String>  sublist= newList.subList(4,8);
//        System.out.println("After sublist newList.toString() = " + sublist.toString());
//        System.out.println("newList.isEmpty() = " + newList.isEmpty());
//        newList.removeAll(List.of("Abhijeet","Ankit"));
//        System.out.println("After removing all Abhijeet, Ankit newList.toString() = " + newList.toString());
//
//        newList.retainAll(sublist);
//        System.out.println("After retain all newList.toString() = " + newList.toString());

        List<String> li = List.of("Raj", "Ram", "Swapnil", "Rahul", "Jyoti");
        System.out.println(li);

        createAList();
        al.add("Raj");
        System.out.println(al.toString());
    }
}

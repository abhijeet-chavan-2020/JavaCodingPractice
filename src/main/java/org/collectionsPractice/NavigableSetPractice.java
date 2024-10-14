package main.java.org.collectionsPractice;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetPractice {
    static NavigableSet<Double> stockPrices;
    static void createNavigableSet(){
        stockPrices= new TreeSet<>();
        stockPrices.add(101.5);
        stockPrices.add(102.7);
        stockPrices.add(100.3);
        stockPrices.add(105.2);
        stockPrices.add(103.9);
        stockPrices.add(107.9);
        stockPrices.add(102.1);
        System.out.println("stockPrices = " + stockPrices);
    }

    public static void main(String[] args) {
        createNavigableSet();
        System.out.println("stockPrices.ceiling(101.0) = " + stockPrices.ceiling(101.0));
        System.out.println("stockPrices.floor(102.0) = " + stockPrices.floor(102.0));
        System.out.println("stockPrices.subSet(101.0, 105.0 ) = " + stockPrices.subSet(101.0, 105.2));
        System.out.println("stockPrices.headSet(105.2, true) = " + stockPrices.headSet(105.2, true));
        System.out.println("stockPrices.headSet(105.2, false) = " + stockPrices.headSet(105.2, false));
        System.out.println("stockPrices.headSet(105.2) = " + stockPrices.headSet(105.2));
        System.out.println("stockPrices.subSet(100.3, true, 105.2, false) = " + stockPrices.subSet(100.3, true, 105.2, false));
        System.out.println("stockPrices.pollFirst() = " + stockPrices.pollFirst()); // retrieve and removes the first element from the NavigableSet
        System.out.println("stockPrices.pollLast() = " + stockPrices.pollLast());// retrieve and removes the last element from the NavigableSet
        Iterator<Double>  it= stockPrices.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println("stockPrices.tailSet(103.0) = " + stockPrices.tailSet(103.0));
        System.out.println("stockPrices.first() = " + stockPrices.first());
        System.out.println("stockPrices.last() = " + stockPrices.last());
    }
}

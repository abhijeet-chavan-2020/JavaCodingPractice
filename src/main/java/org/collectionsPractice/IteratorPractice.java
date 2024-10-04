package org.collectionsPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractice {

    public static void practice1(){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Raj");
        al.add("Prerna");
        al.add("Ankit");

        Iterator<String> alIterator=al.iterator();
        while (alIterator.hasNext()) {
            String data = (String) alIterator.next();
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        practice1();
    }


}

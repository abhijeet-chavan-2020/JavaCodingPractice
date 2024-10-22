package main.java.org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Aakash");

        list.add("Adam");

        list.add("Greg");

        list.add("Raj");

        list.add("Ram");

        list.add("Krishna");

        list.add("Amey");



        long count = Stream.of("Amy","Adam","Greg","Krishna").filter(s->s.startsWith("A")).count();

        System.out.println(count);



        long count1 = list.stream().filter(s->{s.startsWith("A");return true;}).count();

        System.out.println(count1);



        long count2 = list.stream().filter(s->s.length()>4).count();

        System.out.println(count2);



        list.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));



        list.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));





        // map to modify filtered content

        list.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));



        // sort

        System.out.println("Sorted example of stream");

        list.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));



        // merging two streams

        System.out.println("---merged stream examples-----");

        List<String> list2 = Arrays.asList("Ramesh","Suresh","Ganesh");



        Stream<String> mergedList = Stream.concat(list.stream(), list2.stream());

        mergedList.sorted().forEach(s->System.out.println(s));



        // find specific string and return true

        boolean flag = list2.stream().anyMatch(s->s.equalsIgnoreCase("Ramesh"));




        // collect and return list

        List<String> mappedList = list.stream().filter(s->s.startsWith("A")).map(s->s.toLowerCase()).collect(Collectors.toList());

        System.out.println("------collect example------");

        System.out.println(mappedList.get(0));



        // print unique number

        System.out.println("---unique number list");

        List<Integer> values = Arrays.asList(5,2,5,1,3,4,6,7,8,3,3);

        values.stream().distinct().collect(Collectors.toList()).forEach(s->System.out.println(s));



        // print unique sorted numbers

        System.out.println("---sorted unique number list");

        values.stream().distinct().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
    }
}

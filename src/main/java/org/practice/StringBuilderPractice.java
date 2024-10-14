package main.java.org.practice;

public class StringBuilderPractice {

    //StringBuilder is similar to StringBuffer except for one important difference:
    //it is not synchronized, which means that it is not thread-safe. The advantage of
    //StringBuilder is faster performance. However, in cases in which a mutable
    //string will be accessed by multiple threads, and no external synchronization is
    //employed, you must use StringBuffer rather than StringBuilder

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Abhijeet");
        sb.reverse();
        System.out.println("Integer.reverse(115) = " + Integer.reverse(115));
    }
}

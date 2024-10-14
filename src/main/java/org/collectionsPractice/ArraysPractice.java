package main.java.org.collectionsPractice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] num= new int[10];
        int i=10;
        for(int n : num){
            Arrays.fill(num, i++);
            System.out.println("n = " + n);
        }
        String s="Abhijeet";
    }
}

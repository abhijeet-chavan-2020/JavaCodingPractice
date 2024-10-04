package main.java.org.practice;

import main.java.org.example.TestNew;

public class TestNewAccess extends TestNew{

    TestNewAccess(){

    }
    public static void main(String[] args) {
        TestNewAccess tna= new TestNewAccess();
        int n= tna.num;
//        String nm= tna.name;
//        int[] arr1=tna.arr;
    }

}

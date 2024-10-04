package main.java.org.example;

import main.java.org.example.TestA;
import main.java.org.example.TestB;

public class TestB  extends TestA {
     public double weight=0;

     TestB(){
         super();
         this.weight= -1.0;
          System.out.println("Class B default constructor is called.");

     }

     TestB(double weight){
          this.weight=weight;
          System.out.println("Class B constructor with double weight parameter is called.");
     }

     static{
          System.out.println("Static block of Class B is called");
     }

     static void printMe(){
          System.out.println("Static method is printing from Class B");
     }

     TestB(TestB b){
          super(b);
          System.out.println("Class B constructor with Class B object is called.");

     }
     public  void meth3() {
          System.out.println("I am method from Class B - meth3");
     }

     public static void main(String[] args) {
          TestB testB= new TestB();
          TestB testB1= new TestB(22.5);
          TestB testB2= new TestB(testB);
          TestA a= new TestB();
     }
}

package main.java.org.example;
import main.java.org.example.TestA;

import main.java.org.example.TestB;


public class TestC extends  TestB{
     public double area=0;

     TestC(){
          this.area= -1.0;
          System.out.println("Class B default constructor is called.");

     }

     TestC(double area){
          this.area=area;
          System.out.println("Class C constructor with double weight parameter is called.");
     }

     static{
          System.out.println("Static block of Class C is called");
     }
     TestC(TestC c){
          super(c);
          System.out.println("Class c constructor with Class B object is called.");

     }
     public  void meth3() {
          System.out.println("I am method from Class B - meth3");
     }

     public static void main(String[] args) {
//          TestA testa= new TestB();
//          testa.printMe();
//          TestB testb = new TestB();
//          testb.printMe();
          TestA a= new TestB();
          a.printMe();
          TestNew tn= new TestNew();
          int n= tn.num;
          String nm= tn.name;
          int[] arr1=tn.arr;
          System.out.println("tn.hashCode() = " + tn.hashCode());
     }
}

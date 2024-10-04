package main.java.org.example;

public class TestA {

    double l = 0;
    double w = 0;
    double h = 0;
    protected TestA(){
        this.l=-1.0;
        this.w=-1.0;
        this.h=-1.0;
        System.out.println("Class A default constructor is called.");

    }

    static{
        System.out.println("Static block of Class A is called");
    }

    static void printMe(){
        System.out.println("Static method is printing from Class A");
    }

    TestA(double l, double w, double h){
        this.l=l;
        this.w=w;
        this.h=h;
        System.out.println("Class A constructor with double l, w, h parameters is called.");

    }

    public TestA(TestA a) {
        System.out.println("Class A constructor with Class A object is called.");
    }

    public void meth1(){
        System.out.println("I am method from Class A - meth1");
    };
    public void meth2(){
        System.out.println("I am method from Class A - meth2");

    };
}

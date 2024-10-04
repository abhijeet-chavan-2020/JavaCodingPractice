package main.java.org.practice;

public abstract class ParentAbstractClass {
    static int age;
    int money;

    final int value;
    public ParentAbstractClass(int age){
        this.age= age;
        value= 21222;
        System.out.println("I went to Parent class constructor");
    }

    protected abstract void career();
    protected abstract void  partner();

    protected void printDetails(){
        System.out.println("I am from class"+ ParentAbstractClass.class );
    }

    static void printStaticMethod(){
        System.out.println("I am static method from " + ParentAbstractClass.class);
    }

    static{
        System.out.println("I am static block from " + ParentAbstractClass.class);

    }
    protected void printValue(){
        System.out.println("Value is :" + value);
    }




}

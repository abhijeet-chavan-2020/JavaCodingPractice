package main.java.org.example;

public class TestNew   {

    public TestNew(){
    }
    protected int num;
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }

    public String getName(){
        return  name;
    }

    public TestNew(int num, String name){
        this.name= name;
        this.num = num;
        this.arr= new int[num];
    }

}

package org.collectionsPractice;
import java.lang.reflect.Field;
import java.util.*;


public class ArrayListPractice {

    //The ArrayList class extends AbstractList and implements the List interface.
    private String name;
    private  String age;
    private  String address;
    private static final  String schoolName="MySchool Pune";


    public ArrayListPractice(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public ArrayListPractice() {

    }

    @Override
    public String toString(){
        String s =null;
        s="Name of Student - "+ this.name + " and his age is - "+ this.age +" and he lives in - "+ this.address ;
        return  s;
    }

    public int max(ArrayList<Integer> list){
        try{
            if(list.size()==0){
                return  0;
            }
            list.sort(Comparator.naturalOrder());
            return  list.get(list.size()-1);
        } catch (Exception e){

            return 0;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer > al= new ArrayList<Integer>(List.of(1, 6, 9 ));
        System.out.println("al = " + al);
        System.out.println("al.size() = " + al.size());
        ArrayList<String > al1= new ArrayList<>();
        System.out.println("al1.size() = " + al1.size());
        ArrayList<String > al2= new ArrayList<>(20);
        System.out.println("al2.size() = " + al1.size());
        al2.ensureCapacity(100);
        System.out.println("after al2.ensureCapacity(100) al2.size() = " + al1.size());
        al.trimToSize();
        System.out.println("After al.trimToSize() al.size() = " + al.size());
        Integer ia[]= new Integer[al.size()];
        ia= al.toArray(ia);
        int sum=0;
        for(int i:ia){
            System.out.println("i = " + i);
            sum +=i;
        }
        System.out.println("Sum= " + sum);

        ArrayList<ArrayListPractice> listOfStudents = new ArrayList<ArrayListPractice>();
        ArrayListPractice student1= new ArrayListPractice("Abhijeet", "18", "VadgaonSheri");
        ArrayListPractice student2= new ArrayListPractice("Anil", "20", "Kharadi");
        ArrayListPractice student3= new ArrayListPractice("Amit", "15", "Wagholi");
        ArrayListPractice student4= new ArrayListPractice("Sumit", "12", "Undri");
        ArrayListPractice student5= new ArrayListPractice("Rohit", "16", "Katraj");
        listOfStudents.addAll(List.of(student1, student2, student3, student4, student5));
        System.out.println("student2.toString() = " + student2.toString());
        Iterator<ArrayListPractice> it= listOfStudents.listIterator();
        while(it.hasNext()){
            System.out.println("\n " + it.next());
        }

        ArrayListPractice obj= new ArrayListPractice();
        ArrayList<Integer> list= new ArrayList<Integer>(List.of());
        System.out.println("obj.max(list) = " + obj.max(new ArrayList<Integer>()));
        Integer arr[]= new Integer[]{1, 2, 3, 4, 5};
        List<Integer> arrayList= Arrays.asList(arr);
        List<Integer> arrayList1= Arrays.asList(arr);
        List<Integer> arrayList2= new ArrayList<Integer>(List.of(arr));
        arrayList2.add(3);
        System.out.println("Before removing duplicates arrayList2 = " + arrayList2);

        System.out.println("arrayList.equals(arrayList1) = " + arrayList1.equals(arrayList2));
        arrayList2.removeAll(List.of(3));
        System.out.println("After removing duplicates arrayList2 = " + arrayList2);
    }
}

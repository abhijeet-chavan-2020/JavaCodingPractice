package org.collectionsPractice;

public class GenericPracticeNumber<T extends Number> {
    T[] nums;

    GenericPracticeNumber(T[] obj){
        this.nums= obj;
    }

    double average(){
        double sum=0.0;
        for(T n: nums){
            sum += n.doubleValue();
        }
        double avg= sum/ nums.length;
        return  avg;
    }

    boolean sameAvg(GenericPracticeNumber<?> obj){
        if(average()== obj.average()){
            return  true;
        }
        return  false;
    }

    public static void main(String[] args) {
        Integer inums[]={1,2,3,4,5};
        GenericPracticeNumber<Integer> inumsObj= new GenericPracticeNumber<Integer>(inums);

        Double dnums[]= {1.1, 2.2, 3.3, 4.4, 5.5, 1.5};
        GenericPracticeNumber<Double> dnumsObj= new GenericPracticeNumber<Double>(dnums);

        System.out.println("inumsObj.average() = " + inumsObj.average());
        System.out.println("dnumsObj = " + dnumsObj.average());

        System.out.println("inumsObj.sameAvg(dnumsObj) = " + inumsObj.sameAvg(dnumsObj));
    }
}

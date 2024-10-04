package main.java.org.practice;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class JavaProblemsSolved {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int[] arr = {14, 2, 2, 4, 5, 5, 14, 2, 4, 5};
//        int[] arr1 = {3, 8, 14, 16, 20, 2, -45, 10};
//        int[][] twoDimentionArray= {{5,4,9},{7,10,84},{2,74,36}};
//        System.out.println("Sorted array is :" + Arrays.toString(arraySort(arr, "Ascending")));
//        System.out.println("Sorted array is :" + Arrays.toString(arraySort(arr, "Descending")));
        //      swapVariableWithoutTemp(78, 25);
        //      maxDifferenceIntoAdjacentArrayValues(arr);
        //     System.out.println("new matching values array list is: "+compareValuesAtSameIndexes(arr, arr1 ) );
//        printPyramidPattern(5);
        //       printFibonacciSeries(8);
        //       newPrintFibonacciSeries(8);
//        checkForPrimeNumber(35);
//        printMinimumNumberFromTwoDimentionalArray(twoDimentionArray);
//        printMaximumNumberFromTwoDimentionalArray(twoDimentionArray);
//        checkForPalindromeString("abhijeet");
//        checkForDuplicateNumbersAndCount(arr);
//        calculateNumberOfOccurencesOfCharacterInString("jsvdvhsvvhsdvhsdhsh", 's');
//        calculateNumberOfOccurencesOfCharacterInString("jsvdvhsvvhsdvhsdhsh", 'd');
//        calculateNumberOfOccurencesOfCharacterInString("jsvdvhsvvhsdvhsdhsh", 'v');
//        reverseTheGivenNumber(875);
//        testNew();
        //   System.out.println("reverseStringWithStringBuffer(\"My name is Abhijeet\") = " + reverseStringWithStringBuffer("My name is Abhijeet"));


//        String s = null;
//        char response=printFirstCapitalLetter(s);
//        if(response==0 ) {
//            System.out.println("There is no uppercase character");
//        } else if(response=='n'){
//            System.out.println("please enter a string to proceed");
//        } else{
//            System.out.println("printFirstCapitalLetter(\"my name is abhijeet\") = " + printFirstCapitalLetter("my name is Abhijeet"));
//
//        }

//        printFactorialOfGivenNumber(0);
//        printFactorialOfGivenNumber(-1);
//        printFactorialOfGivenNumber(5);

//        checkArmstrongNumber(153);
//        checkArmstrongNumber(1634);
//        checkArmstrongNumber(-1634);

//        findNumberOfDigitsInTheGivenNumber("-1215.163");

//        printPyramidPatternSolution3(6);
//        printPyramidPatternSolution2(6);

        //reverseString("Abhijeet");

      //  reverseEachWordOfGivenString("My name is Abhijeet");

       // findDuplicateCharactersInString("my name is abhijeet");


     //   countOccurrencesOfEachWordOfTheGivenString("Test new auto test");

     //   calculateNumberOfWordsInTheGivenString("I am Abhijeet and I am a tester");

     //   findAllPermutationsOfGivenString("abc", "");

     //   verifyIfTheTwoStringsAreAnagram("heart","earth");
     //   hashTableProcess();
//        Date date7= new Date();
//        System.out.println("date7.toInstant().toString() = " + date7.toInstant().toString());
//        Random num= new Random();
//        System.out.println("num.nextInt() = " + num.nextInt(100, 500));

try {
    stringToDateExample();
} catch (Exception e){

        }
 //       dateFormatter();


    }

/////////////////////////////////////// Numbers / Integers  ///////////////////////////////////////////////

    private static int maxDifferenceIntoAdjacentArrayValues(int[] a) {
        int diff = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int temp = a[i] - a[i + 1];
            if (temp < 0) {
                temp = -(temp);
            }
            if (diff < temp) {
                diff = temp;
            }
        }
        System.out.println("Maximum difference in an array is: " + diff);

        return diff;
    }

    private static ArrayList<Integer> compareValuesAtSameIndexes(int[] a, int[] b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                c.add(a[i]);
            }
        }
        return c;
    }

    private static int[] arraySort(int[] a, String sortType) {

        switch (sortType) {
            case "Ascending":
                for (int i = 0; i < a.length; i++) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] < a[i]) {
                            int temp = a[j];
                            a[j] = a[i];
                            a[i] = temp;
                        }
                    }
                }
                break;

            case "Descending":
                for (int i = 0; i < a.length; i++) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] > a[i]) {
                            int temp = a[j];
                            a[j] = a[i];
                            a[i] = temp;
                        }
                    }
                }
                break;
        }

        return a;
    }

    private static void swapVariableWithoutTemp(int a, int b) {
        System.out.println("Before swapping Values of a=" + a + " and value of b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping Values of a=" + a + " and value of b=" + b);
    }

    private static void printFibonacciSeries(int length) {

        if (length <= 0) {
            System.out.println("Enter positive numbers");
        } else if (length == 1) {
            System.out.println("1");
        } else {
            ArrayList<Integer> fibonacci = new ArrayList<Integer>();
            for (int i = 0; i < length; i++) {
                if (i == 0) {
                    fibonacci.add(1);
                } else if (i == 1) {
                    fibonacci.add(1, fibonacci.get(0) * 2);
                } else {
                    fibonacci.add((fibonacci.get(i - 2) + fibonacci.get(i - 1)));
                }
            }

            for (int a : fibonacci) {
                System.out.println(a);
            }
        }

    }

    private static void newPrintFibonacciSeries(int length) {
        int a = 0;
        int b = 1;
        int sum = 0;
        int i = 1;
        while (i < length) {
            sum = a + b;
            System.out.print(sum + "   ");
            a = b;
            b = sum;
            i++;
        }
    }

    private static void checkForPrimeNumber(int num) {
        int a = num / 2;
        boolean flag = false;
        for (int i = 2; i < a; i++) {
            if (num % i == 0) {
                System.out.println("This is not a prime number. Its multiple of " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a Prime Number");
        }
    }

    private static void printMinimumNumberFromTwoDimentionalArray(int[][] abc) {

        int min = abc[0][0];
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                }
            }
        }
        System.out.println("Minimum value is " + min);
    }

    private static void printMaximumNumberFromTwoDimentionalArray(int[][] abc) {

        int min = abc[0][0];
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                if (abc[i][j] > min) {
                    min = abc[i][j];
                }
            }
        }
        System.out.println("Minimum value is " + min);
    }

    private static void checkForDuplicateNumbersAndCount(int[] nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!a.contains(nums[i])) {
                a.add(nums[i]);
            }
        }
        System.out.println(a);
        for (int val : a) {
            count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (val == nums[i]) {
                    count++;
                }
            }
            System.out.println("Count of " + val + " is = " + count);
        }
    }

    private static void calculateNumberOfOccurencesOfCharacterInString(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Number of occurences of character " + c + " in string " + s + " = " + count);
    }

    private static void reverseTheGivenNumber(int num) {
        int q = 0;
        int r = 0;
        int reverse = 0;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            reverse = r + (reverse * 10);
        }
        System.out.println("\n Reverse number of " + num + " is =" + reverse);
    }

    private static void testNew() {
        String s = "Hello";
        s = s.toLowerCase();
        System.out.println(s);
        ;
    }

    private static void printFactorialOfGivenNumber(int num) {
        int n=num;
        if (num <= 0) {
            System.out.println("Please enter number greater that 0");
        } else {
            int fact = 1;
            while (num > 0) {
                fact = fact * num;
                num--;
            }
            System.out.println("factorial of " + n + " = " + fact);
        }
    }

    private static void checkArmstrongNumber(int num){

        //So an Armstrong number is a number whose each digit is multipled as many times as the number of digits of that number and then added to get the number.
        // first remove the sign from the number if its a negative number.
        // then get the length of the number after removing sign.
        // Mod that number and get individual number
        // then multiply each digit with itself for how many number of times? For number of times the length of the number. Calculate the individual sum of this multiplication.
        // Calculate the total of all such sums of individual number. Then divide the original number by 10 to get the remaining number and assign that back to the original number.
        // and repeat the procees.
        // finally, compare the original number without sign with the grand total . If its true then the number if an Armstrong number. Else its not.
        int n=Integer.parseInt(String.valueOf(num).replaceAll("[^0-9]",""));
        int length= String.valueOf(num).replaceAll("[^0-9]","").length();
        int total=0;
        for(int i=length; i>0;i--){
            int sum=1;
            for(int j=length; j>0; j--){
                sum= sum * (num%10);
            }
            System.out.println("sum of number = "+(n%10)+" =" + sum);
            total= total+ sum;
            num=num/10;
            System.out.println("total = " + total);
        }
        if(n==total  ){
            System.out.println(n+" is an Armstrong number");
        } else {
            System.out.println(n+" is not an Armstrong number");
        }
    }

    private static void findNumberOfDigitsInTheGivenNumber(String s){
        //solution 1:
        System.out.println("Number of digits in the given number "+s+"  is:= "+ s.replaceAll("[^0-9]", "").length());

        //solution 2
        int num = Integer.parseInt(s.replaceAll("[^0-9]", ""));
        int count=0;
        while(num>0){
            num= num/10;
            count++;
        }
        System.out.println("Number of digits in the given number "+s+"  is:= "+ count);

    }


    /////////////////////////////////////////////////// Strings //////////////////////////////////////////////
    private static String reverseStringWithStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    private static String reverseStringWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }

    private static void reverseString(String str) {
        String reverse="";
        for(int i= str.length()-1; i>=0; i--){
            reverse= reverse.concat(String.valueOf(str.charAt(i)));
        }
        System.out.println("reversed String is = " + reverse);
    }

    private static String returnReversedString(String str) {
        String reverse="";
        for(int i= str.length()-1; i>=0; i--){
            reverse= reverse.concat(String.valueOf(str.charAt(i)));
        }
        System.out.println("reversed String is = " + reverse);
        return  reverse;
    }
    private static void checkForPalindromeString(String s) {
        int l = s.length();
        String reverse = "";
        for (int i = l - 1; i >= 0; i--) {
            reverse = reverse.concat(String.valueOf(s.charAt(i)));
            System.out.println(reverse);
        }
        if (s.equalsIgnoreCase(reverse)) {
            System.out.println("Given string is a Palindrome");
        } else {
            System.out.println("Given string is not a Palindrome");
        }
    }

    private static void printPyramidPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println("");
        }
    }
    private static void printPyramidPatternSolution2(int rows) {
        String s="*";
        for(int i=1; i<rows;i++){
            System.out.println(s.repeat(i));
        }
    }
    private static void printPyramidPatternSolution3(int rows) {
        String s="*";
        for(int i=1; i<rows;i++){
            System.out.println(s);
            s=s.concat("*");
        }
    }
    private static char printFirstCapitalLetter(String str) {
        try {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i)))
                    return str.charAt(i);
            }
        } catch (NullPointerException n) {
            return 'n';
        }
        return 0;
    }

    private  static void reverseEachWordOfGivenString(String s){
        String reversedString="";
        ArrayList<String> list= new ArrayList<>(List.of(s.split(" ")));
        for(String str: list) {
            reversedString = reversedString + returnReversedString(str)+ " ";
        }
        System.out.println("Original string is = " + s);
        System.out.println("reversedString = " + reversedString);
    }

    private static void findDuplicateCharactersInString(String str){
        HashMap<Character, Integer> map= new HashMap<>();
        str=str.replaceAll("\\s","");
        int length= str.length();
        System.out.println("str.replaceAll(\"^[0-9a-z] \",\"\") = " + str);
        for(int i=0; i<length; i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }
            map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }
        Iterator<Character> keySet= map.keySet().iterator();
        Iterator<Integer> valueSet= map.values().iterator();
        while (keySet.hasNext() && valueSet.hasNext()){
            int value= valueSet.next();
            if(value>1){
                System.out.println("Duplicate character is "+ keySet.next() + " and value is "+ value);
            }
        }
    }

    private static void countOccurrencesOfEachWordOfTheGivenString(String str){
        int length= str.split(" ").length;
        ArrayList<String> list= new ArrayList<>(List.of( str.toLowerCase().split(" ")));
        HashMap<String, Integer> map= new HashMap<>();
        for(String s: list){
            if(!map.containsKey(s)){
                map.put(s, 1);
            } else {
                map.put(s, map.get(s)+1);
            }
        }
        System.out.println("map = " + map);
    }

    private static void calculateNumberOfWordsInTheGivenString(String str){
        System.out.println("str.split(\" \").length = " + str.split(" ").length);
    }

    //copied this code from a website. I do not understand the logic at all.
    private static void findAllPermutationsOfGivenString(String str, String prefix){
            if (str.length() == 0) {
                System.out.println(prefix);
            } else {
                for (int i = 0; i < str.length(); i++) {
                    System.out.println("str.substring(0,i) = " + str.substring(0, i));
                    System.out.println("str.substring(i+1) = " + str.substring(i + 1));
                    String rem = str.substring(0,i) + str.substring(i+1);
                    System.out.println("rem = " + rem);
                    findAllPermutationsOfGivenString(rem,prefix + str.charAt(i));
                }
            }
        }


        //Two strings are said to be anagrams if they make a meaningful word by rearranging or shuffling the letters of the string. In other words, we can say that two strings are anagrams if they contain the same characters but in a different order.
    private static void verifyIfTheTwoStringsAreAnagram(String s1, String s2){
         ArrayList<Character> list= new ArrayList<>();
         int l1=s1.length();
         int l2=s2.length();
         if(l1!=l2 || l1==0 || l2==0){
             System.out.println("String s1="+s1+ " and s2="+s2+" are not Anagrams");
         } else {
             HashSet<Character> hset1= new HashSet<>();
             HashSet<Character> hset2= new HashSet<>();
             for(int i=0; i<l1; i++){
                 hset1.add(s1.charAt(i));
                 hset2.add(s2.charAt(i));
             }
             System.out.println("hset1.equals(hset2) = " + hset1.equals(hset2));
         }
    }

    public static void hashTableProcess(){
        Hashtable<String, String> ht= new Hashtable<>();
        ht.put("name","Abhijeet");
        ht.put("age","33");
        ht.put("dept","IT");
        ht.put("city","Pune");

        for(Map.Entry h: ht.entrySet()){
            System.out.println(h.getKey() +" "+  h.getValue());
        }
    }

    public static void stringToDateExample() throws ParseException {
        String sDate1="31/12/1998";
        String sDate2 = "31-Dec-1998";
        String sDate3 = "12 31, 1998";
        String sDate4 = "Thu, Dec 31 1998";
        String sDate5 = "Thu, Dec 31 1998 23:37:50";
        String sDate6 = "31-Dec-1998 23:37:50";
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");
        SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
        SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date1=formatter1.parse(sDate1);
        Date date2=formatter2.parse(sDate2);
        Date date3=formatter3.parse(sDate3);
        Date date4=formatter4.parse(sDate4);
        Date date5=formatter5.parse(sDate5);
        Date date6=formatter6.parse(sDate6);
        Date date7= new Date();
        System.out.println("date7.toInstant().toString() = " + date7.toInstant().toString());
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
        System.out.println(sDate3+"\t"+date3);
        System.out.println(sDate4+"\t"+date4);
        System.out.println(sDate5+"\t"+date5);
        System.out.println(sDate6+"\t"+date6);
    }

    public static void dateFormatter(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);
        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);
        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+strDate);
        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);
        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);
    }
    ////////////////////////////////////// String ///////////////////////////////

}
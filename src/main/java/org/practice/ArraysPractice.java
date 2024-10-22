package main.java.org.practice;

import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ArraysPractice {
    public static void main(String[] args) {
        //  checkIfContainsDuplicateUsingHashMap();
        //checkIfContainsDuplicateUsingHashSet();
       // findMissingNumberInArrayUsingListComparison();
       // findMissingNumberInArrayUsingAdditionLogic();
       // moveZerosToEnd();
       // replaceNumberWithProductOfOtherNumbers();
        findSecondLargestNumber();
    }

    public static void checkIfContainsDuplicateUsingHashMap() {
        int[] arr = {1, 2, 3, 5, 4, 1, 1, 1};
        boolean flag = true;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int oldVal = map.remove(arr[i]);
                map.put(arr[i], oldVal + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                flag = false;
                System.out.println("Key:" + m.getKey() + "****** Value:" + m.getValue());
            } else {
                flag = true;
                System.out.println("Key:" + m.getKey() + "****** Value:" + m.getValue());
                break;
            }
        }
        System.out.println("Result is:" + flag);
    }

    public static void checkIfContainsDuplicateUsingHashSet() {
        int[] arr = {1, 2, 3, 5, 4, 1, 1, 1, 5, 6, 4, 9, 9};
        boolean flag = true;

        Set<Integer> arrSetUnique = new HashSet<>();
        Set<Integer> arrSetDuplicate = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (arrSetUnique.add(arr[i])) {
            } else {
                arrSetDuplicate.add(arr[i]);
            }
        }

        Iterator<Integer> it = arrSetDuplicate.iterator();
        while (it.hasNext()) {
            System.out.println("Duplicate number is: " + it.next());
        }
    }

    public static void findMissingNumberInArrayUsingListComparison(){
        // Problem Statement:-https://leetcode.com/problems/missing-number/description/
//		Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//
//
//				Example 1:
//
//				Input: nums = [3,0,1]
//				Output: 2
//				Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//				Example 2:
//
//				Input: nums = [0,1]
//				Output: 2
//				Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//				Example 3:
//
//				Input: nums = [9,6,4,2,3,5,7,0,1]
//				Output: 8
//				Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//
//
//				Constraints:
//
//				n == nums.length
//				1 <= n <= 104
//				0 <= nums[i] <= n
//				All the numbers of nums are unique.
        int arr[]={7,5,6,1,2,0,3};
        int range=arr.length;
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }

        List<Integer> Ideallist= new ArrayList<>();
        for(int i=0; i<=range; i++){
            Ideallist.add(i);
        }

        for(Integer num: Ideallist){
            if(!list.contains(num)){
                System.out.println("Missing number is:"+num);
            }
        }
    }

    public static void findMissingNumberInArrayUsingAdditionLogic(){
        // Problem Statement:-https://leetcode.com/problems/missing-number/description/
//		Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//
//
//				Example 1:
//
//				Input: nums = [3,0,1]
//				Output: 2
//				Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//				Example 2:
//
//				Input: nums = [0,1]
//				Output: 2
//				Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//				Example 3:
//
//				Input: nums = [9,6,4,2,3,5,7,0,1]
//				Output: 8
//				Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//
//
//				Constraints:
//
//				n == nums.length
//				1 <= n <= 104
//				0 <= nums[i] <= n
//				All the numbers of nums are unique.
        int arr[]={7,5,6,1,2,0,3};
        int sum=0;
        int idealSum=0;
        for(int i=0;i<arr.length; i++){
            sum=sum+arr[i];
            idealSum= idealSum+ i;
        }
        idealSum= idealSum+arr.length;
        int ans= idealSum- sum;
        System.out.println("Missing number is = " + ans);
    }

    public static void moveZerosToEnd(){
        int nums[] = { 1, 0, 3, 4, 8, 0, 9, 1, 0 };
        int idealArr[] = new int[nums.length];
        Arrays.fill(idealArr, 0);
        int j=0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]!=idealArr[i]){
                idealArr[j]= nums[i];
                j++;
            }
        }
        System.out.println("New array is:");
        for(int n: idealArr){
            System.out.print(n);
        }
    }

    public static void replaceNumberWithProductOfOtherNumbers(){
        // All the  numbers in array should be replaced by the product of all numbers in array except that number
        int a[] = { 1, 3, 5, 4};
        int op=1;
        for(int n:a){
            op= op*n;
        }
        for(int n=0;n<a.length; n++){
            a[n]= op/a[n];
        }

        for(int n:a){
            System.out.println("n = " + n);
        }
    }

    public static void findSecondLargestNumber(){
        int a[]={14,5,7,8,44,95,41,85,90};
        Arrays.sort(a);
        System.out.println("Second largest number is = " + a[a.length-2]);
    }
}

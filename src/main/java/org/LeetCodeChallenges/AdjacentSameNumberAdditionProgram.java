package main.java.org.LeetCodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacentSameNumberAdditionProgram {


    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 2, 4, 6, 4, 6, 3, 3, 4, 8, 7, 4, 2, 1, 1, 5, 4, 4};
        performOp(arr1);
    }

    public static void performOp(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Input list is==> "+ list);
        System.out.println("Input list.size() = " + list.size());
        List<Integer> newList = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                newList.add(list.get(i) + list.get(i + 1));
                i++;
                flag = true;
            } else {
                newList.add(list.get(i));
            }
        }
        System.out.println("New output list is==> " + newList);
        Integer[] newArr = new Integer[newList.size()];
        int index = 0;
        for (int k : newList) {
            newArr[index] = k;
            index++;
        }
        if (flag) {
            performOp(newArr);
        }
    }
}

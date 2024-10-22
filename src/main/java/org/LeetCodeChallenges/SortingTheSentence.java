package main.java.org.LeetCodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTheSentence {
    //https://leetcode.com/problems/sorting-the-sentence/description/
    /*
    A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.



Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.


Constraints:

2 <= s.length <= 200
s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
The number of words in s is between 1 and 9.
The words in s are separated by a single space.
s contains no leading or trailing spaces.
     */

    public static void main(String[] args) {
        sortString("is2 sentence4 This1 a3");
    }

    public static void sortString(String s){

        List<String> list= new ArrayList<String>();
        int[] arr= new int[s.split(" ").length];
        String[] str= new String[arr.length+1];

        String op="";
        for(int i=0; i<s.split(" ").length; i++){
            arr[i]= Integer.parseInt(s.split(" ")[i].substring(s.split(" ")[i].length()-1, s.split(" ")[i].length()));
            str[arr[i]-1]= s.split(" ")[i].substring(0, s.split(" ")[i].length()-1);
        }
        for(String k: str){
            if(k!=null){
                op= op+ k +" ";
            }
        }

        System.out.println("Arrays.toString(op) = " + op.trim());
    }


}

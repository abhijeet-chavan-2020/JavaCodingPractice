package main.java.org.LeetCodeChallenges;

import java.util.Arrays;
import java.util.Stack;

public class MakeTheStringGreat {

    //https://leetcode.com/problems/make-the-string-great/description/
    /*
    Given a string s of lower and upper case English letters.

A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

Notice that an empty string is also good.



Example 1:

Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
Example 2:

Input: s = "abBAcC"
Output: ""
Explanation: We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" --> "aAcC" --> "cC" --> ""
"abBAcC" --> "abBA" --> "aA" --> ""
Example 3:

Input: s = "s"
Output: "s"


Constraints:

1 <= s.length <= 100
s contains only lower and upper case English letters.
     */

    public static void main(String[] args) {
        makeStringGreat();
    }

    public static void makeStringGreat(){
        String s= "leEeetcode";
        Stack<Character> stack = new Stack<>();
        char[] c= s.toCharArray();

        for(char current: c){
            if(stack.size()==0){
                stack.push(current);
            } else {
                char top= stack.peek();
                if(Character.toUpperCase(current) == Character.toUpperCase(top)){
                    if( (Character.isLowerCase(top) && Character.isUpperCase(current))  ||
                            (Character.isLowerCase(current) && Character.isUpperCase(top) ))
                     {
                        stack.pop();
                    } else {
                        stack.push(current);
                    }
                } else {
                    stack.push(current);
                }
            }

        }
        StringBuilder sb= new StringBuilder();
        while(stack.size()!=0){
            sb.append(stack.pop());
        }
        System.out.print(sb.reverse());

    }
}

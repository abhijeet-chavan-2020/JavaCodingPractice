package main.java.org;

import java.util.Arrays;

public class CodeChallenge {
    public static void main(String[] args) {
        String[] names= {"apple","ape","april"};
        int[] count= {names[0].length(), names[1].length(), names[2].length()};
        Arrays.sort(count);
        String prefix= names[0];
        for(int i=1; i<names.length;i++){
            while(names[i].indexOf(prefix)!=0){
                prefix= prefix.substring(0, prefix.length()-1);
                System.out.println("prefix at i="+i +" is =" + prefix);
            }
            if(prefix.length()==0){
                System.out.println("iNo Longest common prefix found");
            } else{
                System.out.println("Longest common prefix is :"+ prefix);
            }
        }
    }
}


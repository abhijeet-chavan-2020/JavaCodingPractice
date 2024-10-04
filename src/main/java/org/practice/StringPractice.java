package main.java.org.practice;

import java.util.Arrays;

public class StringPractice {

    public static void waysToImplementString(){
        char chars[]= {'a','b','c','d'};
        String s= new String(chars);
        System.out.println("s = " + s);
        String s1= new String(chars, 1, 2);
        System.out.println("s1 = " + s1);
        System.out.println( "number"+ 2 + 2 + 4 + "Four");
        System.out.println( "number"+ (2 +8 - 4) + "Four");
        String mystr = null;
        mystr=  mystr+ "A";
        System.out.println("mystr = " + mystr); // mystr = nullA

        String charA= "A";
        System.out.println("(mystr+charA) = " + (mystr + charA));// (mystr+charA) = nullAA

        //  System.out.println("mystr = " + mystr.concat("A")); // gives exception -  Cannot invoke "String.concat(String)" because "mystr" is null
        /////////////////////////////////////////
//        char charsTest[]= new char[15];
//        String s2= "International";
//        System.out.println("s2 = " + s2+"\n");
//        s2.getChars(5, s2.length(), charsTest, 0);
//        for(char c: charsTest){
//                System.out.print(c+" ");
//        }
//        //////////////////////////////////
//        String str1="India is my coun555555'" +
//                "try.";
//        String str2="Argentina is my country.";
//        System.out.println("\n str1.regionMatches(true, 6, str2, 10, 14) = " + str1.regionMatches(true, 6, str2, 10, 14));
//        System.out.println("str1.concat(str2.replace(\"Argentina\", \"\")) = " + str1.contains(str2.replace("Argentina", "")));
//        System.out.println("str1.startsWith(\"India\") = " + str1.startsWith("India"));
//        System.out.println("str2.endsWith(\"country\") = " + str2.endsWith("country."));
//
//        /////////////////////////////////////////////////////
//        String sRef1= "Hello";
//        String sRef2=sRef1;
//        System.out.println("sRef2.equals(sRef2) = " + sRef2.equals(sRef2));
//        System.out.println("(sRef1==sRef2) = " + (sRef1 == sRef2));
//        String myStr1[]= {"Now","is","the","time","for","all","good","men","to","come","to","the","aid","of","their","country"};
//        for(int i=0; i<myStr1.length; i++){
//            for(int j=i+1; j<myStr1.length; j++){
//                if(myStr1[i].compareToIgnoreCase(myStr1[j]) >0){
//                    String temp= myStr1[i];
//                    myStr1[i]=myStr1[j];
//                    myStr1[j]= temp;
//                }
//            }
//            System.out.println(" Before myStr1[i] = " + myStr1[i]);
//        }
//        //////////////////////////////////////////////////////
//        System.out.println("str1.indexOf(\"my\") = " + str1.indexOf("my"));
//        System.out.println("str2.indexOf('m') = " + str2.indexOf('m'));
//        System.out.println("str1.lastIndexOf('n') = " + str1.lastIndexOf('n'));
//        System.out.println("str1.lastIndexOf('n',10) = " + str1.lastIndexOf('n', 2));
//        /////////////////////////////////////////////////////////
//        String ss= "  Hello World       ";
//        System.out.println("ss = " + ss);
//        String ss1=ss;
//        System.out.println("ss1 = " + ss1);
//        System.out.println("ss.stripLeading() = " + ss.stripLeading());
//        System.out.println("ss.stripTrailing() = " + ss.stripTrailing());
//        System.out.println("ss1.strip() = " + ss1.strip());
//        //////////////////////////////////////////////////
//        Double d=100.25;
//        long n = 2412;
//        int i= 457;
//        float f= 1.7f;
//        char cr[]= {'b','a', 't'};
//        System.out.println("String.valueOf(i) = " + String.valueOf(i));
//        System.out.println("String.valueOf(n) = " + String.valueOf(n));
//        System.out.println("String.valueOf(f) = " + String.valueOf(f));
//        System.out.println("String.valueOf(cr) = " + String.valueOf(cr));
//        ////////////////////////////////////////////////
//        String test="This is a Test to verify UpperCase and LowerCase";
//        System.out.println("test.toLowerCase() = " + test.toLowerCase());
//        System.out.println("test.toLowerCase() = " + test.toLowerCase());
//
//        String r1= String.join(" ","This","is","my","Country");
//        String r2= String.join(" ### ","This","is","my","Country");
//        System.out.println("r1 = " + r1);
//        System.out.println("r2 = " + r2);
//
//        System.out.println("r1.contains(\"Country\") = " + r1.contains("Country"));
//        System.out.println("r1.replace(\"Country\",\"Desh\") = " + r1.replace("Country", "Desh"));
//        System.out.println("r1.replaceFirst(\"my\",\"your\") = " + r2.replaceFirst("my", "your"));
//        System.out.println("r1.replaceAll(\"###\",\"\") = " + r2.replaceAll("###", ""));
//        String sp1[]=r2.split("###");
//        String sp2[]=r2.split("###",-1);
//        String sp3[]=r2.split("###",0);
//        String sp4[]=r2.split("###",2);
//        System.out.println("sp1 = " + Arrays.toString(sp1));
//        System.out.println("sp2 = " + Arrays.toString(sp2));
//        System.out.println("sp3 = " + Arrays.toString(sp3));
//        System.out.println("sp4 = " + Arrays.toString(sp4));
        ///// Replace second occurence of country in the given string with Desh
//        String rep= "This is my country. I love my country. Every country is beautiful.";
//        System.out.println("rep.split(\"country\",2)[1].replaceFirst(\"country\",\"Desh\") = " + rep.split("country", 2)[1].replaceFirst("country", "Desh"));
//        int count=0;
//        String rep1="";
//        for(String str5: rep.split(" ")){
//            if(str5.equals("country.")){
//                count++;
//            }
//            if(count==2){
//                str5=str5.replace("country.","Desh.");
//            }
//            rep1= rep1.concat(" "+str5);
//        }
//        System.out.println("rep1 = " + rep1);

        ///////////////////////////////////////////////////
    }
    public static void main(String[] args) {
        waysToImplementString();

    }
}

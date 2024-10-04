package main.java.org.collectionsPractice;

public interface LamdaPractice<T> {


    //A lambda expression, itself, cannot specify type parameters. Thus, a lambda
    //expression cannot be generic. (Of course, because of type inference, all lambda
    //expressions exhibit some “generic-like” qualities.) However, the functional
    //interface associated with a lambda expression can be generic. In this case, the
    //target type of the lambda expression is determined, in part, by the type
    //argument or arguments specified when a functional interface reference is
    //declared.
    //To understand the value of generic functional interfaces, consider this. The
    //two examples in the previous section used two different functional interfaces,
    //one called NumericFunc and the other called StringFunc. However, both
    //defined a method called func( ) that took one parameter and returned a result.
    //In the first case, the type of the parameter and return type was int. In the
    //second case, the parameter and return type was String. Thus, the only
    //difference between the two methods was the type of data they required. Instead
    //of having two functional interfaces whose methods differ only in their data
    //types, it is possible to declare one generic interface that can be used to handle
    //both circumstances. The following program shows this approach


  //  int fact(int n);
  //  String reverse(String str);

    T func(T t);

    public static void main(String[] args) {
        //// Lambda Expression for calculating factorial of the given number
        LamdaPractice<Integer> lpFactorial= (n) -> {
            int fact=1;
            for(int i=n; i>0; i--){
                fact=fact*i;
            }
            return fact;
        };
        System.out.println("lp.fact(5) = " + lpFactorial.func(5));

        //// Lamba expression for reversing the characters in the given string
        LamdaPractice<String> lpReverseString= (str) -> {
            String result= "";
            for(int i=str.length()-1; i>=0; i--){
                result= result+ str.charAt(i);
            }
            return  result;
        };
        System.out.println("lp.reverse(\"Abhijeet\") = " + lpReverseString.func("Abhijeet"));

    }

    //Method References to static Methods
    //To create a static method reference, use this general syntax:
    //ClassName::methodName
    //Notice that the class name is separated from the method name by a double
    //colon. The :: is a separator that was added to Java by JDK 8 expressly for this
    //purpose. This method reference can be used anywhere in which it is compatible
    //with its target type.

    
}

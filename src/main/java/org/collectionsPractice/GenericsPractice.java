package main.java.org.collectionsPractice;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class GenericsPractice {

    //What Are Generics?
    //At its core, the term generics means parameterized types. Parameterized types
    //are important because they enable you to create classes, interfaces, and
    //methods in which the type of data upon which they operate is specified as a
    //parameter. Using generics, it is possible to create a single class, for example,
    //that automatically works with different types of data. A class, interface, or
    //method that operates on a parameterized type is called generic, as in generic
    //class or generic method.
    //It is important to understand that Java has always given you the ability to
    //create generalized classes, interfaces, and methods by operating through
    //references of type Object. Because Object is the superclass of all other
    //classes, an Object reference can refer to any type object. Thus, in pre-generics
    //code, generalized classes, interfaces, and methods used Object references to
    //operate on various types of objects. The problem was that they could not do so
    //with type safety.
    //Generics added the type safety that was lacking. They also streamlined the
    //process, because it is no longer necessary to explicitly employ casts to translate
    //between Object and the type of data that is actually being operated upon. With
    //generics, all casts are automatic and implicit. Thus, generics expanded your
    //ability to reuse code and let you do so safely and easily.


    // class Gen<T> { }
    //First, notice how Gen is declared by the following line:
    //class Gen<T> {
    //Here, T is the name of a type parameter. This name is used as a placeholder for
    //the actual type that will be passed to Gen when an object is created. Thus, T is
    //used within Gen whenever the type parameter is needed. Notice that T is
    //contained within < >. This syntax can be generalized. Whenever a type
    //parameter is being declared, it is specified within angle brackets. Because Gen
    //uses a type parameter, Gen is a generic class, which is also called a
    //parameterized type.

    //t the Java compiler does not
    //actually create different versions of Gen, or of any other generic class.
    //Although it’s helpful to think in these terms, it is not what actually happens.
    //Instead, the compiler removes all generic type information, substituting the
    //necessary casts, to make your code behave as if a specific version of Gen were
    //created. Thus, there is really only one version of Gen that actually exists in
    //your program. The process of removing generic type information is called
    //erasure, and we will return to this topic later in this chapter.

    //The generics syntax shown in the preceding examples can be generalized. Here
    //is the syntax for declaring a generic class:
    //class class-name<type-param-list > { // …
    //Here is the full syntax for declaring a reference to a generic class and instance
    //creation:
    //class-name<type-arg-list > var-name =
    //new class-name<type-arg-list >(cons-arg-list);

    //Bounded Types:
    //you need some way to tell the
    //compiler that you intend to pass only numeric types to T. Furthermore, you
    //need some way to ensure that only numeric types are actually passed.
    //To handle such situations, Java provides bounded types. When specifying a
    //type parameter, you can create an upper bound that declares the superclass
    //from which all type arguments must be derived. This is accomplished through
    //the use of an extends clause when specifying the type parameter, as shown
    //here:
    //<T extends superclass>
    //This specifies that T can only be replaced by superclass, or subclasses of
    //superclass. Thus, superclass defines an inclusive, upper limit

    //In addition to using a class type as a bound, you can also use an interface
    //type. In fact, you can specify multiple interfaces as bounds. Furthermore, a
    //bound can include both a class type and one or more interfaces. In this case, the
    //class type must be specified first. When a bound includes an interface type,
    //only type arguments that implement that interface are legal. When specifying a
    //bound that has a class and an interface, or multiple interfaces, use the &
    //operator to connect them. This creates an intersection type. For example,
    //class Gen<T extends MyClass & MyInterface> { // ...
    //Here, T is bounded by a class called MyClass and an interface called
    //MyInterface. Thus, any type argument passed to T must be a subclass of
    //MyClass and implement MyInterface. As a point of interest, you can also use
    //a type intersection in a cast.

    // The Wildcard Argument "?"
    //Consider we have method which calculate if average of two Generic class objects are the same given one object is of type Integer and another is of type Double.
//    boolean sameAvg(Stats<T> obj){
//        if(average()==obj.average)
//            return true;
//        return  false;
//    }
    //The trouble with this attempt is that it will work only with other Stats objects
    //whose type is the same as the invoking object. For example, if the invoking
    //object is of type Stats<Integer>, then the parameter ob must also be of type
    //Stats<Integer>. It can’t be used to compare the average of an object of type
    //Stats<Double> with the average of an object of type Stats<Short>, for
    //example. Therefore, this approach won’t work except in a very narrow context
    //and does not yield a general (that is, generic) solution.
    //To create a generic sameAvg( ) method, you must use another feature of
    //Java generics: the wildcard argument. The wildcard argument is specified by
    //the ?, and it represents an unknown type. Using a wildcard, here is one way to
    //write the sameAvg( ) method:
    //    boolean sameAvg(Stats<?> obj){
//        if(average()==obj.average)
//            return true;
//        return  false;
//    }
    //Here, Stats<?> matches any Stats object, allowing any two Stats objects to
    //have their averages compared.

    // Bounded Wildcards <? extend Superclass>
    // This will allow to take any arguments as long as it is of type Superclass or any class derived from Superclass( means it subclasses).
    //Notice that an extends clause has been added to the wildcard in the
    //declaration of parameter c. It states that the ? can match any type as long as it
    //is ThreeD, or a class derived from ThreeD. Thus, the extends clause
    //establishes an upper bound that the ? can match. Because of this bound,
    //showXYZ( ) can be called with references to objects of type Coords<ThreeD>
    //or Coords<FourD>, but not with a reference of type Coords<TwoD>.
    //Attempting to call showXZY( ) with a Coords<TwoD> reference results in a
    //compile-time error, thus ensuring type safety.
    //In general, to establish an upper bound for a wildcard, use the following type
    //of wildcard expression:
    //<? extends superclass>
    //where superclass is the name of the class that serves as the upper bound.
    //Remember, this is an inclusive clause because the class forming the upper
    //bound (that is, specified by superclass) is also within bounds.
    //You can also specify a lower bound for a wildcard by adding a super clause
    //to a wildcard declaration. Here is its general form:
    //<? super subclass>
    //In this case, only classes that are superclasses of subclass are acceptable
    //arguments. This is an inclusive clause.

    private double initialValue=0.0;

    <T extends Number> GenericsPractice(T arg){
        initialValue= arg.doubleValue();
    }

    static <T extends  Number> Number sum(T[] x){
        Double sum= 0.0;
        for(T n: x){
            sum= sum + n.doubleValue();
        }
        System.out.println("Sum is "+ sum);
        return  sum;
    }

    static <T extends  Number> Number getAvg(T[] x){
        Double avg=0.0;
        avg= (Double) sum(x)/ Double.valueOf(x.length);
        return  avg;
    }

    static <T extends  Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for(int i=0; i<y.length; i++){
            if(x.equals(y[i]))
                return  true;
        }
        return  false;
    }



    public static void main(String[] args) {
//        Integer nums[]= {1,2 ,5,9, 44, 85};
//        String str[]= {"one", "two"," twenty","four","ten", " nine"};
//        System.out.println("GenericsPractice.isIn(2,nums) = " + GenericsPractice.isIn(2, nums));
//        System.out.println("GenericsPractice.isIn(\"nine\", str) = " + GenericsPractice.isIn("nine", str));
//        GenericsPractice gp= new GenericsPractice();
        Double d[]={11.4,11.0,15.99};
        Double l= Double.valueOf(d.length);
        System.out.println("GenericsPractice.sum(d) = " + GenericsPractice.sum(d));
        System.out.println("getAvg(d) = " + getAvg(d));
    }


}

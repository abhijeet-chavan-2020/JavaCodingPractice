package org.generics;

public class Coordinates <T extends TwoD>{
    T[] coords;

    Coordinates(T[] obj){
        coords= obj;
    }
}

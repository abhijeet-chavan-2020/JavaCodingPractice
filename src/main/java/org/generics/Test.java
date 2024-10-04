package org.generics;

public class Test {
    static void showTwoD(Coordinates<?> c){
        for(int i=0; i<c.coords.length; i++){
            System.out.println("X Coordinate- "+ c.coords[i].x +" " +
                    " Y Coordinate- "+ c.coords[i].y);
        }
    }

    static void showThreeD(Coordinates<? extends ThreeD> c){
        for(int i=0; i<c.coords.length; i++){
            System.out.println("X Coordinate- "+ c.coords[i].x + "  " +
                    "Y Coordinate- "+ c.coords[i].y+ "" +
                    "z Coordinate- "+ c.coords[i].z);
        }
    }

    static void showFourD(Coordinates<? extends FourD> c){
        for(int i=0; i<c.coords.length; i++){
            System.out.println("X Coordinate- "+ c.coords[i].x +  " " +
                    "Y Coordinate- "+ c.coords[i].y+ "  " +
                    "z Coordinate- "+ c.coords[i].z +"  " +
                    "T Coordinate- "+ c.coords[i].t);
        }
    }

    public static void main(String[] args) {
        TwoD twod[]= {
                new TwoD(12,15),
                new TwoD(74, 65),
                new TwoD(26, 10),
                new TwoD(58, 46)
        };

        ThreeD threeD[] = {
                new ThreeD(11, 25, 49),
                new ThreeD(87, 41, 11),
                new ThreeD(10, 66, 74),
                new ThreeD(5, 45, 39)
        };

        FourD fourD[]= {
                new FourD(11,44,75,96),
                new FourD(10,9,44,67),
                new FourD(36,22,85,10),
                new FourD(51,33,8,72),
        };

        Coordinates<TwoD> c1= new Coordinates<>(twod);
        showTwoD(c1);
        Coordinates<ThreeD> c2= new Coordinates<>(threeD);
        showThreeD(c2);
        Coordinates<FourD> c3 = new Coordinates<>(fourD);
        showFourD(c3);
    }
}

package org.example;

final public class Apartment {
    final private int population= 250;
    final protected class City{
        private final int population =100000;
        public final int getPopulation(){
            return Apartment.this.population;
        }
    }
    final City city = new City();

    public static void main(String[] args) {
        System.out.println(new Apartment().city.getPopulation());
        for(int j=0, k=0; j<1; j++, k++){

        }
    }
}

package main.java.org.example;

public class SingletonClassTest {
        private SingletonClassTest(){ }

        private static SingletonClassTest instance;
        public static SingletonClassTest getInstance(){
            if(instance==null){
                instance= new SingletonClassTest();
                System.out.println("Singleton Class object is created for the first time");
            }
            return  instance;
        }


}

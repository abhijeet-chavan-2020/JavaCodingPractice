package main.java.org.example;

public class ThreadSafeSingleton {

    // Step 1: Create a private static volatile instance of the class
    private static volatile ThreadSafeSingleton instance;

    // Step 2: Make the constructor private to prevent instantiation from other classes
    private ThreadSafeSingleton() {
        // Initialize any resources here
    }

    // Step 3: Provide a public static method to get the instance
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    // Other useful methods
    public void showMessage() {
        System.out.println("Hello from ThreadSafeSingleton!");
    }

    public static void main(String[] args) {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        singleton.showMessage();  // Output: Hello from ThreadSafeSingleton!
    }
}


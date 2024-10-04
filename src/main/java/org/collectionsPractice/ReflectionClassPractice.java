package main.java.org.collectionsPractice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionClassPractice {
    public static void main(String[] args) {
        try {
            // Obtain the Class object
            Class<?> personClass = Class.forName("Person");

            // Create an instance of the class
            Object personInstance = personClass.getDeclaredConstructor().newInstance();

            // Access and modify a private field using reflection
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true); // Bypass access control
            nameField.set(personInstance, "John Doe");

            // Invoke a method using reflection
            Method sayHelloMethod = personClass.getDeclaredMethod("sayHello");
            sayHelloMethod.invoke(personInstance);

            // Print the modified field value
            System.out.println("Name: " + nameField.get(personInstance));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

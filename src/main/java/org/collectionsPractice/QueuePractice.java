package main.java.org.collectionsPractice;

import java.util.*;

public class QueuePractice {

    static Queue<String> taskQueue = new LinkedList<>();

    public static void createAQueue(){
        // We can add elements in the Queue with add method which returns true or false
        // We can add elements in the Queue with offer method which returns true or false
        taskQueue.add("Task 1");
        taskQueue.add("Task 2");
        taskQueue.add("Task 3");
        taskQueue.offer("Task 4");
        taskQueue.offer("Task 5");
        taskQueue.offer("Task 6");
        System.out.println("Queue is created =>>> "+taskQueue);
    }


    public static void main(String[] args) {
        createAQueue();
        String ele= taskQueue.element(); // element() Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
        System.out.println("After element() method taskQueue = " + taskQueue);
        System.out.println("ele = " + ele);
        System.out.println("taskQueue.poll() = " + taskQueue.poll()); //poll(): Retrieves and removes the head of the queue, or returns null if the queue is empty.
        System.out.println("After poll() method taskQueue = " + taskQueue);
        System.out.println("taskQueue.peek() = " + taskQueue.peek()); // peek(): Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
        System.out.println("After peek() method taskQueue = " + taskQueue);
        System.out.println("taskQueue.remove() = " + taskQueue.remove()); //remove(): Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
        System.out.println("After remove() method taskQueue = " + taskQueue);
        taskQueue.add("Task 3"); // add(E e): Inserts the specified element into the queue. Throws an exception if the operation fails.
        taskQueue.offer("Task 4"); // offer(E e): Inserts the specified element into the queue. Returns false if the operation fails.
        Iterator<String> it= taskQueue.iterator();

        while(it.hasNext()){ // as its a queue, we don't use hasNext method.
            System.out.println(" " + it.next()+ " ");
        }
        taskQueue.remove("Task 6");
        System.out.println("After taskQueue.remove(\"Task 3\") method taskQueue = " + taskQueue);
        System.out.println("taskQueue.size() = " + taskQueue.size());
        taskQueue.removeAll(List.of( "Task 3","Task 4")); // These are generic method in Collection
        System.out.println("After taskQueue.removeAll(List.of( \"Task 3\")) " + taskQueue);
        createAQueue();
        taskQueue.addAll(List.of("New Task1"," New Task2", "New Task3")); // These are generic method in Collection
        System.out.println("After taskQueue.addAll(List.of(\"New Task1\",\" New Task2\", \"New Task3\")) taskQueue = " + taskQueue);
        System.out.println("taskQueue.containsAll(List.of(\"New Task1\",\" New Task2\", \"New Task3\")) = " + taskQueue.containsAll(List.of("New Task1", " New Task2", "New Task3"))); // These are generic method in Collection
        taskQueue.retainAll(List.of("Task 1","Task 2", "Task 6" )); // These are generic method in Collection
        System.out.println("After taskQueue.retainAll(List.of(\"Task 1\",\"Task 2\", \"Task 6\" )) taskQueue = " + taskQueue);

        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll(); // Retrieves and removes the highest priority job form the head of the queue
            System.out.println("Processing: " + task);
        }
    }
}

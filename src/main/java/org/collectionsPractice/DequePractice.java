package org.collectionsPractice;

import java.util.*;

public class DequePractice {
    private Deque<String> undoStack = new ArrayDeque<>();
    private Deque<String> redoStack = new ArrayDeque<>();

    public void type(String text) {
        undoStack.push(text);
        redoStack.clear(); // Clear redo stack when new action is performed
    }

    public String undo() {
        if (!undoStack.isEmpty()) {
            String lastAction = undoStack.pop();
            redoStack.push(lastAction);
            return lastAction;
        }
        return null; // No action to undo
    }

    public String redo() {
        if (!redoStack.isEmpty()) {
            String lastUndo = redoStack.pop();
            undoStack.push(lastUndo);
            return lastUndo;
        }
        return null; // No action to redo
    }

    public static boolean isPalindrome(String s){
        Deque<Character> dq = new ArrayDeque<>();
        for(char c: s.toLowerCase().toCharArray()){
            dq.add(c);
        }

        while(dq.size()>1){
            if(!dq.removeFirst().equals(dq.removeLast())){
                return  false;
            }
        }
        return  true;
    }

    private static Deque<String> dq1= new ArrayDeque<>();

    static void createDq(){
        dq1.addFirst("One"); // add two the head of the dq
        System.out.println("dq1 = " + dq1);
        dq1.addLast("Ten"); // add to the tail of the dq
        System.out.println("dq1 = " + dq1);
        dq1.add("Two"); //adds to the tail of the dq
        System.out.println("dq1 = " + dq1);
        dq1.offer("Three");//adds to the tail of the dq
        System.out.println("dq1 = " + dq1);
        dq1.offerFirst("Four"); //adds to the head of the dq
        System.out.println("dq1 = " + dq1);
        dq1.offerLast("Five"); //adds to the tail of the dq
        System.out.println("dq1 = " + dq1);
    }

    public static void main(String[] args) {
        DequePractice editor = new DequePractice();
        editor.type("Hello");
        editor.type("World");

        System.out.println("Undo: " + editor.undo());
        System.out.println("Redo: " + editor.redo());

        System.out.println("isPalindrome(\"racecar\") = " + isPalindrome("racECar"));

        createDq();
        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1.getLast() = " + dq1.getLast());
        System.out.println("Current dq1 = " + dq1);

        System.out.println(dq1.pollFirst());
        System.out.println("After dq1.pollFirst()  dq1 = " + dq1);

        System.out.println("dq1.pollLast() = " + dq1.pollLast());
        System.out.println("After dq1.pollLast()()  dq1 = " + dq1);

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("After dq1.peekFirst()()  dq1 = " + dq1);

        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        System.out.println("After dq1.peekLast()()  dq1 = " + dq1);

        System.out.println("dq1.removeFirst() = " + dq1.removeFirst());
        System.out.println("After dq1.removeFirst()()  dq1 = " + dq1);

        System.out.println("dq1.removeLast() = " + dq1.removeLast());
        System.out.println("After dq1.removeLast()()  dq1 = " + dq1);

        dq1.addAll(List.of("Four","Seven", "Eight","Nine", "Four"));
        System.out.println("After dq1.addAll()  dq1 = " + dq1);

        dq1.addLast("Four");
        System.out.println("After dq1.addLast(\"Four\")  dq1 = " + dq1);

        dq1.removeFirstOccurrence("Four");
        System.out.println("After dq1.removeFirstOccurrence(\"Four\")   dq1 = " + dq1);

        dq1.removeLastOccurrence("Four");
        System.out.println("After dq1.removeLastOccurrence(\"Four\")   dq1 = " + dq1);

        dq1.remove();
        System.out.println("After dq1.remove() dq1 = " + dq1);
        dq1.remove("Eight");
        System.out.println("After dq1.remove(\"Eight\") dq1 = " + dq1);
    }
}

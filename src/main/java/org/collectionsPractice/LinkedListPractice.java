package org.collectionsPractice;

import org.w3c.dom.Node;

import java.util.*;

public class LinkedListPractice {
    //The LinkedList class extends AbstractSequentialList and implements the List, Deque, and Queue interfaces. It provides a linked-list data structure.
    //Because LinkedList implements the Deque interface, you have access to the methods defined by Deque

//Question: What are the trade-offs of using LinkedList over other collection types like ArrayList or HashSet?
//Answer: The main trade-offs are:
//Memory: LinkedList uses more memory due to its node structure with references to the next and previous elements.
//Access Time: LinkedList has slower access time for random access (O(n)), while ArrayList is faster (O(1)).
//Insertion/Deletion: LinkedList excels at fast insertion and deletion (O(1) at head/tail), while ArrayList can be slower due to shifting elements (O(n)).

    /* Industry practical used of LInkedList
    Efficient Insertion and Deletion:

Use Case: When you need to frequently insert or remove elements from both ends or the middle of a list.
Example: Implementing a cache or a playlist, where items are added and removed often, and the order of insertion is crucial.
Implementing Queues and Deques:

Use Case: Since LinkedList implements both the Queue and Deque interfaces, it's ideal for creating FIFO (First-In-First-Out) queues or double-ended queues (deques).
Example: Task scheduling systems, job queues in operating systems, or implementing a simple browser history.
Real-Time Data Processing:

Use Case: For real-time systems where you may need to process data streams, LinkedList can efficiently handle dynamic data sizes and quick element access at the head and tail.
Example: Handling a continuous stream of data such as in a real-time messaging system or event processing in gaming applications.
Undo and Redo Operations:

Use Case: Implementing undo and redo stacks where operations need to be easily added and removed in LIFO (Last-In-First-Out) order.
Example: Text editors, where each command (like typing or deleting) is pushed onto a stack.
Navigation Systems:

Use Case: When implementing a navigation system where moving back and forth between elements (like browser history or a sequence of steps) is necessary.
Example: Implementing a breadcrumb trail in a website, where users can navigate back to previous pages.

     */


    /*
    10 Common Practice Problems on LinkedList (with Solutions)

    Reverse a LinkedList:

Problem: Given a LinkedList, reverse the list.
Solution: Traverse the list and reverse the pointers.
Detect a Cycle in a LinkedList:

Problem: Determine if a LinkedList has a cycle (i.e., it loops back to a previous node).
Solution: Use Floyd’s Cycle-Finding Algorithm (Tortoise and Hare).
Find the Middle of a LinkedList:

Problem: Find the middle node in a LinkedList.
Solution: Use two pointers, one moving twice as fast as the other.
Merge Two Sorted LinkedLists:

Problem: Merge two sorted LinkedLists into one sorted list.
Solution: Use a two-pointer technique to merge both lists in a single pass.
Remove N-th Node from the End:

Problem: Remove the N-th node from the end of a LinkedList.
Solution: Use two pointers with a gap of N nodes between them.
Check if LinkedList is a Palindrome:

Problem: Check if the elements of a LinkedList form a palindrome.
Solution: Use a stack or reverse the second half of the list.
Intersection of Two LinkedLists:

Problem: Find the node at which two LinkedLists intersect.
Solution: Traverse both lists and compare node references.
Remove Duplicates from a Sorted LinkedList:

Problem: Remove duplicate elements from a sorted LinkedList.
Solution: Traverse the list and remove consecutive duplicates.
Flatten a Multilevel LinkedList:

Problem: Given a LinkedList where each node can point to another LinkedList, flatten it.
Solution: Recursively or iteratively process sublists and merge them into the main list.
Rotate a LinkedList:

Problem: Rotate the LinkedList by K positions to the right.
Solution: Find the K-th node and rearrange pointers to rotate the list.
     */

    /*

    Commonly Used Methods in LinkedList and Their Uses
Method	Description	Example Use Case
add(E e)	Adds an element to the end of the list.	Adding an item to a to-do list.
add(int index, E element)	Inserts the specified element at the specified position in the list.	Inserting an item at a specific position in a playlist.
addFirst(E e)	Inserts the specified element at the beginning of the list.	Adding a recent search query to the top of the history list.
addLast(E e)	Appends the specified element to the end of the list.	Adding an item to the end of a queue.
get(int index)	Returns the element at the specified position in the list.	Accessing an element by its position.
getFirst()	Returns the first element in the list.	Getting the most recent item in a history list.
getLast()	Returns the last element in the list.	Retrieving the last added item in a queue.
remove(int index)	Removes the element at the specified position in the list.	Deleting an item from a specific position in a list.
removeFirst()	Removes and returns the first element from the list.	Dequeueing the first item in a queue.
removeLast()	Removes and returns the last element from the list.	Removing the last item in a history stack.
remove(Object o)	Removes the first occurrence of the specified element from the list.	Removing a specific item from a to-do list.
size()	Returns the number of elements in the list.	Checking how many items are in a shopping cart list.
clear()	Removes all elements from the list.	Clearing all tasks from a completed tasks list.
contains(Object o)	Returns true if the list contains the specified element.	Checking if a to-do list contains a specific task.
indexOf(Object o)	Returns the index of the first occurrence of the specified element.	Finding the position of a specific item in a list.
lastIndexOf(Object o)	Returns the index of the last occurrence of the specified element.	Finding the position of the last occurrence of a repeated item.
peek()	Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.	Viewing the next task to be processed without removing it.
poll()	Retrieves and removes the first element of this list, or returns null if this list is empty.	Processing and removing the next task in a queue.
offer(E e)	Adds the specified element as the tail (last element) of this list.	Adding an element to a queue (alternative to addLast).
descendingIterator()	Returns an iterator over the elements in this list in reverse order.	Iterating over the elements from end to start.

     */
    private static LinkedList<String> linkedList = new LinkedList<String>();
    public void createLinkedList(){
        linkedList.addFirst("Mango");
        linkedList.addLast("Banana");
        linkedList.add("Papaya");
        linkedList.offer("Litchi");
        linkedList.offerFirst("Coconut");
        linkedList.offerLast("Apple");
        linkedList.addFirst("Mango");
       // linkedList.set(0, "Pineapple");
        System.out.println("linkedList = " + linkedList);
    }


    //How would you remove duplicate elements from a LinkedList?
    //
    //Answer: You can iterate through the LinkedList and use a HashSet to track seen elements. If an element is already in the set, remove it from the LinkedList.

    public void removeDuplicatesFromLinkedList(){
        LinkedList<Integer> intll = new LinkedList<>(Arrays.asList(1,2,3,2,2,1,5,7,8,7,9));
        Set<Integer> seen= new HashSet<>();
        System.out.println("When LinkedList is created - intll = " + intll);

        Iterator<Integer> it= intll.iterator();
        while (it.hasNext()){
            int num= it.next();
            if(!seen.add(num)){
                it.remove();
            }
        }
        System.out.println("After duplicates are removed - intll = " + intll);
    }

    public void reverseALinkedList(){
        createLinkedList();
        Collections.reverse(linkedList);
        System.out.println("Reversed linkedList = " + linkedList);

//        Iterator<String> it= linkedList.descendingIterator();
//        LinkedList<String> reversedLinkedList= new LinkedList<>();
//        while (!linkedList.isEmpty()){
//            reversedLinkedList.add(linkedList.pollLast());
//        }
//        System.out.println("reversedLinkedList = " + reversedLinkedList);
    }

    //How will you modify a linked list of integers so that all even numbers appear before all odd numbers in the modified linked list? Also, keep the even and odd numbers in the same order.
    //Example:
    //Input: 17->15->8->12->10->5->4->1->7->6->NULL
    //Output: 8->12->10->4->6->17->15->5->1->7->NULL
    public  static void modifyLinkedListIntoEvenOdd(){
        LinkedList<Integer> llInt = new LinkedList<>(List.of(17,15,8,12,10,5,4,1,7,6));
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        Iterator<Integer> itEvn= llInt.iterator();
        Iterator<Integer> itodd= llInt.iterator();
        while(itEvn.hasNext()){
            int num=itEvn.next();
            if(num%2==0){
                newLinkedList.add(num);
            }
        }

        while(itodd.hasNext()){
            int num=itodd.next();
            if(num%2!=0){
                newLinkedList.addLast(num);
            }
        }
        System.out.println("llInt = " + llInt);
        System.out.println("newLinkedList = " + newLinkedList);

    }

    public static void main(String[] args) {
//        LinkedListPractice llp= new LinkedListPractice();
//        llp.createLinkedList();
//        while(!linkedList.isEmpty()){
//           // System.out.println("linkedList.pollFirst() = " + linkedList.pollFirst());
//            System.out.println("linkedList.pollFirst() = " + linkedList.pop());
//        }

//        Iterator<String> it= linkedList.iterator();
//        while (it.hasNext()){
//            System.out.println("it.next() = " + it.next());
//        }
//
//        ListIterator<String> lit= linkedList.listIterator(linkedList.size());
//        while(lit.hasPrevious()){
//            System.out.println("lit.previous() = " + lit.previous());
//        }
//
//        llp.removeDuplicatesFromLinkedList();
//        llp.reverseALinkedList();

        modifyLinkedListIntoEvenOdd();
    }
}

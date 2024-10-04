package org.collectionsPractice;

public class CollectionInterfaceExplanation {

    /*

                                     Collection
                                     |
                 -------------------------------------------
                 |                                         |
                List                                      Set
                 |                                         |
    ------------------------------------                  -----
    |               |                 |                  |     |
 ArrayList      LinkedList          Vector             SortedSet HashSet
    |              |                 |                   |       |
    |              |              Stack              NavigableSet LinkedHashSet
    |              |                                   /       \
CopyOnWriteArrayList    ArrayDeque       TreeSet         EnumSet   |
                                            |                       |
                                        ConcurrentSkipListSet        |
                                                                         |
                                      ----------------------------------------------
                                      |                  |                        |
                                 Map                  Deque                    Queue
                                   |                    |                        |
                            ----------------    ----------------    ------------------
                            |              |    |              |    |                |
                         HashMap      SortedMap LinkedList  ArrayDeque PriorityQueue  |
                            |                    |           |          |            |
                    LinkedHashMap             NavigableMap     LinkedList       ConcurrentLinkedQueue
                            |                     |                            |
                   ConcurrentHashMap          TreeMap                   ConcurrentLinkedDeque
                            |
                        WeakHashMap
                            |
                   IdentityHashMap

     */

    /*
    Explanation of the Diagram:
Collection Interface: The root interface of the collection hierarchy.
List Interface: Implemented by classes like ArrayList, LinkedList, Vector, and CopyOnWriteArrayList. Vector further has a subclass Stack.
Set Interface: Implemented by HashSet, LinkedHashSet, and other classes.
SortedSet Interface: A subinterface of Set, implemented by TreeSet and ConcurrentSkipListSet.
NavigableSet Interface: Extends SortedSet, implemented by TreeSet and ConcurrentSkipListSet.
Map Interface: Implemented by HashMap, LinkedHashMap, ConcurrentHashMap, and other classes.
SortedMap Interface: A subinterface of Map, implemented by TreeMap.
NavigableMap Interface: Extends SortedMap, implemented by TreeMap.
Deque Interface: A double-ended queue, implemented by LinkedList, ArrayDeque, and ConcurrentLinkedDeque.
Queue Interface: Implemented by PriorityQueue, LinkedList, ArrayDeque, and ConcurrentLinkedQueue.
     */
}

//COLLECTION IN  JAVA
//INTERFACE
//INTERATOR INTERFACE

//ARRAYLIST
/*import java.util.*;
public class Unit2{
    @SuppressWarnings("unchecked")
    public static void main(String args[]){

        //WITHOUT GENERICS
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add("Aditya");
        list1.add(2.0);

        System.out.println(list1);
        
        

        //GENERICS
        /*ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println(list1);
        

        //GENERICS USINF SCANNER
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list3 = new ArrayList<>();
        System.out.print("HOW MANY PRODUCTS YOU WANT :");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Product name :");
            String name = sc.nextLine();
            list3.add(name);
        }

        System.out.println(list3);
        
        
    }
}
*/



//ALL FUNCTION OF ARRAYLIST
/*import java.util.ArrayList;
import java.util.Collections;

public class Unit2 {

    public static void main(String[] args) {

        // 1. Create an ArrayList
        ArrayList<Object> list = new ArrayList<>();

        // 2. add() - Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original list: " + list);


        // 3. add(index, element) - Add at a particular position
        list.add(1, "Grapes");

        System.out.println("After adding at index 1: " + list);


        // 4. get(index) - Get an element
        System.out.println("Element at index 2: " + list.get(2));


        // 5. set(index, element) - Replace an element
        list.set(2, "Pineapple");

        System.out.println("After set(): " + list);


        // 6. remove(index) - Remove using index
        list.remove(3);

        System.out.println("After remove(index): " + list);


        // 7. remove(object) - Remove using value
        list.remove("Apple");

        System.out.println("After remove(object): " + list);


        // 8. size() - Number of elements
        System.out.println("Size: " + list.size());


        // 9. contains() - Check if element exists
        System.out.println("Contains Mango? " + list.contains("Mango"));


        // 10. indexOf() - Find first occurrence
        System.out.println("Index of Banana: " + list.indexOf("Banana"));


        // 11. lastIndexOf() - Find last occurrence
        list.add("Banana");
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));


        // 12. isEmpty() - Check whether list is empty
        System.out.println("Is list empty? " + list.isEmpty());


        // 13. addAll() - Add another collection
        ArrayList<Object> list2 = new ArrayList<>();

        list2.add("Kiwi");
        list2.add("Papaya");

        list.addAll(list2);

        System.out.println("After addAll(): " + list);


        // 14. addAll(index, collection) - Add collection at index
        ArrayList<Object> list3 = new ArrayList<>();

        list3.add("Guava");
        list3.add("Watermelon");

        list.addAll(1, list3);

        System.out.println("After addAll(index, collection): " + list);


        // 15. containsAll() - Check whether all elements exist
        System.out.println(
            "Contains all list2 elements? " + list.containsAll(list2)
        );


        // 16. removeAll() - Remove all matching elements
        list.removeAll(list2);

        System.out.println("After removeAll(): " + list);


        // 17. clear() - Remove everything
        ArrayList<Object> temp = new ArrayList<>();

        temp.add("A");
        temp.add("B");
        temp.add("C");

        System.out.println("Before clear(): " + temp);

        temp.clear();

        System.out.println("After clear(): " + temp);


        // 18. clone() - Create a copy
        ArrayList<Object> copy =
                (ArrayList<Object>) list.clone();

        System.out.println("Cloned list: " + copy);


        // 19. toArray() - Convert ArrayList to array
        Object[] array = list.toArray();

        System.out.println("Array elements:");

        for (Object x : array) {
            System.out.println(x);
        }


        // 20. Loop using for loop
        System.out.println("\nUsing normal for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // 21. Loop using for-each
        System.out.println("\nUsing for-each loop:");

        for (Object x : list) {
            System.out.println(x);
        }


        // 22. Loop using forEach()
        System.out.println("\nUsing forEach():");

        list.forEach(x -> System.out.println(x));


        // 23. Collections.sort()
        // Works here because all current elements are Strings
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Vikas");
        names.add("Suresh");

        System.out.println("\nBefore sorting: " + names);

        Collections.sort(names);

        System.out.println("After sorting: " + names);


        // 24. Collections.reverse()
        Collections.reverse(names);

        System.out.println("After reverse: " + names);


        // 25. Collections.shuffle()
        Collections.shuffle(names);

        System.out.println("After shuffle: " + names);


        // 26. trimToSize()
        names.trimToSize();

        System.out.println("trimToSize() executed");


        // 27. ensureCapacity()
        names.ensureCapacity(20);

        System.out.println("ensureCapacity() executed");


        // 28. Check size again
        System.out.println("Final size: " + names.size());
    }
}
*/

//LINKED LIST
/*import java.util.LinkedList;

public class Unit2{

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);

        // Add at beginning
        list.addFirst(5);

        System.out.println("After addFirst: " + list);

        // Add at end
        list.addLast(40);

        System.out.println("After addLast: " + list);

        // Add at specific index
        list.add(2, 15);

        System.out.println("After adding 15 at index 2: " + list);

        // Get element
        System.out.println("Element at index 2: " + list.get(2));

        // Get first element
        System.out.println("First element: " + list.getFirst());

        // Get last element
        System.out.println("Last element: " + list.getLast());

        // Remove first
        list.removeFirst();

        System.out.println("After removeFirst: " + list);

        // Remove last
        list.removeLast();

        System.out.println("After removeLast: " + list);

        // Remove using index
        list.remove(1);

        //Remove by value
        list.remove(Integer.valueOf(30));

        System.out.println("After remove index 1: " + list);

        //Update 
        list.set(1 , 35);

        System.out.println("After Updation: " + list);

        //Get 
        list.get(1);

        // Search
        System.out.println("Contains 20? " + list.contains(20));

        // Size
        System.out.println("Size: " + list.size());

        // Iterate using FOR EACH LOOP
        System.out.println("Elements:");

        for (int value : list) {
            System.out.println(value);
        }

        // Clear
        list.clear();

        System.out.println("After clear: " + list);
    }
}
*/

//VECTOR LIST
/*import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {

    public static void main(String[] args) {

        // ==========================================
        // 1. Creating a Vector
        // ==========================================

        Vector<Integer> v = new Vector<>();

        // Add elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector: " + v);


        // ==========================================
        // 2. add()
        // ==========================================

        v.add(50);

        System.out.println("After add(50): " + v);


        // ==========================================
        // 3. add(index, element)
        // ==========================================

        v.add(2, 25);

        System.out.println("After add(2, 25): " + v);


        // ==========================================
        // 4. addElement()
        // ==========================================

        v.addElement(60);

        System.out.println("After addElement(60): " + v);


        // ==========================================
        // 5. addAll()
        // ==========================================

        Vector<Integer> v2 = new Vector<>();

        v2.add(70);
        v2.add(80);

        v.addAll(v2);

        System.out.println("After addAll(): " + v);


        // ==========================================
        // 6. get()
        // ==========================================

        System.out.println("Element at index 2: " + v.get(2));


        // ==========================================
        // 7. elementAt()
        // ==========================================

        System.out.println("Element at index 3: " + v.elementAt(3));


        // ==========================================
        // 8. firstElement()
        // ==========================================

        System.out.println("First element: " + v.firstElement());


        // ==========================================
        // 9. lastElement()
        // ==========================================

        System.out.println("Last element: " + v.lastElement());


        // ==========================================
        // 10. set()
        // ==========================================

        v.set(0, 100);

        System.out.println("After set(0, 100): " + v);


        // ==========================================
        // 11. setElementAt()
        // ==========================================

        v.setElementAt(200, 1);

        System.out.println("After setElementAt(200, 1): " + v);


        // ==========================================
        // 12. contains()
        // ==========================================

        System.out.println("Contains 30? " + v.contains(30));


        // ==========================================
        // 13. indexOf()
        // ==========================================

        System.out.println("Index of 30: " + v.indexOf(30));


        // ==========================================
        // 14. lastIndexOf()
        // ==========================================

        v.add(30);

        System.out.println("Last index of 30: " + v.lastIndexOf(30));


        // ==========================================
        // 15. remove(index)
        // ==========================================

        v.remove(2);

        System.out.println("After remove(2): " + v);


        // ==========================================
        // 16. remove(object)
        // ==========================================

        v.remove(Integer.valueOf(30));

        System.out.println("After remove(30): " + v);


        // ==========================================
        // 17. removeElement()
        // ==========================================

        v.removeElement(40);

        System.out.println("After removeElement(40): " + v);


        // ==========================================
        // 18. removeElementAt()
        // ==========================================

        v.removeElementAt(0);

        System.out.println("After removeElementAt(0): " + v);


        // ==========================================
        // 19. removeAllElements()
        // ==========================================

        Vector<Integer> temp = new Vector<>();

        temp.add(1);
        temp.add(2);
        temp.add(3);

        System.out.println("Temp Vector: " + temp);

        temp.removeAllElements();

        System.out.println("After removeAllElements(): " + temp);


        // ==========================================
        // 20. size()
        // ==========================================

        System.out.println("Size: " + v.size());


        // ==========================================
        // 21. isEmpty()
        // ==========================================

        System.out.println("Is empty? " + v.isEmpty());


        // ==========================================
        // 22. capacity()
        // ==========================================

        System.out.println("Capacity: " + v.capacity());


        // ==========================================
        // 23. ensureCapacity()
        // ==========================================

        v.ensureCapacity(50);

        System.out.println("Capacity after ensureCapacity(50): "
                + v.capacity());


        // ==========================================
        // 24. trimToSize()
        // ==========================================

        v.trimToSize();

        System.out.println("Capacity after trimToSize(): "
                + v.capacity());


        // ==========================================
        // 25. clone()
        // ==========================================

        Vector<Integer> copy = (Vector<Integer>) v.clone();

        System.out.println("Cloned Vector: " + copy);


        // ==========================================
        // 26. clear()
        // ==========================================

        copy.clear();

        System.out.println("After clear(): " + copy);


        // ==========================================
        // 27. for-each loop
        // ==========================================

        System.out.println("\nUsing for-each:");

        for (int value : v) {
            System.out.println(value);
        }


        // ==========================================
        // 28. Iterator
        // ==========================================

        System.out.println("\nUsing Iterator:");

        Iterator<Integer> itr = v.iterator();

        while (itr.hasNext()) {
            int value = itr.next();
            System.out.println(value);
        }
    }
}
*/

//STACK 
/*import java.util.Stack;
import java.util.Iterator;

public class Unit2 {

    public static void main(String[] args) {

        // ==========================================
        // 1. CREATE A STACK
        // ==========================================

        Stack<Integer> stack = new Stack<>();


        // ==========================================
        // 2. push()
        // Adds an element to the TOP of stack
        // ==========================================

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);


        // ==========================================
        // 3. peek()
        // Returns the top element
        // WITHOUT removing it
        // ==========================================

        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack after peek: " + stack);


        // ==========================================
        // 4. pop()
        // Removes and returns the top element
        // ==========================================

        int removed = stack.pop();

        System.out.println("Removed element: " + removed);
        System.out.println("Stack after pop: " + stack);


        // ==========================================
        // 5. empty()
        // Checks whether stack is empty
        // ==========================================

        System.out.println("Is stack empty? " + stack.empty());


        // ==========================================
        // 6. isEmpty()
        // Also checks whether stack is empty
        // ==========================================

        System.out.println("Is stack empty? " + stack.isEmpty());


        // ==========================================
        // 7. search()
        // Searches an element
        // Returns 1-based position from TOP
        // ==========================================

        stack.push(40);

        System.out.println("Stack: " + stack);

        System.out.println("Position of 20 from top: "
                + stack.search(20));

        System.out.println("Position of 100 from top: "
                + stack.search(100));


        // ==========================================
        // 8. size()
        // Returns number of elements
        // ==========================================

        System.out.println("Stack size: " + stack.size());


        // ==========================================
        // 9. get()
        // Gets element using index
        // ==========================================

        System.out.println("Element at index 1: "
                + stack.get(1));


        // ==========================================
        // 10. set()
        // Changes an element at an index
        // ==========================================

        stack.set(1, 200);

        System.out.println("After set(1, 200): " + stack);


        // ==========================================
        // 11. add()
        // Adds element
        // NOTE: This adds according to List behavior,
        // not specifically "push" behavior.
        // ==========================================

        stack.add(50);

        System.out.println("After add(50): " + stack);


        // ==========================================
        // 12. add(index, element)
        // Adds element at a particular index
        // ==========================================

        stack.add(1, 15);

        System.out.println("After add(1, 15): " + stack);


        // ==========================================
        // 13. contains()
        // Checks whether element exists
        // ==========================================

        System.out.println("Contains 30? "
                + stack.contains(30));

        System.out.println("Contains 100? "
                + stack.contains(100));


        // ==========================================
        // 14. indexOf()
        // Returns index of first occurrence
        // ==========================================

        System.out.println("Index of 30: "
                + stack.indexOf(30));


        // ==========================================
        // 15. lastIndexOf()
        // Returns index of last occurrence
        // ==========================================

        stack.add(30);

        System.out.println("Last index of 30: "
                + stack.lastIndexOf(30));


        // ==========================================
        // 16. remove(index)
        // Removes element at index
        // ==========================================

        stack.remove(1);

        System.out.println("After remove(1): " + stack);


        // ==========================================
        // 17. remove(object)
        // Removes the specified object
        // ==========================================

        stack.remove(Integer.valueOf(30));

        System.out.println("After remove(30): " + stack);


        // ==========================================
        // 18. clear()
        // Removes all elements
        // ==========================================

        Stack<Integer> temp = new Stack<>();

        temp.push(100);
        temp.push(200);
        temp.push(300);

        System.out.println("Temp stack: " + temp);

        temp.clear();

        System.out.println("After clear(): " + temp);


        // ==========================================
        // 19. clone()
        // Creates a copy of stack
        // ==========================================

        Stack<Integer> copy =
                (Stack<Integer>) stack.clone();

        System.out.println("Original stack: " + stack);
        System.out.println("Cloned stack: " + copy);


        // ==========================================
        // 20. ITERATOR
        // Traverse the stack
        // ==========================================

        System.out.println("\nUsing Iterator:");

        Iterator<Integer> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // ==========================================
        // 21. FOR-EACH LOOP
        // ==========================================

        System.out.println("\nUsing for-each:");

        for (int value : stack) {
            System.out.println(value);
        }


        // ==========================================
        // 22. POP ALL ELEMENTS
        // ==========================================

        System.out.println("\nRemoving all elements using pop:");

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Final Stack: " + stack);
    }
}
*/

//LINKED LIST
/*import java.util.*;

public class Unit2 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);


        // 2. Add at beginning
        list.addFirst(5);

        System.out.println("After adding at beginning: " + list);


        // 3. Add at end
        list.addLast(40);

        System.out.println("After adding at end: " + list);


        // 4. Add at particular index
        list.add(2, 15);

        System.out.println("After adding at index 2: " + list);


        // 5. Get element
        System.out.println("Element at index 2: " + list.get(2));


        // 6. Get first element
        System.out.println("First element: " + list.getFirst());


        // 7. Get last element
        System.out.println("Last element: " + list.getLast());


        // 8. Change element
        list.set(2, 100);

        System.out.println("After changing index 2: " + list);


        // 9. Remove first element
        list.removeFirst();

        System.out.println("After removing first: " + list);


        // 10. Remove last element
        list.removeLast();

        System.out.println("After removing last: " + list);


        // 11. Remove using index
        list.remove(1);

        System.out.println("After removing index 1: " + list);


        // 12. Remove using value
        list.remove(Integer.valueOf(30));

        System.out.println("After removing value 30: " + list);


        // 13. Search
        if (list.contains(20)) {
            System.out.println("20 is present");
        } else {
            System.out.println("20 is not present");
        }


        // 14. Find index
        System.out.println("Index of 20: " + list.indexOf(20));


        // 15. Size
        System.out.println("Size: " + list.size());


        // 16. Check empty
        System.out.println("Is list empty? " + list.isEmpty());

        //SORT 
        System.out.println(Collection.sort(list));

        //SORT IN REVERSE ORDER


        // 17. Traverse using for loop
        System.out.println("Using for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // 18. Traverse using enhanced for loop
        System.out.println("Using enhanced for loop:");

        for (int x : list) {
            System.out.println(x);
        }


        // 19. Clear entire list
        list.clear();

        System.out.println("After clear: " + list);
    }
}
*/

//QUEUE
/*import java.util.*;
public class Unit2{
    public static void main(String args[]){
        Queue<String>  q1 = new LinkedList<>();

        //ADD
        q1.add("Aditya");
        q1.offer("Anshuman");
        q1.add("AAAA");

        System.out.println("Fruits Queue :" + q1);

        //REMOVE
        q1.remove();
        System.out.println("Updated Queue:" + q1);

        //CLEAR
        q1.clear();
        System.out.println("Updated Queue:" + q1);

        //WHAT HAPPENDS WHEN WE TRY TO REMOVE AN ELEMENT FROM AN EMPTY LIST -- LEARN ABOUT POLL FUNCTION

        //PEEK
        System.out.println(q1.peek());

    }

}
*/

/*A Set in Java is a collection that stores unique elements. Unlike a List,
a Set does not allow duplicate elements.
| Set             | Maintains order?      | Allows duplicates? | Main feature                 |
| --------------- | --------------------- | ------------------ | ---------------------------- |
| HashSet       | ❌ No guaranteed order | ❌ No               | Fast, general-purpose        |
| LinkedHashSet | ✅ Insertion order     | ❌ No               | Maintains insertion order    |
| TreeSet       | ✅ Sorted order        | ❌ No               | Automatically sorts elements |
*/
/*import java.util.*;
public class Unit2 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();

        s1.add(24);
        s1.add(50);
        s1.add(26);
        s1.add(100);   // Duplicate

        System.out.println(s1);

        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();

        s2.add(42);
        s2.add(57);
        s2.add(62);
        s2.add(189);
        System.out.println(s2);

        TreeSet<Integer> s3 = new TreeSet<>();

        s3.add(24);
        s3.add(50);
        s3.add(26);
        s3.add(100);
        System.out.println(s3);
        s1.add(200);
        System.out.println(s1);

        //s2.retainAll(s1);

        Set<Integer> Union = new LinkedHashSet<>(s1);
        Union.addAll(s3);
        System.out.println(Union);

        Set<Integer> Intersection = new LinkedHashSet<>(s1);
        Intersection.retainAll(s3);
        System.out.println(Intersection);

        Set<Integer> Difference = new LinkedHashSet<>(s1);
        Union.removeAll(s3);
        System.out.println(Difference);
    }
}
*/

//HASHING

import java.util.*;
public class Unit2{
    public static void main(String args[]){
        HashMap<Integer , String> map = new HashMap<>();

        map.put()

    }
}







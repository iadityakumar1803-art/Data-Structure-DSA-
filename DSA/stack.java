package DSA;
//IMPLIMENTATION OF STACK USING ARRAY
/*import java.util.*;
public class stack{
    static class stackB{
        int arr[];
        int size;
        int top;
        stackB(int size){
            this.size = size;
            arr = new int[size];
            top = -1 ;
        }
        public boolean isEmpty(){
            return top == -1;
        }
    
        public void push(int data){
            if(top == size - 1){
                System.out.println("STACK OVERFLOW");
                return;
            }
            arr[++top] = data;
        }

        public int pop(){
            if(top == -1){
                System.out.println("STACK UNDERFLOW");
                return -1;
            }
            return arr[top--];
        }

        public int peek(){
            if(top == -1){
                System.out.println("EMPTY STACK");
                return -1 ;
            }
            return arr[top];
        }
    }
    public static void main(String args[]){
        stackB s = new stackB(5);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.print(s.pop()+ " ");
        }
    }
}
*/

//IMPLIMENTATION OF STACKS USING LINKEDLIST
/*import java.util.*;
public class stack{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(head == null){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;

    }

    public int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }

    public  boolean isEmpty(){
        return head == null;
    }

    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());

        while(!s.isEmpty()){
            System.out.print(s.pop()+ " ");
        }
    }
}
*/

//PUSH AT THE BUTTOM
import java.util.*;
public class stack{
    public static void pushAtBottom(Stack<Integer> s , int q){
        if(s.isEmpty()){
            s.push(q);
            return;
        }
        int top = s.pop();
        pushAtBottom(s , q);
        s.push(top);


    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        pushAtBottom(s, 0);

    }
}
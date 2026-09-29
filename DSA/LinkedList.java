package DSA;
//CREATING A NODE
/*public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;  
        }
    }
    public static void main(String args[]){

    } 
}
*/

//CREATING HEAD NODE AND TAIIL NODE
/*public class LinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String args[]){

    }
}
*/

//ADD FIRST IN LINKEDLIST
/*public class LinkedList{
    class Node{
        int data;
        int next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }

        newnode.next = head;

        head = newnode;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
    }
}
*/

//ADD LAST IN THE LINKEDLIST
public class LinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addlast(int data){
        Node newnode = new Node(data);
        if(tail == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;

        tail = newnode;
    }

}

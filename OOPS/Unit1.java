//CREATING CLASS AND OBJECT
/*package JPC;

public class Unit1 {
    static class Student{
        String name;
        int rollno;
        char sec;
        void setname(String newname){
            name = newname;
        }
        void setrollno(int newrollno){
            rollno = newrollno;
        }
        void setsec( char newsec){
            sec = newsec;
        }
    }
    static class Student2{
        int rollno;
        String result;
    
        void setrollno(int newrollno){
            rollno = newrollno;
        }
        void setresult( String newresult){
            result = newresult;
        }
    }
    public static void main(String args[]){
        Student s1 = new Student();
        Student2 s2 = new Student2();
        s1.setname("Aditya");
        s1.setrollno(258992329);
        s1.setsec('A');
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.sec);

        s2.setrollno(3424);
        s2.setresult("Pass");
        System.out.println(s2.rollno);
        System.out.println(s2.result);
    }
    
}
*/

// USING SCANNER
/*import java.util.Scanner;
public class Unit1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = sc.nextLine();
    
        System.out.print("Enter your Roll no :");
        int roll = sc.nextInt();
        System.out.println();

        System.out.println("Name is : " + name);
        System.out.println("Roll no is : " + roll);

    }
}
*/

//MY FIRST CONSTRUCTOR
/*import java.util.*;
class student {
    int roll;
    String name = "Rahul";
    student(){
        System.out.println("this is non-parametrised constructor");
    }
    student(String n,int r){ // In THIS ATUL 34 will be print

        roll=r;
        name=n;
    }

    student(String name,int roll){ // In THIS Rahul 0 will be print

        roll=roll;
        name=name;
    }
    
    student(String name,int roll){ // In THIS Atul 34 will be print

        this.roll=roll;
        this.name=name;
    }
    

    void display(){
        System.out.println("Student name : "+name+"roll no : "+roll);
    }
}
class Unit1{
    public static void main(String []a){
        student s1=new student();
        student s2=new student("atul",45);
        s2.display();

    }
}
*/

//ACCESS SPECIFIERS
/* --public
  --protected
  --default
  --private
*/

//INCAPSULATION
/*class student2{
    public String name = "Rahul";
    int roll = 24;
    private int marks = 90;

    public int getMarks() {
        return marks;
    }
    

    void setmarks(int newmarks){
        marks = newmarks;
    }
    void getmarks(){
        System.out.println("Marks is :" + marks);
    }
}
public class Unit1{
    public static void main(String args[]){
        student2 obj = new student2();
        System.out.println("Name is " + obj.name);
        System.out.println("Roll No is " + obj.roll);
        obj.setmarks(500);
        System.out.println("Marks is " + obj.marks);

    }
}
*/

//POLYMORPHISM
/*import java.util.*;
class addition{
    int sum1;
    int sum2;
    void add(int a , int b){
        sum1 = a+b;
        System.out.println("SUM OF A AND B : "+sum1);
    }
    void add(int a , int b,int c){
        sum2 = a+b+c;
        System.out.println("SUM OF A AND B AND C : "+sum2);
    }
    void add(){
        System.out.println("NOT ADDING ANYTHING");
    }

}
public class Unit1{
    public static void main(String args[]){
        addition a1 = new addition();
        a1.add();
        a1.add(4 , 5);
        a1.add(2 , 3 , 4);
    }
}
*/

//CREATE A PRO TO FIND AREA OF TRIANGLE , SQUARE , CIRCLE
/*import java.util.*;
class addition{
    int square;
    float triangle;
    double circle;
    
    void squarearea(int s ){
        square = s*s;
        System.out.println("Area of aquare : "+ square);
    }
    void trianglearea(int b , int h){
        triangle = 1/2 * b * h;
        System.out.println("Area of Triangle : "+ triangle);
    }
    void circlearea(double r){
        circle = (double)22/7 * r * r;
        System.out.println("Area of circle :" + circle);
    }

}
public class Unit1{
    public static void main(String args[]){
        addition a1 = new addition();
        a1.squarearea(5);
        a1.trianglearea(4 , 5);
        a1.circlearea(2.1);
    }
}
*/
//Inheritence
/*
import java.util.*;
public class Unit1{
    static class customer{
        String name;
        int phono;
        void show1(String name , int phono){
            System.out.println("Name is : " + name);
            System.out.println("Phone no is :" + phono);
        }
    }
    static class regularcus extends customer{
        void show2(){
            System.out.println("A regular customer");
        }
    }
    static class hobbies extends regularcus{
        void show3(){
            System.out.println("He is a nice player");
        }
    }
    public static void main(String  args[]){
        hobbies r1 = new hobbies();
        r1.show1("Aditya" , 63923626);
        r1.show2();
        r1.show3();
    }

}
*/
//WHT MULTIPLE INHERTENCE NOT EXISTING IN JAVA.....?


//POLYMORPHISM(METHOD OVER RIDDING)
/*import java.util.*;
public class Unit1{
    static class customer{
        String name;
        int phono;
        void show1(String name , int phono){
            System.out.println("Name is : " + name);
            System.out.println("Phone no is :" + phono);
        }
        void show2(){
            System.out.println("A customer from parent class");
        }
    }
    static class regularcus extends customer{
        void show2(){
            System.out.println("A regular customer");
        }
    }
    
    public static void main(String  args[]){
        regularcus r1 = new regularcus();
        r1.show1("Aditya" , 63923626);
        r1.show2();
    }

}
*/


//SUPER

/*import java.util.*;
public class Unit1{
    static class customer{
        String name;
        int phono;
        void show1(String name , int phono){
            System.out.println("Name is : " + name);
            System.out.println("Phone no is :" + phono);
        }
        void show2(){
            System.out.println("A customer from parent class");
        }
    }
    static class regularcus extends customer{
        super.show2();
        void show2(){
            System.out.println("A regular customer");
            
        }
    }
    
    public static void main(String  args[]){
        regularcus r1 = new regularcus();
        r1.show1("Aditya" , 63923626);
        r1.show2();
    }

}
*/

/*The static keyword means that a member belongs to the class, rather than to individual objects.
Use static when a value or method is common to the whole class.
a.Static Variable
A static variable belongs to the class rather than individual objects.
Only one copy is created and it is shared by all objects.
b.Static Method
A static method belongs to the class and can
be called using the class name without creating an object.
c.Static Block
A static block is used to initialize static variables or perform class-level initialization.
It executes automatically when the class is loaded.
d.Static Nested Class
A static nested class is a class declared inside another class using static. It does not require an object of the outer class to be created.Create a Java program to store student details.
The college name should be common to all students.
question:Create a method to display student details,
initialize the college name using a static block,
and use a static nested class to display a message.
 */
/*import java.util.*;
class Student4 {

    // 1. Static variable
    static String collegeName;
    String name;
    int rollNo;

    // 2. Static block: The static block executes when the class is loaded, before objects are created.
    static {
        collegeName = "KIET";
        System.out.println("College information loaded");
    }

    // Constructor
    Student4(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // 3. Static method
    static void displayCollege() {
        System.out.println("College: " + collegeName);
    }

    // Non-static method
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        //System.out.println("College: " + collegeName);
    }

    // 4. Static nested class
    static class CollegeInfo {
        static void message() {
            System.out.println("Welcome to KIET");
        }
    }
}

public class  Unit1{
    public static void main(String[] args) {

        Student4 s1 = new Student4("Rahul", 101);
        Student4 s2 = new Student4("Priya", 102);

        s1.displayStudent();
        s2.displayStudent();
        // Calling static method using class name
        Student4.displayCollege();
        // Calling static nested class
        Student4.CollegeInfo.message();
    }
}
*/

/*  DATA ABSTRACTION -- ABSTRACTION CAN BE ACAHIEVED IN TWO WAYS ---
1. ABSTRACT CLASSS(1 - 99%) -- PARTIAL ABSTRACTION -- NO OBJECT CREATION HAPPENS HERE
2. INTERFACE --- 100% -- COMPLETE ABSTRACTION-- INTERFACE IS NOT A CLASS ITS A STRUCTURE(SCKELETON) --
*/
//ABSTRACT CLASS CAN BE A MAIN METHOD ALSO AND THATS AN EXCEPTION
/*import java.util.*;
public class Unit1{
    static abstract class payment{
        abstract void pay();// THIS IS A ABSTRACT CLASS WHOSE NAME AND NAME IS KNOWN TO US BUT WE DONT KNOW WHAT WILL IT DO --- IT CAN BE WRITTEN MLATER OR ANYWHERE
        void message(){
            System.out.println("Successful Payment");

        }

    }

    static class unipay extends payment{
        void pay(){
            System.out.println("UPI Payment");
        }
    }

    static class creditpay extends payment{
        void pay(){
            System.out.println("Creadit Card Payment");
        }
    }
    public static void main(String args[]){
        unipay p1 = new unipay();
        creditpay p2 = new creditpay();
        p1.pay();
        p2.pay();
        p1.message();
    }
}
*/

//INTERFACE
/*import java.util.*;

interface payment2{
    void pay1();

    static void pay4(){
        System.out.println("Payment Successfull");
    }

}

class UPIpay1 implements payment2{
    public void pay1(){
        System.out.println("UPI Payment Sucessfull");
    }
}

class creditpay1 implements  payment2{
    public void pay1(){
        System.out.println("Credit Payment Sucessfull");
    }
}

public class Unit1{
    public static void main(String args[]){
        UPIpay1 p3 = new UPIpay1();
        creditpay1 p4 = new creditpay1();
        p3.pay1();
        p4.pay1();

        payment2.pay4();

    }
}
*/

//FINAL KEYWORD
/*import java.util.*;
public class Unit1{
    public static void main(String args[]){
        
    }
}
*/

//EXCEPTION HANDLING
/*import java.util.Scanner;
public class Unit1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter price: ");
            int price = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int total = price / quantity;

            System.out.println("Total: " + total);
        }
        catch (ArithmeticException e) {
            System.out.println("Quantity cannot be zero.");
            System.out.println(e);
        }
        finally {
            System.out.println("Shopping process completed.");
        }
    }
}
*/



//EXCEPTION HANDLING(MUTIPLE CATCH)
/*import java.util.*;
public class Unit1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String quantity = "124ac";
            int q = Integer.parseInt(quantity);

            int price = 1000;
            int average = price / q;

            System.out.println("Average price: " + average);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid quantity entered.");
            System.out.println(e);
        } 
        catch (ArithmeticException e) {
            System.out.println("Quantity cannot be zero.");
            System.out.println(e);

        }
        finally {
            System.out.println("Shopping process completed.");
        }
    }
}
*/

//THROW EXCEPTION
/*  throw is used to manually create and throw an exception.
-Used inside a method/block/constructor
-Used in method declaration
-Throws one exception at a time
Q.check voting eligibility. If the age is below 18, use throw to
generate an exception; otherwise, display that the person is eligible to vote.*/

/*public class Unit1 {
    public static void main(String [] a){
    int age=18;
    if (age< 18){
        throw new ArithmeticException("not valid age for voting ");
    }
    System.out.println("have right to vote");
    }
}
*/


//USER DEFINED EXCEPTION(checked)
/*import java.util.Scanner;

// 1. User-defined exception class
class InsufficientBalanceException extends Exception {

    // Constructor
    InsufficientBalanceException(String message) {
        super(message);
    }
}


// 2. Main class
public class Unit1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        try {

            // 3. Check condition
            if (amount > balance) {

                // 4. Throw our user-defined exception
                throw new InsufficientBalanceException(
                    "Insufficient balance! Your balance is ₹" + balance
                );
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + balance);

        }

        // 5. Catch the exception
        catch (InsufficientBalanceException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
*/
//USER DEFINED EXCEPTION(unchecked exception/ runtime exception)clear
/*import java.util.Scanner;

// 1. User-defined unchecked exception class
class InsufficientBalanceException extends RuntimeException {

    // Constructor
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// 2. Main class
public class Unit1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        try {

            // 3. Check condition
            if (amount > balance) {

                // 4. Throw our user-defined runtime exception
                throw new InsufficientBalanceException(
                    "Insufficient balance! Your balance is ₹" + balance
                );
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + balance);

        }

        // 5. Catch the exception
        catch (InsufficientBalanceException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
*/

//THREDING  AND MULTI-THREDING
/*import java.util.*;
class thread1 extends Thread{
    public void run(){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        for(int i = 1 ; i <= 3; i++){
            System.out.println("Thread1 running");
        }
        System.out.println("Exit Thread1");
    }
}

class thread2 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 3; i++){
            System.out.println("Thread2 running");
        }
        System.out.println("Exit Thread2");
    }
}
public class Unit2 {
    public static void main(String[] args){
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.start();
        t2.start();
    }   
}
*/


//PRIORITY THREAD
/*class PaymentThread extends Thread {

    public void run() {
        System.out.println("Processing Customer Payment...");
    }
}
class ReportThread extends Thread {

    public void run() {
        System.out.println("Generating Account Report...");
    }
}

public class Unit2 {
    public static void main(String[] args) {

        PaymentThread t1 = new PaymentThread();
        ReportThread t2 = new ReportThread();

        t1.setPriority(5);
        t2.setPriority(5);

        t1.getPriority();
        t2.getPriority();

        t1.setName("Payment Thread");
        t2.setName("Report Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start(); 
        t2.start();
    }
}
*/




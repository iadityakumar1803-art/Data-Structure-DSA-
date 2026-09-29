package PractiseQue1;
import java.util.*;
public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
 
        System.out.println(b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);
}}

//Scenario: Sunrise Public Library wants a simple digital system to manage its books. Every book has a title, author, price, and ISBN number.
// The library wants to keep every book's data private and safe from accidental modification, so it must be accessed only through defined methods.
// The library also wants to track the total number of books added to the system so far (shared across all Book objects), and it wants the library's name to be fixed and unchangeable throughout the program.
//        (a) Design a class Book with private data members: title (String), author (String), price (double), isbn (String). Provide public getter and setter methods for each field.  [4]
//        (b) Write a parameterized constructor that initializes title, author, price and isbn when a Book object is created.  [2]
//        (c) Add a static variable bookCount that increments by 1 every time a new Book object is created, and a final variable libraryName initialized to "Sunrise Public Library".  [2]
//        (d) Using the driver code below, complete the Book class so that the program compiles and produces the expected output.  [2]

package PractiseQue1;
//Scenario: Sunrise Public Library wants a simple digital system to manage its books. Every book has a title, author, price, and ISBN number.
// The library wants to keep every book's data private and safe from accidental modification, so it must be accessed only through defined methods.
// The library also wants to track the total number of books added to the system so far (shared across all Book objects), and it wants the library's name to be fixed and unchangeable throughout the program.
//        (a) Design a class Book with private data members: title (String), author (String), price (double), isbn (String). Provide public getter and setter methods for each field.  [4]
//        (b) Write a parameterized constructor that initializes title, author, price and isbn when a Book object is created.  [2]
//        (c) Add a static variable bookCount that increments by 1 every time a new Book object is created, and a final variable libraryName initialized to "Sunrise Public Library".  [2]
//        (d) Using the driver code below, complete the Book class so that the program compiles and produces the expected output.  [2]

import java.util.*;

public class Book {

    private String title;
    private String author;
    private double price;
    private String isbn;


    static int bookCount = 0;

    static final String libraryName = "Sunrise Public Library";

    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;

        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
/*Scenario: A university result system accepts marks for a student. Marks must be between 0 
and 100. 
(a) Create a class Student with name and marks. [2] 
(b) Create a method setMarks(int marks) that throws an exception when marks are less 
than 0 or greater than 100. [3] 
(c) Use try-catch to handle the invalid marks entered by the user. [2] 
(d) Use a finally block to display "Result processing completed." [3]
*/

package PractiseQue4;

import java.util.Scanner;

class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {

    String name;
    int marks;

    Student(String name) {
        this.name = name;
    }

    void setMarks(int marks) throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                "Invalid marks! Marks must be between 0 and 100."
            );
        }

        this.marks = marks;
        System.out.println("Marks accepted: " + marks);
    }
}

public class University{    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        Student student = new Student(name);

        try {

            student.setMarks(marks);

        }
        catch (InvalidMarksException e) {

            System.out.println("Exception: " + e.getMessage());

        }
        finally {

            System.out.println("Result processing completed.");
        }

        sc.close();
    }
}



package PractiseQue5;
/*Case Study 10: Set Operations — Challenging
A university has two sets:
•	Students enrolled in Java 
•	Students enrolled in Python 
Write methods to find:
1.	Students enrolled in both. 
2.	Students enrolled in either course. 
3.	Students enrolled only in Java. 
*/
import java.util.*;

public class Set_Operation {

    public static Set<Integer> commonStudents( Set<Integer> javaStudents, Set<Integer> pythonStudents) {
        Set<Integer> Intersection = new HashSet<>(javaStudents);
        Intersection.retainAll(pythonStudents);
        return Intersection;
    }

    public static Set<Integer> allStudents(Set<Integer> javaStudents,Set<Integer> pythonStudents) {
        Set<Integer> Union = new HashSet<>(javaStudents);
        Union.addAll(pythonStudents);
        return Union;
    }

    public static Set<Integer> onlyJava(Set<Integer> javaStudents,Set<Integer> pythonStudents) {
        Set<Integer> Difference = new HashSet<>(javaStudents);
        Difference.retainAll(pythonStudents);
        return Difference;
    }

    public static void main(String[] args) {

        Set<Integer> javaStudents =
                new HashSet<>(
                    Arrays.asList(101, 102, 103, 104));

        Set<Integer> pythonStudents =
                new HashSet<>(
                    Arrays.asList(103, 104, 105, 106));

        System.out.println("Both: "
                + commonStudents(javaStudents, pythonStudents));

        System.out.println("Either: "
                + allStudents(javaStudents, pythonStudents));

        System.out.println("Only Java: "
                + onlyJava(javaStudents, pythonStudents));
    }
}
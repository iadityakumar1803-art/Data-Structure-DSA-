package DSA;
/* //FUNCTION CALLING
public class Recursion {
    class Test{
        static void fun1(){
            System.out.println("BEFORE FUN2");
            fun2();
            System.out.println("AFTER FUN2");
        }
        static void fun2(){
            System.out.println("FUN2");
        }
    }
    public static void main(String agrs[]){
        System.out.println("BEFORE FUN1");
        Test.fun1();
        System.out.println("After Fun1");
    }
    
}*/

/*//DIRECT RECURSION
class Recursion{
    static void fun1(int n){
        if(n==0)
            return;
        System.out.println("GFG");
        fun1(n-1);
    }
    public static void main(String args[]){
        fun1(2);
    }
}
*/

/*//PRINT N TO 1 USING RECURSION
import java.util.*;
class Recursion{
    static void fun(int n){
        if(n==0)
            return;
        System.out.println(n);
        fun(n-1);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int N = sc.nextInt();
        fun(N);
    }

}
*/

//PRINT 1 TO N USING RECURSION
/*import java.util.*;
class Recursion{
    static void fun(int n){
        if(n==0)
            return;       
        fun(n-1);
        System.out.println(n);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int N = sc.nextInt();
        fun(N);
    }

}*/

//REVERSE A NUMBER USING RECURSION
/*import java.util.*;
class Recursion{
    static int reversepower(int n){
        int rev = 0;
        if(n ==0){
            return 0;
        }
        int b = n % 10;
        rev = rev *10 + b;
        reversepower(n/10);
        return rev ;
        


    }
    public static void main (String args[]){
        System.out.println(reversepower(402));
    }
}
    */

//SIR
/*public class Recursion {
    public static void main(String[] args) {
        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing characters
            for (int k = i; k >= 1; k--) {
                System.out.print((char)(96 + k));
            }

            // Print increasing characters
            for (int k = 2; k <= i; k++) {
                System.out.print((char)(96 + k));
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing characters
            for (int k = i; k >= 1; k--) {
                System.out.print((char)(96 + k));
            }

            // Print increasing characters
            for (int k = 2; k <= i; k++) {
                System.out.print((char)(96 + k));
            }

            System.out.println();
        }
    }
}*/


//REVERSE EXPONENTIAL
public class Recursion{
     static int reversepower(int n){
        int rev = 0;
        if(n ==0){
            return 0;
        }
        int b = n % 10;
        rev = rev *10 + b;
        reversepower(n/10);
        return rev ;
     }

    public static void main(String args[]){
        
        
    }
}


//sorting (bubble)






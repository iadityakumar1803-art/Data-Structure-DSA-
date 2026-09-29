package DSA;
//SUM OF a AND b TAKEN BY USER
/*import java.util.*;
public class JavaBasics{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);

    }

}
*/

//PPRODUCT OF a AND b TAKEN BY USER
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);

    }
}
*/

//AREA OF CIRCLE RADIUS TAKEN BY USER
/*import java.util.*;
public class JavaBasics{
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        float radius = sc.nextFloat();
        float Area = 3.14f * radius * radius ;
        System.out.println(Area);
    }
    
}
*/
//USING IF ELSE ADULT OR NOT ADULT
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("YOU ARE AN ADULT");
        }
        else{
            System.out.println("YOU ARE NOT AN ADULT");
        }
    }
}
    */


//PRINT LARGEST OF TWO NUMBER
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the fisrt Number =");
        int NUM1 = sc.nextInt();
        System.out.print("Enter the Second Number =");
        int NUM2 =sc.nextInt();
        if (NUM1 > NUM2){
            System.out.println("Largest Number is "+ NUM1);
        }
        if (NUM2 > NUM1){
            System.out.println("Largest Number is "+ NUM2);
        }
        else{
            System.out.print("Both Number are equal");
        }

    }

}
*/

//PRINT IF A NUMBER IS ODD OR EVEN 
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to be checked =");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given Nuber is Odd");
        }
    }
}
*/

//INCOME TAX CALCULATOR
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the salary In lakh = ");
        float income = sc.nextFloat();
        if (income <= 5){
            System.out.println("Your income tax is 0% .");
            System.out.println("Your Tax is  00 =");
            System.out.println("Your net salary is = "+ income);
        }
        else if (income > 5 && income <=10 ){
            System.out.println("Your income tax is 20%.");
            System.out.print("Your Tax is =");
            System.out.println((income *20/ 100));
            float Salary = income - (income *20/ 100);
            System.out.println("Your net salary is = "+ Salary);
        }
        else {
            System.out.println("Your Income Tax is 30%");
            System.out.print("Your Tax is =");
            System.out.println((income *30/100));
            float S = income -(income *30/100);
            System.out.println("Your Net Salary is = " + S);
            
        }
    }
}*/

// PRINT THE LARGEST OF THREE NUMBERS
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter 1 number A =");
        int A = sc.nextInt();
        System.out.print("Please Enter 2 number B =");
        int B = sc.nextInt();
        System.out.print("Please Enter 3 number C =");
        int C = sc.nextInt();
        int Largest;
        if ((A >=B) && (A>= C) ){
            Largest = A;
        }
        else if (B >= C){
            Largest = B;
        }
        else {
            Largest = C;
        }
        System.out.println("Largest Number is  = " + Largest); 
    }
}
*/


//STUDENT WILL PASS OR FAIL
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the marks of student = ");
        int Marks = sc.nextInt();
        String variable = (Marks>= 33)?"PASS":"FAIL";
        System.out.println(variable);

    }
}*/


//SWITCH
/*import java.util.*;
public class JavaBasics{
    public static void main( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the variable = ");
        int Variable = sc.nextInt();
        switch (Variable){
            case 1: System.out.println("I want Samosa");
            break;
            case 2: System.out.println("I want colddrink");
            break;
            case 3: System.out.println("I want MOMO");
            break;
            default:System.out.println ("I am not hungry");
               }

    }
}
*/

//CALCULATOR
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter the first digit a = ");
        int a = sc.nextInt();
        System.out.print("Please Enter the second Number b = ");
        int b = sc.nextInt();
        System.out.print("Please Enter the operation (eg +, -, *, /, %)");
        String Operation = sc.next();
        switch (Operation){
            case "+":
            int sum = a + b ;
            System.out.println("Sum of given Number is :" + sum);
            break;
            case "-":
            int difference  = a - b;
            System.out.println("Difference of the number is : " + difference);
            break;
            case "*":
            int multiply  = a * b;
            System.out.println("Multiply of the number is : " + multiply);
            break;
            case "/":
            float divide = a / b;
            System.out.println("Division of the number is : " + divide);
            break;
            case "%":
            int remainder  = a % b;
            System.out.println("Remainder of the number is : " + remainder);
            break;
            default:
            System.out.println("You are entering the wrong operation. Try something New .");

        }

    }
}
    */

//WHILE LOOP TRAIL
/*import java.util.*;
public class JavaBasics{
    public static void main (String args[]){
        int i = 0;
        while (i <10){
            System.out.println("Hello Aditya .How are you?");
            i++;
        }
    }
}*/

//PRINT NUMBER FROM 1 TO 10
/*import java.util.*;
public class JavaBasics{
    public static void main ( String args[]){
        int i = 0;
        while ( i <10){
            ++i;
            System.out.println(i);
        }
    }
}*/

//TABLE CALCULATOR
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of table you want : ");
        int n = sc.nextInt();
        int i = 0;
        while (i <10){
            ++i;
            System.out.println( n * i);
        }
    }
}
*/

//PRINT NUMBER FROM 1 TO N
/*import java.util.*;
public class JavaBasics{
    public static void main( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter till where you want to print the number : ");
        int n = sc.nextInt();
        int i = 0;
        while (i < n){
            ++i;
            System.out.print(" , " +i);
        }
    }
}
*/

//SUM OF FIRST N NATURAL NUMBER
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter the Range(n) : ");
        int n = sc.nextInt();
        int a = 1;
        int total = 0;
        while (a <= n){
            total = total + a;
            a++;
        }
        System.out.println("Sum of first given natural number is : " + total);
    }
}
*/

//PRINT A SQUARE USING STARS (FOR LOOP)
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of Square = ");
        int n = sc.nextInt();
        String a = "* ";
        for ( int i = 1; i <=n ; i++){
            for( int g = 1; g <= n ; g++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
    */

//PRINT REVERSE OF A NUMBER
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number you want to reverse = ");
        int n = sc.nextInt();
        while (n > 0){
            int Lastdigit = n % 10;
            n = n/10;
            System.out.print(Lastdigit);
        }
    }
}*/

//REVERSE THE GIVEN NUMBER
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse = ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0){
            int lastdigit = n%10;
            n = n/10;
            reverse = (reverse *10) + lastdigit;
        }
        System.out.print("Your reverse number is = ");
        System.out.println(reverse);  
    }
}
*/
//KEEP ENTERING NUMBERS TILL USERS ENTERS MULTIP-LE OF 10
/*import java.util.*;
 public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter The number = ");
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while (true);
    }
 }
    */

//DISPLAY ALL THE NUMBERS ENTERED BY THE USER EXCEPT MULTIPLE OF 10
/*import java.util.*;
public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        do{
            System.out.print("Enter The number = ");
            int n = sc.nextInt();
            if( n % 10 == 0){
                continue;
            }
            System.out.println(n);
        } while( true);
    }

}*/

//CHECK IF A NUMBER IS PRIME OR NOT
/*import java.util.*;
public class JavaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to be checked = ");
        int n = sc.nextInt();
        if ( n  == 2){
            System.out.println("Given Number is a PRIME NUMBER ");
        }
        else{
             for ( int i = 2 ; i<= n-1; i++ ){
            if(n % i == 0){
                System.out.println("Given Number is a COMPOSITE NUMBER");
                break;
            }
            else{
                System.out.println("Given Number is a PRIME NUMBER");
                break;
            }
        }
    }
}

        }
*/

//PRINT STAR PATTERN IN TRIANGLR
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter the base of the triangle : ");
        int n = sc.nextInt();
        String a =" * ";
        for(int i = 1; i<=n ; i++){
            for(int k =1 ; k<=i ;k++){
                System.out.print(a);
            }
            System.out.println();
        }
            
        }

    }
*/

//INVERTED STAR PATTERN
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the no of base pattern of triangle : ");
        int n =sc.nextInt();
        for(int i = 1 ; i<=n ; i++ ){
            for(int k = 1 ;k<=(n-i+1) ; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}*/

//PRINT HALF PYRAMID PATTERN
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Base last digit of half Pyramid = ");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int k = 1 ; k<=i ; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}*/

//PRINT CHARATER PATTERN
/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char i = 'A';
        System.out.print("Please enter the base length of charater = ");
        int n = sc.nextInt();
        for(int a = 1; a <= n ; a++ ){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(i);
                i++;
            }
            System.out.println();
        }   
    }
}*/

/*// FUNCTION/METHOD
import java.util.*;
public class JavaBasics{
    public static void Aditya(){
        System.out.println("Hello Aditya ");

    }
    public static void calculatesum(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is : " + sum);
    }
    public static void sum( int num1 , int num2){
        int sum = num1 + num2 ;
        System.out.println("Sum is :  " +sum);
        return;
    }
    public static void swap(int A , int B){
        int temp = A;
        A = B;
        B = temp;
        System.out.println("New A is : " + A);
        System.out.println("New B is : " + B);
    }
    public static void product(int a , int b){
        int product = a * b ;
        System.out.println("Product of the number is : " + product);
        return;
    }
    public static int factorial(int a){
        int b = 1;
        for(int i = 1 ; i<= a; i++ ){
            b = b * i;   
        }
        return b;
    }
    public static void binomialcoefficient(int n , int r){ //WITHOUT ANY HEPLER FUNCTION
        int b = 1;
        for(int i = 1 ; i<= n; i++ ){
            b = b * i;   //n!
        }
        int c = 1;
        for(int i = 1 ; i<= r; i++ ){
            c = c * i;   //r!
        }
        int d = 1;
        for(int i = 1 ; i<= (n-r); i++ ){
            d = d * i;   //(n-r)!
        }
        int bc= b/(c*d);
        System.out.println("Binomial coefficient is : " + bc);
    }
    public static void binocoffe(int n , int r){  //WITH THE HELPER FUCTION ALREAADY GENERATED
    int n_fact = factorial(n);
    int r_fact = factorial(r);
    int nmr_fact = factorial(n-r);
    int binocoffe = n_fact/ (r_fact * nmr_fact);
    System.out.println("Binomial coefficient is : " +binocoffe);
    }

    //FUNCTION OVERLOADING USING PARAMETERS
    public static int add(int a ,int b){
        int sum = a+b;
        System.out.print("Your sum is :");
        System.out.println(sum);
        return sum;
    }
    public static int add(int a , int b , int c){
        int sum = a+b+c;
        System.out.print("Your sum is :");
        System.out.println(sum);
        return sum;
    }

    //FUNCTION OVERLOADING USING DATA TYPES
    public static int addition(int a , int b){
        return a+b;
    }
    public static float addition(float a , float b){
        return a+b;
    }

    //CHECK NUMBER IS PRIME OR NOT(n>=2)
    public static boolean isPrime( int n ){
        if(n == 2 ){
            return true;
        }
        for(int i = 2 ; i <= n-1 ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    } 
    //CONVERT BINERY TO DECIMAL
    public static void bintodec(int binnarynum){
        int pow = 0;
        int dec = 0;
        while(binnarynum > 0){
            int LD = binnarynum%10;
            dec =( dec+ LD*(int)(Math.pow(2,pow)));
            pow++;
            binnarynum = binnarynum/10;
        }
        System.out.print("Decimal form of your binary number is :" );
        System.out.println(dec);

    }

    //CONVERT FROM DECIMAL TO BINARY
        public static void dectobin(int decnum){
            int pow = 0;
            int bin = 0;
            while(decnum>0){
                int rem = decnum%2;
                bin = bin + (rem  * (int)Math.pow(10, pow));
                pow++;
                decnum = decnum/2;
            }
            System.out.print("Your chaanged binnary number will be : ");
            System.out.println(bin);
        }


    public static void main(String args[]){
        Aditya();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
    }
}*/



 





       

 
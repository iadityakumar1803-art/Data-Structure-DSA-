package DSA;
//CREATE , INSERT , UPDATE ARRAY
/*import java.util.*;
public class ArrayCC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Marks [] = new int[50];  //creating Array
        
        //Input in array
        System.out.print("First entry :");
        Marks[0]= sc.nextInt();
        System.out.print("Second entry :");
        Marks[1]= sc.nextInt();
        System.out.print("Third entry :");
        Marks[2]= sc.nextInt();

        //output in array
        System.out.println("Second entry is :" + Marks[1]);
        System.out.println("Third entry is :" + Marks[2]);
        
        //Update in Array
        Marks[2] = Marks[2]+ 5;
        Marks[1] = 96;
        System.out.println("Updated second entry :" + Marks[2]);
        System.out.println("Updated First entry :" + Marks[1]);
    }
}
*/

//PASSING ARRAYS AS ARGUMENTS
/*import java.util.*;
public class ArrayCC{
    public static void update(int rating[]){
        for( int i = 0 ; i<rating.length ; i++){
            rating[i]= rating[i]+1;
        }
    }
    public static void main(String args[]){
        int rating[]= { 9, 8, 7};
        update(rating);

        for( int i = 0 ; i< rating.length ; i++){
            System.out.print( "  " +rating[i]);
        }
    }
}
*/

//LINEAR SEARCH
/*import java.util.*;
public class ArrayCC{
    public static int linearsearch(int number[] , int key){
        for( int i=0 ; i<number.length; i++){
            if(number[i] == key ){
                return i;
            }
        }
        return -1;   
    } 
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int number[]= { 2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 , 20};
        System.out.print("Please enter the key :");
        int key = sc.nextInt();
        int a = linearsearch( number , key);
        if ( a == -1){
            System.out.println("Key is not found !!!");
        } 
        else{
            System.out.println("Your key's Index is : " + a);
        }         
    }
}
    */

//LARGEST NUMBER IN ARRAY
/*import java.util.*;
public class ArrayCC{
    public static int largest( int number[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i < number.length ; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;    
    }
    public static void main(String args[]){
        int number[] = {23 , 45 , 87 , 63 , 88 , 67 , 33 , 42 , 98 };
        int a = largest(number);
        System.out.println("Largest number in array is : " + a);

    }
}
    */

//BINARY SEARCH
/*import java.util.*;
public class ArrayCC{
    public static void binarysearch(int number[] , int key){
        int start = 0 ;
        int end = (number.length ) - 1 ;
        while (start <= end){
            int mid = (start + end)/2;
            if( number[mid] == key ){
                System.out.print("Key FOUND : " + mid);
                return;
            }
            else if(number[mid] > key){
                end = mid - 1 ;
            }
            else {
                start = mid+1;
            }
        }
        System.out.println("Key is NOT FOUND !!! ");
            
    }
    public static void main(String args[]){
        int number[] = { 2 , 4 , 6 , 8  , 10 , 12 , 14 , 16 , 18 , 20 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter th key : ");
        int key = sc.nextInt();
        binarysearch(number , key);
    }
}
*/

//REVERSE AN ARRAY
/*import java.util.*;
public class ArrayCC{
    public static void reverse(int number[]){
        int start = 0 ; 
        int end = (number.length) - 1;
        while (start < end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start = start + 1;
            end = end - 1;
        }
    }
    public static void main( String args[]){
        int number[] = { 2 , 4 , 6 , 7 , 8 , 10 , 12 };
        reverse(number);
        System.out.print("Reversed Array Will be : ");
        for(int i = 0 ; i < number.length ; i++ ){
            System.out.print( " "+number[i]);
        }
    }
}
*/

//PAIRS IN ARRAY
/*public class ArrayCC{
    public static void pairs(int number[]){
        int tp =0;
        System.out.println("Pairs of Array is : ");
        for(int i = 0 ; i < number.length ; i++){
            for ( int a = i+1;  a< number.length ; a++){
                System.out.print(" ( "+number[i]+"," +number[a]+" ) ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs : "+ tp);
    } 
    public static void main(String args[]){
        int number[ ] = { 2 , 4 , 6 , 8 , 10};
        pairs(number);
    }
}
*/

//PRINT SUBARRAYS
/*import java.util.*;
public class ArrayCC{
    public static void subarray(int number[]){
        for(int i = 0 ; i<number.length; i++){
            for(int j = i ; j<number.length ; j++ ){
                System.out.print("[");
                for(int k = i ; k<= j ; k++){
                    System.out.print(" "+number[k] +" ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }

    public static void main (String args[]){
        int number[] = { 2 , 4 , 6 , 8 , 10};
        subarray(number);
    }

}*/

// SUBARRAYSUM & SUM & MAX SUM & MIN SUM
/*import java.util.*;
public class ArrayCC{
    public static void subarray(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<number.length; i++){
            for(int j = i ; j<number.length ; j++ ){
                int b = 0;
                System.out.print("[");
                for(int k = i ; k<= j ; k++){
                    int a = number[k];
                    System.out.print(" "+number[k] +" ");
                    b = b + a;
                    if (largest<b){
                        largest = b;
                    } 
                    if (smallest > b){
                        smallest = b;
                    }                
                }
                System.out.print("]  ");
                System.out.print("SUM : " + b);
                System.out.println();
            }
        }
        System.out.println("Maximum Sum of Subarray is : " + largest);
        System.out.println("Least Sum of Subarray is : " +smallest);
    }

    public static void main (String args[]){
        int number[] = { 2 , 4 , 6 , 8 , 10};
        subarray(number);
    }
}*/

//TRAPPING RAIN WATER
/*import java.util.*;
public class ArrayCC{
    public static void trappingrainwater(int height[]){
        int leftmax [] = new int [height.length];
        leftmax[0] = height[0];
        for(int i = 1 ; i < height.length ; i++){
            leftmax[i] = Math.max(height[i] , leftmax[ i -1]);
        }
        int
    }
    public static void main(String args[]){
        int height[] = { 4 , 2 , 0 , 6 , 3 , 2 , 5};
    }
}
    */

//LEETCODE QUESTION 1920
/*import java.util.*;
public class ArrayCC{
    public static  void sum(int nums[]){
        int runningsum[] = new int[nums.length];
        int a = 1;
        for(int i = 0 ; i < a ; i++){
            int sum = 0;
            int b = nums[i];
            sum = sum+ b;
            if (a< nums.length){
                a++;
            }
            System.out.println(sum);
                runningsum[i]= sum;
        }
        for (int k = 0 ; k<nums.length ; k++){
            System.out.print(runningsum[k]);            
        }
    }
    public static void main (String args[]){
        int nums[] = {1,2,3,4};
        sum(nums);
    }
}
*/

//BUBBLE SORT
/*import java.util.*;
public class ArrayCC{
    public static void bubblesort(int bubble[]){
        for(int term = 0 ; term< (bubble.length) - 1 ; term++){
            for(int j = 0 ; j < (bubble.length) - 1 - term ; j++){
                if(bubble[j] > bubble[j+1]){
                    int tem = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = tem;                }   
            }
        }
        System.out.print("Sorted Array will be : { ");
        for(int i = 0 ; i<bubble.length ; i++){
            System.out.print(bubble[i] + ",");
        }
        System.out.println(" }");

    }
    public static void main (String args[]){
        int bubble[] = {5 , 4 , 1 , 3 , 2};
        bubblesort(bubble);
    }
}
    */

//SELECTION SORT
/*import java.util.*;
public class ArrayCC{
    public static void selectionsort(int selection[]){
        for(int  i = 0 ; i < selection.length - 1 ; i++){
            int min = i;
            for (int j = i+1 ; j< selection.length  ; j++){
                if(selection[min] > selection[j]){
                    min = j;
                }
            }
            int temp = selection[min];
            selection[min] = selection[i];
            selection[i] = temp;
        }
    }    
    public static void printarray(int selection[]){
        for (int i = 0 ; i< selection.length ; i++){
            System.out.print(selection[i]);
        }
    }
    
    public static void main(String args[]){
        int selection[] = { 5 , 4 , 1 , 3 , 2 };
        selectionsort(selection);
        printarray(selection);
    }
}*/

//INSERTION SORT
/*import java.util.*;
public class ArrayCC{
    public static void insertion(int insert[]){
        int n = insert.length;
        for(int i = 1 ; i < n ; i++ ){
            int curr = i;
            int prev = i-1;
            int temp = insert[i];
            while(prev <= 0 && insert[prev] > insert[curr]){
                insert[prev + 1] = insert[prev];
                prev--;
            }
            insert[prev] = insert[temp];
        }
    }
    public static void printarray(int insert[]){
        for (int i = 0 ; i< insert.length - 1 ; i++){
            System.out.print(insert[i]);
            }
        
        }


    public static void main(String args[]){
        int insert[] = { 5 , 4 , 1 , 3 , 2 };
        insertion(insert);
        printarray(insert);
    }

}*/


/*import java.util.*;
public class ArrayCC{
    public static boolean search(int matrix[][] , int key){
        for(int i = 0 ; i< matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key is fount at cell . (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is NOT FOUND!!");
        return false;
    }
    public static void largest(int matrix[][]){
        int large = Integer.MIN_VALUE;
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j<matrix[0].length ; j++){
                if (matrix[i][j] > large){
                    large = matrix[i][j];
                }
            }
        }
        System.out.println("Largest cell value in given matrix is : " + large );
    }
    public static void smallest(int matrix[][]){
        int small = Integer.MAX_VALUE;
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j<matrix[0].length ; j++){
                if (matrix[i][j] < small){
                    small = matrix[i][j];
                }
            }
        }
        System.out.println("Largest cell value in given matrix is : " + small);
    }

    public static void main(String args[]){
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< n ; i++ ){
            for (int j = 0 ; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        search(matrix , 5);
        largest(matrix);
        smallest(matrix);

    }

}
*/

//SPIRAL MATRIX
/*import java.util.*;
public class ArrayCC{
    public static void spiralprint(int matrix[][]){
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0 ;
        int endcol = matrix[0].length - 1;
        while(startrow <= endrow && startcol <= endcol){
            //top
            for (int j = startcol ; j<=endcol ; j++){
                System.out.print(" " + matrix[startrow][j]);
            }
            //right 
            for(int i = startrow + 1 ; i <= endrow ; i++ ){
                System.out.print(" " +matrix[i][endcol]);
            }
            //bottom
            for (int j = endcol - 1 ; j>= startcol ; j--){
                if(startrow == endrow){
                    continue;
                }
                System.out.print(" " +matrix[endrow][j]);
            }
            //left
            for (int i = endrow -1 ; i>= startrow + 1 ; i--){
                if(startcol == endcol){
                    continue;
                }
                System.out.print(" " + matrix[i][startcol]);
            }
            //update condition
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1 , 2 , 3 , 4},
                          {5 , 6 , 7 , 8},
                          {9 , 10 , 11 , 12},
                          {13 , 14 , 15 , 16}};

        spiralprint(matrix);
    }
}*/

//PALINDROME
  /*import java.util.*;
public class ArrayCC{
    public static boolean plaindrome(String word){
        int n = word.length();
        for (int i = 0 ; i <= word.length() / 2 ; i++){
            if(word.charAt(i) != word.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String word = "racecar";
        if(plaindrome(word)){
                System.out.println("a palindrome");

        }else{
                System.out.println("NOT a palindrome");

        };


    }
}*/

//SHORTEST PATH
/*import java.util.*;
public class ArrayCC{
    public static double shortestpath(String path){
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double f = 0;
        for (int i = 0 ; i < path.length(); i++){
            char ch = path.charAt(i);
            if( ch == 'N'){
                y2++;
            }
            else if(ch == 'S'){
                y2--;
            }
            else if( ch == 'E'){
                x2++;
            }
            else if( ch =='W'){
                x2--;
            }
            int a = x2 - x1;
            int b = y2 -y1;
            int c = a*a;
            int d = b*b;
            int e = c+d;
            f = Math.sqrt(e);    
        }
        return f;    
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(shortestpath(path));
    }
}
*/

//SUBSTRING
/*public class ArrayCC{
    public static void substring(String str , int si , int ei){
        for (int i = si ; i<ei ; i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main (String arags[]){
        String str = "AdityaGupta";
        int si = 0;
        int ei = 6;
        substring(str , si ,ei);
    }
}*/

// SUBSTRING USING JAVA ALREADY GIVEN FUNCTION
/*public class ArrayCC{

    public static void main (String arags[]){
        String str = "AdityaGupta";
        System.out.print(str.substring(0,6 ));
    }
}
    */

//LARGEST STRING
/*public class ArrayCC{
    public static void main(String args[]){
        String fruit[] = { "mango" , "orange" , "apple"};
        String largest = fruit[0];
        for (int i = 1 ; i< fruit.length; i++){
            if(largest.compareTo(fruit[i])< 0){
                largest = fruit[i];
            }
        }
        System.out.print(largest);
    }
}*/

//FIRST LETTER TO UPPERCASE
/*import java.util.*;
public class ArrayCC{
    public static void uppercase(String sb){
        StringBuilder us = new StringBuilder("");
        for(int i = 0 ; i<sb.length() ; i++){
            
            if(sb.charAt(i) == ' '){
                char ch2 = sb.charAt(i+1);
                char ch1 = Character.toUpperCase(ch2);
                us.append(' ');
                us.append(ch1);
                i++;    
            }
            else if(i == 0){
                char ch = Character.toUpperCase(sb.charAt(i));
                us.append(ch);
            }
            else{
                char ch1 = sb.charAt(i);
                us.append(ch1);
            }
        }
        for(int i = 0 ; i<us.length() ; i++){
            System.out.print(us.charAt(i));
        }
    }
    public static void main(String args[]){
        String sb = "hello WORLD.";
        uppercase(sb);
    }
}*/

//STRING COMPRESSION
/*import java.util.*;
public class ArrayCC{
    public static void compression(String sb ){
        StringBuilder ub = new StringBuilder("");
        for(int i = 0 ; i<sb.length() ; i++){
            char ch1 = sb.charAt(i);
            int count = 1;
        while( i< sb.length() - 1 && ch1 == sb.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                ub.append(ch1);
                ub.append(count);
            }
            else{
                ub.append(ch1);
            }
        }
        for (int i = 0 ; i<ub.length() ; i++){
            System.out.print(ub.charAt(i));
        }
    }
    public static void main(String args[]){
        String sb ="aaabbbccdddee";
        compression(sb);
    }

}
*/

//CHECK IF NUMBER IS ODD OR EVEN
/*public class ArrayCC{
    public static void oddoreven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            System.out.println("EVEN NUMBER ....");
        }
        else{
            System.out.println("ODD NUMBER ....");
        }
    }
    public static void main (String args[]){
        oddoreven(4);
        oddoreven(7);
        oddoreven(10);
        oddoreven(15);
    }
}
*/

//GET ITH BIT
/*public class ArrayCC{
    public static void getibit(int n , int i){
        int bitmask = (1<<i);
        if((n & bitmask) == 0){
            System.out.println("i^th bit will be 0");
        }
        else{
            System.out.println("i^th bit will be 1");
        }

    }
    public static void main(String args[]){
        getibit(10 , 2);

    }
}
*/

//UPDATE ITH BIT
/*public class ArrayCC{
    public static void updatebit(int n , int i , int u){
        if (u ==0){
            int bitMask= ~(1<<i);
            System.out.println(n & bitMask);
        }
        else if (u ==1){
            int bitMask = (1<<i);
            System.out.println(n | bitMask);
        }
    }
    public static void main(String args[]){
        int n = 8;
        int i = 2;
        int u = 1;
        updatebit(n , i , u);
    }
}
*/

//CLEAR LAST ITH BIT
/*public class ArrayCC{
    public static void clearbits(int n , int i ){
        int k = 0;
        for(int a = i ; a>=0 ; a--){
            int bitMask = ~(1<<a);
            n =n & bitMask;
        }
        System.out.println(n);
    }
    public static void main(String args[]){
        int n = 7;
        int i = 1;
        clearbits(n , i);
    }
}
*/
import java.util.*;
public class ArrayCC{
    public static void main(String args[]){
        System.out.print("Hello");

    }
}























































































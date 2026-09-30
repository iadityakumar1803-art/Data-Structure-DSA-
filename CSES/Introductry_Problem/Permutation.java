import java.util.*;
public class Permutation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        if(n < 4){
            System.out.println("NO SOLUTION");
        }
        else{

            for(int i =2  ; i <= n ; i = i+2){
                System.out.print(i +" ");
            }

            for(int i = 1 ; i <= n; i= i+2){
                System.out.print(i+ " ");
            }
        }
    }
}

//MISSING NUMBER FROM 1 TO N
import java.util.*;
public class Missing_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n-1];

        for(int i = 0; i < n-1 ; i++){
            arr[i] = sc.nextInt();
        }

        int ans = n;
        for(int i = 1 ; i < n; i++){
            ans = ans ^ i ^ arr[i-1];
        }

        System.out.println(ans);
    }
}

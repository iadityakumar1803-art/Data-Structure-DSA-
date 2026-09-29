
import java.util.*;

public class Increasing_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        long step = 0;
        long max = arr[0];

        for(int i = 1 ; i < n ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(arr[i] < max){
                step = step + (long)(max - arr[i]);
            }
        }

        System.out.println(step);
    }
    
}

//SELECTION SORT -- TC = O(N2) -- SC = O(1)
import java.util.*;
public class Sorting_technique {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            int minIdx = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        for(int k = 0 ; k < n ; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}

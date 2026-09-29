/*//*TWO SUM
import java.util.*;
public class ArrayMedium{
    //BRUTE FORCE --> o(n^2)
    public static int[] TwoSum1(int arr[] , int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    int res[] = {i , j};
                    return res;
                }
            }
        }
        int res[] = {-1 , -1};
        return res;
    }

    //BETTER APPROACH --> o(n)  but takes space complexity o(n);
    public static int[] TwoSum2(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int k = target - arr[i];
            if(map.containsKey(k)){
                return new int[]{map.get(k) , i };

            }
            else{
                map.put(arr[i] , i);
            }
        }
        return new int[]{-1, -1};
    }

    //OPTIMAL APPROACH --> o(nlogn) but takes space complexity o(1) and it works only we dont have to give indices and just tell weather it exist or not ;
    public static boolean TwoSum3(int arr[] , int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int k = arr[start] + arr[end];
            if(k == target){
                return true;
            }
            else if( k < target){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(TwoSum3(arr, target));

    }
}
*/

/*//*SORT AN ARRAY OF  0's 1's and 2's
import java.util.*;
public class ArrayMedium{

    //BRUTE FORCE --( We will any sorting alogrithm.)
    public static void sort1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //BETTER APPROACH(Counting number of 0 , 1 , 2 and manually writing it to array)
    public static void sort2(int[] arr){
        int zero = 0 ;
        int one = 0;
        int two = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] == 1){
                one++;
            }
            else{
                two++;
            }
        }
        int index = 0;
        for(int i = 0 ; i < zero ; i++){
            arr[index++] = 0;
        }
        for(int i = 0 ; i < one ; i++){
            arr[index++] = 1;
        }
        for(int i = 0 ; i < two ; i++){
            arr[index++] = 2;
        }
    }

    //OPTIMAL APPROACH(Using Dutch National Flag Algorithm)
    public static void sort3(int[] arr){
        int low = 0; 
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        sort3(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
*/


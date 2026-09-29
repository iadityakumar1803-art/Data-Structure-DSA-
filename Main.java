/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            boolean found = false;

            for (long a = 0; a <= Math.min(n, 22); a++) {
                String s = String.valueOf(a);

                if (new StringBuilder(s).reverse().toString().equals(s)
                        && (n - a) % 12 == 0) {

                    System.out.println(a + " " + (n - a));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}*/

/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int arr[] = new int[a];
            
            
            for(int i = 0; i < a ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(a==2){
                System.out.println(arr[1] + " " +arr[0]);
                
            }
            else{
                int flag = 0;
                for(int i = a-1 ; i >= 2; i--){
                    int b = arr[i] % arr[i-1];
                    if(b != arr[i-2]){
                        System.out.println(-1);
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.println(arr[arr.length-1] + " " +arr[arr.length-2]); 
                }
            }
        }
    }
}
*/

/*import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;


    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static void solve() {
        
    }

    public static void main(String[] args) {
        int t = 1;
        // t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }
    }
}*/

/*mport java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int arr[] = new int[4];
            for(int i = 0 ; i < 4 ; i++){
                arr[i] = sc.nextInt();
            }
            int time1 = Integer.MIN_VALUE;
            int time2 = Integer.MIN_VALUE;
            
            int n = arr[0];
            int x = arr[1];
            int y = arr[2];
            int z = arr[3];
            
            //without AI
            if(n % (x+y) == 0){
                time1 = n / (x+y);
            }
            else{
                time1 = ( n/ (x+y) )+1;
            }

            if(time1 > z){
                int e = y * 10;
                int f = n -(x*z);
                int g = z;
                if(f % (x+e) == 0){
                    time2 = f /(x+e);
                }
                else{
                    time2 = f /(x+e) +1;
                }
                time2 = time2+g;
                int ftime = Math.min(time1 , time2);
                System.out.println(time2);
            }
            else{
                System.out.println(time1);
            }
        }
    }
}
*/


/*import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n ;i++){
                arr[i] = sc.nextInt();
            }

            int[] copy = arr.clone();
            Arrays.sort(arr);
            int count = 0;
            int j = 0;
            for(int i = n-1 ; i > 0 ; i--){
                if(arr[i] != copy[j]){
                    count++;
                }
                j++;
            }

            if(count >= 2){
                System.out.println("NO");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
    */

/*import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    

    public static void main(String[] args) {
        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i = 0 ; i < n ; i++){
                max = Math.max(max , arr[i]);
                min = Math.min(min, arr[i]);

            }
            System.out.println(max - min + 1);

            
        }
    }
}*/


/*import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            for(int i = 0 ; i < n ; i++){
                int one = 0;
                for(int k = i ; )
                if(s.charAt(i) == '1'){
                    set.add(i+1);
                }
            }

            if(l % 2 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
*/

/*import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0 ; i < n ; i++){
                for(int j = i+1 ; j < n ; j++){
                    if(arr[i] < arr[j]){
                        arr[j] = arr[i];
                    }
                }
            }

            int sum = 0 ;
            for(int i = 0 ; i< n ; i++){
                sum = sum +arr[i];
            }

            System.out.println(sum);
        
        }
    }
}
*/

/*import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextLong();
            }

            for(int i = 0 ; i < n-1; i++){
                if(arr[i] > arr[i+1]){
                    arr[i+1] = arr[i+1] +arr[i];
                }
            }

            System.out.println(arr[n-1]);


        }
    }
}
*/

/*import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 1000000007L;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long reverse(long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean palindrome(long n) {
        return n == reverse(n);
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long power(long a, long b) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(long n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    

    public static void main(String[] args) {
        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            
            int count = n ;
            boolean flag = true;
            while(flag){
                String str1 = "";
                int a = 0;
                for(int i = 0 ; i < str.length()-1 ; i++){
                    a = 0;
                    
                    if (str.charAt(i) == '0' && str.charAt(i + 1) == '0') {
                        str1 = str1+'1';
                        //str1 = str.substring(0, i) + '1' + str.substring(i + 2);
                        count++;
                        a++;
                        i++;
                    }
                    else if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
                        str1 = str1 +'0';
                        //str1 = str.substring(0, i) + '0' + str.substring(i + 2);
                        count++;
                        a++;
                         i++;
                    }
                    else{
                        str1 = str1 + str.charAt(i);
                    }
                    
                }
                count=count+str1.length();
                str = str1;
                if(a == 0){
                    flag = false;
                }

            }
            if(str.length() != n  ){
                count = count + str.length();
            }

            System.out.println(count);
            
            
        }
    }
}
*/

//MERGE SORT
/*import java.util.*;
public class Main{
    static int recurssivecall = 0;
    static int comparisions = 0;

    static void merge(int arr[] , int low , int high){
        recurssivecall++;
        if(low >= high){
            return;
        }

        int mid = low + (high - low) /2;

        merge(arr, low , mid);
        merge(arr , mid+1 , high);

        mergesort(arr , low , mid , high);
    }

    static void mergesort(int arr[] , int low , int mid , int high){
        int temp[] = new int[high - low +1];

        int i = low;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= high){
            comparisions++;
            if(arr[i] > arr[j]){
                temp[k] = arr[j];
                j++;
            }
            else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= high){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int x = 0 ; x < temp.length ; x++){
            arr[low + x] = temp[x];
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        merge(arr , 0 , n-1);
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(" R " +recurssivecall);
        System.out.println("C" + comparisions);
    }
}
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        String[] words = {
            "Apple", "Tiger", "Java", "Cloud",
            "River", "Computer", "Moon", "Code",
            "Laptop", "Python"
        };

        Random random = new Random();

        while (true) {
            // Generate random word
            String word = words[random.nextInt(words.length)];

            System.out.print(word);

            // Wait 1 second
            Thread.sleep(1000);

            // Delete the word
            for (int i = 0; i < word.length(); i++) {
                System.out.print("\b \b");
            }

            // Wait 1 second
            Thread.sleep(1000);
        }
    }
}

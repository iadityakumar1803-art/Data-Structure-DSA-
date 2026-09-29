package DSA;
//FIBONACCI SERIES ( 4 approach)
// 1 -- RECURSIVE APPROACH
/*import java.util.*;
public class Dp{
    static int recursivefib(int n ){
        if(n <= 1){
            return n;
        }
        return recursivefib(n-1) + recursivefib(n-2);
    }
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(recursivefib(n));
    }
}
*/

//2 -- MEMOIZATION APPROACH

/*import java.util.*;
public class Dp{
    static int dp[];
    public static int memoisationdp(int n ){
        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = memoisationdp(n-1) + memoisationdp(n -2) ;
        return dp[n];

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp = new int[n+1];
        Arrays.fill(dp , -1);

        System.out.println(memoisationdp(n));
    }
}
*/

// 3--TABULATION APPROACH
/*import java.util.*;
public class Dp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i= 2 ; i <= n ; i++){
            dp[i] = dp[i -1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
*/

//TABULATION APPROACH WITH SPACE OPTIMIZATION
/*import java.util.*;
public class Dp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prev1 = 0;
        int prev2 = 1;

        for(int i = 2 ; i <= n ; i++){
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        System.out.println(prev2);
    }
}
*/


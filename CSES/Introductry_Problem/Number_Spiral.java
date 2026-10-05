import java.util.*;
public class Number_Spiral{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long ans = 0;
            long x = sc.nextLong();
            long y = sc.nextLong();

            long n = Math.max(x , y);
            long m = n * n;

            if( n % 2 == 0){
                if( y == n){
                    ans = m - x + 1;
                }
                else{
                    ans = (n-1) * (n-1) +y;
                }
            }
            else{
                if(x == n){
                    ans = m - y + 1;
                }
                else{
                    ans = (n-1) * (n-1) +x;
                }
            }
            System.out.println(ans);
        }
    }
}
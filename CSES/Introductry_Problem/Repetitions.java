import java.util.*;
public class Repetitions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int len = 1;
        int curr = 1;

        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr++;
            }
            else{
                curr = 1;
            }

            len = Math.max(len , curr);
        }

        System.out.println(len);

    }
    
}

package DSA;
//BACKTRAKING IN ARRAY(STARING EMPTY ARRAY --> AT EVERY INDEX VALUE = INDEX+1 WHILE GOING UP IN CALL STACK --> WHILE COMNING BACK VALUE = VALUE -2)
/*public class Backtracking {
    public static void changearr(int arr[] , int i , int val){
        //Base Case
        if( i == arr.length ){
            printarr(arr);
            return;
        }
        //Recursion
        arr[i] = val;
        changearr(arr , i+1 , val+1 );
        arr[i] = arr[i]-2;
    }
    public static void printarr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changearr(arr , 0 , 1);
        printarr(arr);
    }   
}
*/

//FIND SUBSET OF STRING
/*public class Backtracking{
    public static void findsubset(String str , String ans , int i ){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
                return;
            }
            else{
                System.out.println(ans);
                return;
            }
        }
        findsubset(str , ans+str.charAt(i) , i+1);
        findsubset(str , ans , i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findsubset(str,"" , 0);
    }
}
*/

//FIND PERMUTATION
public class Backtracking{
    public static void permutation(String str , String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        for(int i = 0 ; i < str.length() ; i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0 , i) + str.substring(i+1);
            permutation(Newstr , ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        permutation(str,"");
    }
}



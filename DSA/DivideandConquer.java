package DSA;
//MERGE SORT 
/*public class DivideandConquer {
    public static void printarr(int arr[]){
        System.out.print("{ ");
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" }");
        System.out.println();

    }

   
    public static void mergesort(int arr[] , int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2 ; //This step is a better way of writting si+ei/2;
        count
        mergesort(arr , si , mid);
        mergesort(arr , mid+1 , ei);

        merge(arr , si , mid , ei);
    }
     public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei - si +1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

    while(i<= mid){
        temp[k++] = arr[i++];
    }

    while(j<= ei){
        temp[k++] = arr[j++];
    }

    for( k = 0 , i = si ; k < temp.length ; k++ , i++ ){
        arr[i] = temp[k];
    }
        
    }
    
    public static void main(String args[]){
        int arr[] = {3 , 9 , 5 , 1 , 2};
        mergesort(arr , 0 , arr.length - 1);
        printarr(arr);
    }
    
    
}*/

//QUICK SORT
public class DivideandConquer{
    public static void printarr(int arr[]){
        System.out.print("{ ");
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" }");
        System.out.println();

    }
    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int n = si-1;

        for(int j = si ; j < ei ; j++){
            if(arr[j] <= pivot){
                n++;
                int temp = arr[j];
                arr[j] = arr[n];
                arr[n] = arr[j];
            }
        }
        n++;
        int temp = pivot;
        arr[ei] = arr[n];
        arr[n] = temp ;

        return n;

    }

    public static void quicksort(int arr[] , int si , int ei){
        if(si>=ei){
            return;
        }
        int pidx = partition(arr , si , ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr , pidx+1 , ei);

    }
    public static void main(String args[]){
        int arr[] = {2 , 6 , 7 , 4 , 8 , 5};
        quicksort(arr,0, arr.length-1);
        printarr(arr);
        

    }
}


//QUICK SORT USING FIRST ELEMNT AS PIVOT
/*public class DivideandConquer {

    public static void printarr(int arr[]){
        System.out.print("{ ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    // Partition using FIRST element as pivot
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[si];
        int i = si + 1;
        int j = ei;

        while(i <= j){
            while(i <= ei && arr[i] <= pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[si];
        arr[si] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quicksort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx - 1);
        quicksort(arr, pidx + 1, ei);
    }

    public static void main(String args[]){
        int arr[] = {2, 6, 7, 4, 8, 5};
        quicksort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
*/

//SUBMATRIX SUM
public class DivideandConquer{
    public static int submattrix(int matrix[][] ,int x1,int x2 ,int y1 ,int y2){
    int n = matrix.length;
    int m = matrix[0].length;
    int p = n*m;
    int sum = 0 ;

    for(int i = 0 ; i < p ; i++ ){
        int k = i / m;
        int j = i % m;

        if(k >= x1 && k <= x2 && j >= y1 && j <= y2){
            sum += matrix[k][j];
        }
    }
    return sum;
}
    public static void main(String args[]){
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;

        int[][] matrix = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
        int u = submattrix(matrix , x1 , x2 , y1 , y2);    
        System.out.println(u); 
    }
}


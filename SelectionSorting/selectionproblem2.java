package SelectionSorting;

public class selectionproblem2 {
    public static void dp(int arr[]){
    for(int i=0; i<arr.length ; i++){
    int minPos = i;
        for(int j=i+1; j<arr.length; j++){
        if(arr[minPos] < arr[j]){
            minPos=j;
        }
        }
        //swap
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
    

    }
    public static void printArr(int arr[] ) {
    for(int i=0; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
        
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        dp(arr); 
        printArr(arr);
    }
}
    
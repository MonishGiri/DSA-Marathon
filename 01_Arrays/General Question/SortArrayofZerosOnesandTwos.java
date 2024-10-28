public class SortArrayofZerosOnesandTwos {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,1,1,0};

        // Method 1 : By using any sorting algorithm
        // for(int i=0; i<arr.length; i++){
        //     int min = Integer.MAX_VALUE;
        //     int minIndex = -1;

        //     for(int j=i; j<arr.length; j++){
        //         if(arr[j] < min){
        //             min = arr[j];
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;
        // }

        // Method 2 : Count no of 0,1 and 2
        // int noOfOnes = 0;
        // int noOfZeroes = 0;
        // int noOfTwos = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == 0) noOfZeroes++;
        //     else if(arr[i] == 1) noOfOnes++;
        //     else noOfTwos++;
        // }

        // for(int i=0; i<arr.length; i++){
        //     if(i<noOfZeroes) arr[i] = 0;
        //     else if(i<noOfOnes+noOfZeroes) arr[i] = 1;
        //     else arr[i] = 2;
        // }

        // Method 3 : Dutch National Flag algorithm
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } 
            else if(arr[mid] == 1) mid++;
            else if(arr[mid] == 2){
                swap(arr, mid, high);
                high--;
            }
        }

        for(int ele: arr) System.out.print(ele+" ");
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

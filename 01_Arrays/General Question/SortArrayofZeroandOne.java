public class SortArrayofZeroandOne {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};

        // Method 1 : By using sorting algorithm
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

        // Two Pointers

        
        // Method 2: Calculate the noOfzeroes and noOfOnes

        // int noOfOnes = 0;
        // int noOfZeroes = 0;

        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == 0) noOfZeroes++;
        //     else noOfOnes++;
        // }

        // for(int i=0; i<arr.length; i++){
        //     if(noOfZeroes != 0){
        //         arr[i] = 0;
        //         noOfZeroes--;
        //     }
        //     else{
        //         arr[i] = 1;
        //         noOfOnes--;
        //     }
        // }

        // Method 3 : Using two pointers
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            // if(i > j) break;
            else if(arr[i] == 1 && arr[j] == 0){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        for(int ele: arr) System.err.print(ele+" ");
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

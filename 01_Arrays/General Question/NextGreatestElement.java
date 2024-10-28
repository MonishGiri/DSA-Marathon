public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        // Method 1 : Brute force approach
        // for(int i=0; i<arr.length; i++){
        //     int max = Integer.MIN_VALUE;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[j] > max) {
        //             max = arr[j];
        //         }
        //     }
        //     System.out.println("Max is: "+max);
        //     arr[i] = max;
        // }
        
        // arr[arr.length-1] = -1;
        int nge = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];  // Temporarily store the current element
            arr[i] = nge;  // Replace current element with the next greatest element
            nge = Math.max(nge, temp);  // Update nge if the current element is greater
        }
        
        arr[arr.length-1] = -1;
        for(int ele: arr) System.out.print(ele+" ");
    }
}

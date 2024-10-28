// Leetcode 189
public class RotateArray {
    public static void main(String[] args) {
        // Method 1 : Take an extra array
        int[] arr = {10,20,30,40,50,60,70};
        // int[] ans = new int[arr.length];
        int k = 4;
        // int till = arr.length - k;
        // int count = 0;
        // for(int i=till; i<=arr.length-1; i++){
        //     ans[count++] =  arr[i];
        // }

        // for(int i=0; i<till; i++){
        //     System.out.println("hello" + count);
        //     ans[count] = arr[i];
        //     count++;
        // }

        // Method 2

        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        for(int ele: arr) System.out.print(ele + " ");
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

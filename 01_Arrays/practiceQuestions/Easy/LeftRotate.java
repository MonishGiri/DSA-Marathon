package Easy;

public class LeftRotate {
    public static void leftRotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr,0,n-k-1);
        reverse(arr, n-k, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,10,11};
        leftRotate(arr, 3);
        for(int ele: arr) System.out.print(ele+" ");
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

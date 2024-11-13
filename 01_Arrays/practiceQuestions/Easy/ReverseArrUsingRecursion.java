package Easy;

public class ReverseArrUsingRecursion {
    public static int[] reverse(int[] arr,int low, int high, int n){
        if(low > high) return arr;

        // swap the values of i and j
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        
        return reverse(arr,++low,--high, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] res = reverse(arr, 0,arr.length-1, arr.length);
        for(int ele: res){
            System.out.print(ele+" ");
        }
    }
}

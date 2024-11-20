public class FindMinimumInSortedRotatedArray {
    public static int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[low]<=arr[high]){
                ans = Math.min(arr[low], ans);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else{
                if(arr[mid] <= arr[high]){
                    ans = Math.min(ans, arr[mid]);
                    high = mid - 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("Minimum is: "+findMin(arr));
    }
}

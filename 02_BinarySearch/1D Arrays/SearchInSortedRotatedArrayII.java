public class SearchInSortedRotatedArrayII {
    public static boolean search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return true;
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){ // if arr[low],arr[mid] and arr[high] is equal simply decrease the search space by incrementing low and decrementing high and continue to the next iteration
                low++;
                high--;
                continue;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target<=arr[mid]) high = mid - 1;
                else low = mid + 1;
            }
            else{
                if(arr[mid] <= arr[high]){
                    if(arr[mid] <= target && target <= arr[high]) low = mid + 1;
                    else high = mid - 1;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};

        System.out.println(search(arr, 3));
    }
}

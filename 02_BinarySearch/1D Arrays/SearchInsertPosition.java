public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};  
        int target = 6;

        System.out.println("Search Insert Position is: "+searchInsertPosition(arr, target));
            }
        
            private static int searchInsertPosition(int[] arr, int target) {
                int n = arr.length;
                int low = 0;
                int high = n-1;
                int ans = n;

                while(low<=high){
                    int mid = (low+high) / 2;
                    if(arr[mid] >= target){
                        ans = Math.min(ans, mid);
                        high = mid - 1;
                    }
                    else low = mid + 1;
                }
                return ans;
            }
}

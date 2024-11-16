public class FloorandCielInSortedArray {
    public static int getFloor(int[] arr, int n, int x){
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while(low<=high){
          int mid = (low + high) / 2;
          if(arr[mid] <= x){
            ans = arr[mid];
            low = mid + 1;
          }
          else high = mid - 1;
        }
        return ans;
      }
  
      public static int getCeil(int[] arr, int n, int x){
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while(low<=high){
          int mid = (low+high)/2;
          if(arr[mid] >= x){
            ans = arr[mid];
            high = mid - 1;
          }
          else low = mid + 1;
        }
        return ans;
      }
      public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int[] arr = new int[2];
        arr[0] = getFloor(a, n, x);
        arr[1] = getCeil(a, n, x);
  
        return arr;
      }
}

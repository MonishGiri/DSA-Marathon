public class MinimumDaysToMakeMBouquets {
    // Method to find the minimum number of days to make m bouquets
    public static int minDays(int[] arr, int m, int k) {
        long val = (long) m * k;
            int n = arr.length; // Size of the array
            if (val > n) return -1; // Impossible case.
            // Find maximum and minimum:
            int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                mini = Math.min(mini, arr[i]);
                maxi = Math.max(maxi, arr[i]);
            }
            
            // Brute force: check for each day from the minimum day to maximum
            // for (int i = mini; i <= maxi; i++) {
            //     if (possible(arr, i, m, k))
            //         return i;
            // }
            // return -1;


            // Apply binary search:
            int low = mini, high = maxi;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (possible(arr, mid, m, k)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
       }
    
       public static boolean possible(int[] arr, int day, int m, int k) {
            int n = arr.length; // Size of the array
            int cnt = 0;
            int noOfB = 0;
            // Count the number of bouquets:
            for (int i = 0; i < n; i++) {
                if (arr[i] <= day) {
                    cnt++;
                } else {
                    noOfB += (cnt / k);
                    cnt = 0;
                }
            }
            noOfB += (cnt / k);
            return noOfB >= m;
        }
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 10, 2}; // Bloom days of the flowers
        int m = 3; // Number of bouquets required
        int k = 1; // Number of flowers required per bouquet
        System.out.println("Minimum Days: " + minDays(arr, m, k)); // Output the result
    }
}

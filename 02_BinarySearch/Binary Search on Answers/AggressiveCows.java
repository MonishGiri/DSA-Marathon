import java.util.Arrays;

public class AggressiveCows {

    /**
     * Function to calculate the maximum possible distance between cows.
     * Uses binary search to determine the largest minimum distance.
     *
     * @param arr Array of stall positions
     * @param k Number of cows to place
     * @return The maximum minimum distance
     */
    public static int maximumPossibleDistance(int[] arr, int k) {
        int n = arr.length;

        // Brute Force Approach
        // for (int i = 1; i < high-low; i++) {
        //     if(isPossible(arr, k, i)) continue;
        //     else return i - 1;
        // }
        // return -1;

        // Optimal Approach

        // Step 1: Sort the stall positions for sequential placement
        Arrays.sort(arr);

        // Step 2: Define search space for distances
        int low = 1; // Minimum possible distance
        int high = arr[n - 1] - arr[0]; // Maximum possible distance

        // Step 3: Binary Search for the optimal distance
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid-point of the distance range

            if (isPossible(arr, k, mid)) {
                low = mid + 1; // If possible, try for a larger distance
            } else {
                high = mid - 1; // If not possible, reduce the distance
            }
        }

        // Return the largest possible valid distance
        return high;
    }

    /**
     * Function to check if placing `k` cows with at least `distance` apart is possible.
     *
     * @param arr Sorted array of stall positions
     * @param k Number of cows to place
     * @param distance Minimum required distance between cows
     * @return true if possible, false otherwise
     */
    public static boolean isPossible(int[] arr, int k, int distance) {
        int cntCows = 1; // Place the first cow in the first stall
        int last = 0; // Index of the last placed cow

        // Try to place remaining cows
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[last] >= distance) {
                cntCows++; // Place another cow
                last = i; // Update the last placed cow position
                if (cntCows == k) return true; // If all cows are placed, return true
            }
        }

        // If unable to place all cows, return false
        return cntCows >= k;
    }

    public static void main(String[] args) {
        // Test Case 1: Example input
        int[] arr1 = {79, 74, 57, 22};
        int k1 = 4;
        System.out.println("Maximum distance: " + maximumPossibleDistance(arr1, k1)); // Expected: 5

        // Test Case 2: Simple case with evenly spaced stalls
        int[] arr2 = {1, 2, 8, 4, 9};
        int k2 = 3;
        System.out.println("Maximum distance: " + maximumPossibleDistance(arr2, k2)); // Expected: 3

        // Test Case 3: Large gaps between stalls
        int[] arr3 = {1, 10, 20, 30, 40};
        int k3 = 3;
        System.out.println("Maximum distance: " + maximumPossibleDistance(arr3, k3)); // Expected: 19

        // Test Case 4: Smallest possible array
        int[] arr4 = {1, 2};
        int k4 = 2;
        System.out.println("Maximum distance: " + maximumPossibleDistance(arr4, k4)); // Expected: 1

        // Test Case 5: All stalls at the same position
        int[] arr5 = {5, 5, 5, 5};
        int k5 = 2;
        System.out.println("Maximum distance: " + maximumPossibleDistance(arr5, k5)); // Expected: 0

        // Test Case 6: Sparse stalls with large number of cows
        int[] arr6 = {1, 10, 20, 50, 100};
        int k6 = 4;
        System.out.println("Maximum distance: " + maximumPossibleDistance(arr6, k6)); // Expected: 20
    }
}

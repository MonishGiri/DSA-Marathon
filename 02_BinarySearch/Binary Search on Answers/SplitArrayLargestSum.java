import java.util.ArrayList;
import java.util.Arrays;

public class SplitArrayLargestSum {

    /**
     * Splits the array into `k` subarrays such that the largest sum among them is minimized.
     * @param arr ArrayList of integers representing the array to split.
     * @param k Number of subarrays to split into.
     * @return The minimized largest sum among the subarrays.
     */
    public static int splitArray(ArrayList<Integer> arr, int k) {
        return minimizeLargestSum(arr, arr.size(), k);
    }

    /**
     * Finds the minimum possible largest sum when splitting the array into `k` subarrays.
     * @param arr ArrayList of integers representing the array.
     * @param n Size of the array.
     * @param k Number of subarrays.
     * @return The minimized largest sum.
     */
    public static int minimizeLargestSum(ArrayList<Integer> arr, int n, int k) {
        // If there are more subarrays than elements, it's not possible to split.
        if (k > n) return -1;

        // Initialize the search range for binary search
        int low = Integer.MIN_VALUE; // The smallest possible maximum sum (largest element in the array)
        int high = 0; // The largest possible maximum sum (sum of all elements)

        // Calculate the initial low and high values
        for (int i = 0; i < arr.size(); i++) {
            low = Math.max(low, arr.get(i)); // Find the largest element
            high += arr.get(i); // Calculate the total sum of elements
        }

        // Perform binary search to minimize the largest sum
        while (low <= high) {
            int mid = low + (high - low) / 2; // Midpoint of the current range
            // Check if it's possible to split the array with the current largest sum
            if (countSubarraysWithMaxSum(arr, n, mid) > k) {
                // If more subarrays are required, increase the allowed sum
                low = mid + 1;
            } else {
                // Otherwise, reduce the allowed sum
                high = mid - 1;
            }
        }

        // The minimized largest sum
        return low;
    }

    /**
     * Counts the number of subarrays required to split the array such that no subarray's sum exceeds `maxAllowedSum`.
     * @param arr ArrayList of integers representing the array.
     * @param n Size of the array.
     * @param maxAllowedSum The maximum allowed sum for any subarray.
     * @return The number of subarrays required.
     */
    public static int countSubarraysWithMaxSum(ArrayList<Integer> arr, int n, int maxAllowedSum) {
        int numSubarrays = 1; // Start with one subarray
        int currentSum = 0;

        // Iterate through the array to count subarrays
        for (int i = 0; i < n; i++) {
            currentSum += arr.get(i);

            // If the current sum exceeds the allowed maximum, start a new subarray
            if (currentSum > maxAllowedSum) {
                numSubarrays++;
                currentSum = arr.get(i); // Start the new subarray with the current element
            }
        }

        return numSubarrays;
    }

    public static void main(String[] args) {
        // Example array and number of subarrays
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2; // Number of subarrays

        // Output the minimized largest sum
        System.out.println("Minimized Largest Sum is: " + splitArray(arr, k));
    }
}

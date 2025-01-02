public class KthMissingNumber {

    public static int findKthPositive(int[] arr, int k) {

        // Brute Force Approach
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] < k) k++;
        //     else break;
        // }
        // return k;
        
        // Optimal Approach using Binary Search
        int low = 0;                     // Initialize low pointer
        int high = arr.length - 1;       // Initialize high pointer to the last index of the array

        // Perform binary search
        while (low <= high) {
            System.out.println("Low: " + low + " High is " + high);
            int mid = low + (high - low) / 2; // Calculate mid to prevent overflow

            // Calculate how many numbers are missing until arr[mid]
            int missing = arr[mid] - (mid + 1);

            // If the missing count is less than k, move the low pointer to the right
            if (missing < k) {
                low = mid + 1;
            } else {
                // Otherwise, move the high pointer to the left
                high = mid - 1;
            }
        }

        // The k-th missing number will be in the range of `low` + `k` after the loop
        return low + k;
    }

    public static void main(String[] args) {
        // Input array (sorted) and k (find the k-th missing positive number)
        int[] arr = {1, 2, 3, 4}; // Example input
        int k = 2;

        // Print the k-th missing number
        System.out.println(k + "th missing number is: " + findKthPositive(arr, k));

        // Additional test case
        int[] arr2 = {2, 3, 4, 7, 11};
        int k2 = 5;
        System.out.println(k2 + "th missing number is: " + findKthPositive(arr2, k2));
    }
}

package Medium;

import java.util.Map;
import java.util.HashMap;

public class CountSubArraysWithSumK {
    public static int subArraySum(int[] arr, int k){
        int n = arr.length;
        if (n == 0) return 0;
        int count = 0;  // To keep track of the number of subarrays that sum to `k`
        int preSum = 0;  // This variable stores the cumulative sum of elements up to the current index
        Map<Integer, Integer> map = new HashMap<>();  // HashMap to store the frequency of each cumulative sum
        map.put(0, 1);  // Initialize with (0, 1) to handle the case when a subarray starting from index 0 equals `k`

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            preSum += arr[i];  // Update the cumulative sum up to index `i`
            int remove = preSum - k;  // Calculate the difference needed to form sum `k`
            count += map.getOrDefault(remove, 0);  // Check if this difference exists in `map`. If it does, increment `count` by the frequency of this difference

            // Update the map with the current cumulative sum
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;  // Return the count of subarrays that sum to `k`
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println("SubArrays with sum "+k+" is: "+subArraySum(arr, k));
    }
}

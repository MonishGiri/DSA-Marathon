package Easy;

import java.util.Map;
import java.util.HashMap;
public class LongestSubArraySum {
    public static int longestSubArraySum(int[] arr, int n, int k){
        int maxLen = 0;

        // Brute Force approach
        // for(int i=0; i<arr.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<arr.length; j++){
        //         sum += arr[j];
        //         if(sum == k) length = Math.max(maxLength, j-i+1);
        //     }
        // }

        // Better Approach for positives and optimal approach for positives + negatives using HashMap
        // Map<Long, Integer> preSumMap = new HashMap<>();
        // long sum = 0;
        // int maxLen = 0;
        // for (int i = 0; i < n; i++) {
        //     //calculate the prefix sum till index i:
        //     sum += arr[i];

        //     // if the sum = k, update the maxLen:
        //     if (sum == k) {
        //         maxLen = Math.max(maxLen, i + 1);
        //     }

        //     // calculate the sum of remaining part i.e. x-k:
        //     long rem = sum - k;
        //     // System.out.println(rem);
        //     //Calculate the length and update maxLen:
        //     if (preSumMap.containsKey(rem)) {
        //         int len = i - preSumMap.get(rem);
        //         maxLen = Math.max(maxLen, len);
        //     }

        //     //Finally, update the map checking the conditions:
        //     if (!preSumMap.containsKey(sum)) {
        //         preSumMap.put(sum, i);
        //     }

        // }

        // Optimal Approach : Two Pointers

        int i = 0; 
        int j = 0;
        int sum = 0;
        

        while(i<arr.length && j<arr.length){
            sum += arr[j];

            if(sum == k) maxLen = Math.max(maxLen,j - i + 1);

            if(sum > k) i++;

            j++;
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        System.out.println(longestSubArraySum(arr, arr.length, 10));
    }
}

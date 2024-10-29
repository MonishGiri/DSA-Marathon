package Medium;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1};
        System.out.println("Maximum sum is: "+maxSubArray(arr));
    }

    private static int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;

        // Brute Force: Get sum of all the possible subarray O(n3)
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         int sum = 0;
        //         for(int k=i; k<=j; k++){
        //             sum += nums[k];
        //         }
        //         maxSum = Math.max(maxSum, sum);
        //         System.out.println(maxSum+" i: "+i+" j: "+j+" sum: "+sum);
        //     }
        // }


        // Better Approach O(n2)
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){
        //         sum += nums[j];
        //         maxSum = Math.max(maxSum, sum);
        //         System.out.println(maxSum+" i: "+i+" j: "+j+" sum: "+sum);
        //     }
        // }

        // Optimal Approach using kadane's algo
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            // for -ve values in the array this doesn't work
            // sum += nums[i];
            // if(sum < 0) sum = 0;
            // if(sum > maxSum) maxSum = sum;

            // this will work even for -ve values
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}

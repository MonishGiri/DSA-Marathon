package Medium;

public class PrintSubArraywithMaximumSum {
    public static void main(String[] args) {
        int[] arr = {-2, -1};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int startIdx = 0;
        int tempStartIdx = 0;  // Temporary start index
        int endIdx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum > maxSum) {
                maxSum = sum;
                startIdx = tempStartIdx;  // Set start index to the current temp start index
                endIdx = i;               // Update end index to the current index
            }
            
            if (sum < 0) {
                sum = 0;                  // Reset sum to 0 if it becomes negative
                tempStartIdx = i + 1;     // Move temp start index to the next position
            }
        }

        System.out.println("Start index: " + startIdx + ", End index: " + endIdx);
        System.out.println("Maximum sum is: " + maxSum);
        System.out.print("Subarray with maximum sum: ");
        for (int i = startIdx; i <= endIdx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

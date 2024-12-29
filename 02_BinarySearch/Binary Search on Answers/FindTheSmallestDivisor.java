public class FindTheSmallestDivisor {

    // Function to find the smallest divisor that results in a sum less than or equal to the threshold
    public static int smallestDivisor(int[] arr, int threshold) {
        // Initialize the search range for the divisor
        int min = 1; // The smallest possible divisor
        int max = Integer.MIN_VALUE; // The largest possible divisor

        // Find the maximum value in the array to determine the upper bound for the divisor
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // Brute force approach
        // for(int i = min; i <= max; i++){
        //     if(divideAndSum(arr, i, threshold)) return i;
        // }
        // return - 1;

        // Optimal approach using Binary Search
        // Perform binary search on divisors to find the smallest one that meets the condition
        while (min <= max) {
            int mid = min + (max - min) / 2; // Midpoint divisor

            // If divideAndSum is true for this divisor, search for a smaller divisor
            if (divideAndSum(arr, mid, threshold)) {
                max = mid - 1;
            } else {
                // Otherwise, search for a larger divisor
                min = mid + 1;
            }
        }
        
        // The smallest divisor found is stored in 'min'
        return min;
    }

    // Function to check if the sum of arr[i] / divisor (rounded up) is <= threshold
    public static boolean divideAndSum(int[] arr, int divisor, int threshold) {
        int sum = 0;
        
        // Iterate over the array and calculate the sum of divided values rounded up
        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) arr[i] / divisor); // Divide and round up
        }

        // Debugging: Print the calculated sum
        System.out.println("Sum is: " + sum);
        
        // Return true if sum is less than or equal to threshold
        return sum <= threshold;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {44, 22, 33, 11, 1};
        int threshold1 = 5;
        System.out.println("Smallest divisor for arr1 is: " + smallestDivisor(arr1, threshold1)); // Expected result: 4

        // Test Case 2
        int[] arr2 = {10, 20, 30, 40};
        int threshold2 = 5;
        System.out.println("Smallest divisor for arr2 is: " + smallestDivisor(arr2, threshold2)); // Expected result: 7

        // Test Case 3
        int[] arr3 = {100, 200, 300};
        int threshold3 = 6;
        System.out.println("Smallest divisor for arr3 is: " + smallestDivisor(arr3, threshold3)); // Expected result: 100

        // Test Case 4
        int[] arr4 = {1, 2, 3, 4, 5};
        int threshold4 = 10;
        System.out.println("Smallest divisor for arr4 is: " + smallestDivisor(arr4, threshold4)); // Expected result: 2
    }
}

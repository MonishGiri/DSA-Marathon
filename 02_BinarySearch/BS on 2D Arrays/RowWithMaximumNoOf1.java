public class RowWithMaximumNoOf1 {
    // Method to find the row with the maximum number of 1s in a binary matrix
    public static int rowWithMax1s(int[][] arr) {
        int n = arr.length; // Number of rows in the matrix
        int onesCount = 0; // To store the maximum count of 1s encountered so far
        int rowNo = -1; // To store the index of the row with the maximum number of 1s

        // Iterate through each row in the matrix
        for (int i = 0; i < n; i++) {
            // Find the count of 1s in the current row using `lowerBound` to find the first occurrence of 1
            int cnt = arr[0].length - lowerBound(arr[i], 1);

            // Update the row number and maximum count of 1s if the current row has more 1s
            if (cnt > onesCount) {
                onesCount = cnt;
                rowNo = i;
            }
        }
        return rowNo; // Return the row index with the maximum number of 1s
    }

    // Helper method to find the lower bound of a target value in a sorted array
    public static int lowerBound(int[] arr, int target) {
        int n = arr.length; // Length of the array
        int ans = n; // Initialize answer to an index outside the array bounds
        int low = 0; // Start index
        int high = n - 1; // End index

        // Binary search to find the first occurrence of the target value
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid; // Update the answer to the current index
                high = mid - 1; // Narrow down the search to the left half
            } else {
                low = mid + 1; // Narrow down the search to the right half
            }
        }
        return ans; // Return the index of the first occurrence of the target
    }

    public static void main(String[] args) {
        // Test case 1
        int[][] arr1 = {
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {0, 1, 1, 1},
            {0, 0, 0, 1}
        };
        System.out.println("Row with maximum no. of 1s: " + rowWithMax1s(arr1)); // Output: 1

        // Test case 2: Row with no 1s
        int[][] arr2 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Row with maximum no. of 1s: " + rowWithMax1s(arr2)); // Output: -1

        // Test case 3: All rows have the same number of 1s
        int[][] arr3 = {
            {0, 1},
            {0, 1},
            {0, 1}
        };
        System.out.println("Row with maximum no. of 1s: " + rowWithMax1s(arr3)); // Output: 0

        // Test case 4: All elements are 1s
        int[][] arr4 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        System.out.println("Row with maximum no. of 1s: " + rowWithMax1s(arr4)); // Output: 0

        // Test case 5: Single row with mixed 0s and 1s
        int[][] arr5 = {
            {0, 0, 1, 1}
        };
        System.out.println("Row with maximum no. of 1s: " + rowWithMax1s(arr5)); // Output: 0
    }
}

public class SearchInSorted2DMatrix {

    // Method to search for a target value in a sorted 2D matrix
    public static boolean searchIn2D(int[][] arr, int target) {

        // Brute force approach : O(logn.logm)
        // int low = 0;
        // int high = n - 1;

        // while(low<=high){
        //     int mid = (low+high)/2;
        //     if(search(arr[mid], target)) return true;
        //     else if(arr[mid][high] > target) low = mid + 1;
        //     else high = mid - 1;
        // }

        int n = arr.length;  // Number of rows in the matrix
        int m = arr[0].length;  // Number of columns in the matrix

        // Optimal approach: Treat the 2D matrix as a 1D array for binary search
        int low = 0;
        int high = (n * m) - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // Find the middle index
            int row = mid / m;  // Calculate the row index from mid
            int col = mid % m;  // Calculate the column index from mid

            // Compare the target with the element at calculated row and column
            if (arr[row][col] == target) {
                return true;  // Target found
            } else if (arr[row][col] > target) {
                high = mid - 1;  // Narrow search to the left half
            } else {
                low = mid + 1;  // Narrow search to the right half
            }
        }

        return false;  // Target not found in the matrix
    }

    // Method for binary search on a single row (used in the brute force approach)
    public static boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;  // Target found
            } else if (arr[mid] > target) {
                high = mid - 1;  // Narrow search to the left half
            } else {
                low = mid + 1;  // Narrow search to the right half
            }
        }

        return false;  // Target not found in the row
    }

    public static void main(String[] args) {
        // Test case 1: Target is present in the matrix
        int[][] arr1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target1 = 2;
        System.out.println("Test case 1 result: " + searchIn2D(arr1, target1));  // Output: true

        // Test case 2: Target is not present in the matrix
        int target2 = 13;
        System.out.println("Test case 2 result: " + searchIn2D(arr1, target2));  // Output: false

        // Test case 3: Target is the smallest element in the matrix
        int target3 = 1;
        System.out.println("Test case 3 result: " + searchIn2D(arr1, target3));  // Output: true

        // Test case 4: Target is the largest element in the matrix
        int target4 = 12;
        System.out.println("Test case 4 result: " + searchIn2D(arr1, target4));  // Output: true

        // Test case 5: Empty matrix (edge case)
        int[][] arr2 = {};
        try {
            int target5 = 1;
            System.out.println("Test case 5 result: " + searchIn2D(arr2, target5));  // Expected: false or error
        } catch (Exception e) {
            System.out.println("Test case 5 result: Matrix is empty!");
        }

        // Test case 6: Single row matrix
        int[][] arr3 = {
            {1, 2, 3, 4}
        };
        int target6 = 3;
        System.out.println("Test case 6 result: " + searchIn2D(arr3, target6));  // Output: true

        // Test case 7: Single column matrix
        int[][] arr4 = {
            {1},
            {2},
            {3},
            {4}
        };
        int target7 = 3;
        System.out.println("Test case 7 result: " + searchIn2D(arr4, target7));  // Output: true

        // Test case 8: Target not in single column matrix
        int target8 = 5;
        System.out.println("Test case 8 result: " + searchIn2D(arr4, target8));  // Output: false
    }
}

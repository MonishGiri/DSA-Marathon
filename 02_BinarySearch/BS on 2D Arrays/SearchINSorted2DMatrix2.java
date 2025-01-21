public class SearchINSorted2DMatrix2 {
    /**
     * Searches for a target in a sorted 2D matrix.
     * 
     * The matrix has the following properties:
     * - Each row is sorted in ascending order from left to right.
     * - Each column is sorted in ascending order from top to bottom.
     * 
     * @param matrix The 2D matrix to search in.
     * @param target The value to search for.
     * @return true if the target is found, false otherwise.
     */

    //  Time complexity : O(n+m)
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Edge case: If the matrix is null or has no elements
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int n = matrix.length;     // Number of rows
        int m = matrix[0].length;  // Number of columns

        // Start from the top-right corner
        int row = 0;
        int col = m - 1;

        // Traverse the matrix
        while (row < n && col >= 0) {
            // If the target is found, return true
            if (matrix[row][col] == target) {
                return true;
            }
            // If the current value is greater than the target, move left
            else if (matrix[row][col] > target) {
                col--;
            }
            // If the current value is smaller than the target, move down
            else {
                row++;
            }
        }

        // Target not found, return false
        return false;
    }

    public static void main(String[] args) {
        // Test case 1: Standard case
        int[][] arr = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 26;

        System.out.println(target + " is: " + searchMatrix(arr, target));

        // Test case 2: Target is not in the matrix
        target = 20;
        System.out.println(target + " is: " + searchMatrix(arr, target));

        // Test case 3: Target is the smallest element
        target = 1;
        System.out.println(target + " is: " + searchMatrix(arr, target));

        // Test case 4: Target is the largest element
        target = 30;
        System.out.println(target + " is: " + searchMatrix(arr, target));

        // Test case 5: Edge case - Empty matrix
        int[][] emptyMatrix = {};
        target = 10;
        System.out.println("Empty matrix: " + searchMatrix(emptyMatrix, target));

        // Test case 6: Edge case - Matrix with one element (target exists)
        int[][] singleElementMatrix = {{5}};
        target = 5;
        System.out.println("Single element matrix (exists): " + searchMatrix(singleElementMatrix, target));

        // Test case 7: Edge case - Matrix with one element (target does not exist)
        target = 10;
        System.out.println("Single element matrix (not exists): " + searchMatrix(singleElementMatrix, target));
    }
}

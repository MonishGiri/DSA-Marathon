public class MedianOfTwoSortedArray {

    // Function to calculate the median of two sorted arrays
    public static double median(int[] a, int[] b) {

        // Optimal approach : O(log(min(n, m))) using binary search
        int n = a.length; // Length of the first array
        int m = b.length; // Length of the second array

        // Ensure the first array is smaller to minimize binary search range
        if (n > m) return median(b, a);

        int low = 0, high = n; // Binary search boundaries
        int left = (n + m + 1) / 2; // Total elements to partition the left half
        int totalLength = n + m;

        // Binary search loop
        while (low <= high) {
            int mid1 = (low + high) / 2; // Partition index for array `a`
            int mid2 = left - mid1; // Partition index for array `b`

            // Values around the partitions
            int l1 = (mid1 - 1 >= 0) ? a[mid1 - 1] : Integer.MIN_VALUE; // Left of partition in `a`
            int r1 = (mid1 < n) ? a[mid1] : Integer.MAX_VALUE; // Right of partition in `a`
            int l2 = (mid2 - 1 >= 0) ? b[mid2 - 1] : Integer.MIN_VALUE; // Left of partition in `b`
            int r2 = (mid2 < m) ? b[mid2] : Integer.MAX_VALUE; // Right of partition in `b`

            // Check if partition is correct
            if (l1 <= r2 && l2 <= r1) {
                // If total number of elements is odd, return the max of left parts
                if (totalLength % 2 == 1) return Math.max(l1, l2);

                // If total number of elements is even, return the average of max of left parts and min of right parts
                return ((double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
            }
            // Adjust the binary search range
            else if (l1 > r2) {
                high = mid1 - 1; // Move left in `a`
            } else {
                low = mid1 + 1; // Move right in `a`
            }
        }

        return 0; // This line will never be reached if inputs are valid

        // Better approach : O(n+m)

        // int ele2Idx = (n+m) / 2;
        // int ele1Idx = ((n+m) / 2) - 1;

        // double ele1 = 0;
        // double ele2 = 0;

        // int i = 0;
        // int j = 0;
        // int eleCount = 0;

        // while(i<n && j<m){
        //     System.out.println("eleCount "+eleCount);
        //     if(a[i] <= b[j]){
        //         if(eleCount == ele1Idx){
        //             ele1 = a[i];
        //         }
        //         else if(eleCount == ele2Idx){
        //             ele2 = a[i];
        //         }
        //         i++;
        //     }
        //     else{
        //         if(eleCount == ele1Idx){
        //             ele1 = b[j];
        //         }
        //         else if(eleCount == ele2Idx){
        //             ele2 = b[j];
        //         }
        //         j++;
        //     }
        //     eleCount++;
        // }

        // while(i<n) {
        //     System.out.println("Ele count in a: "+eleCount);
        //     if(eleCount == ele1Idx){
        //         ele1 = a[i];
        //     }
        //     else if(eleCount == ele2Idx){
        //         ele2 = a[i];
        //     }
        //     eleCount++;
        //     i++;
        // }

        // while(j<m){
        //     System.out.println("Ele count in b: "+eleCount);
        //     if(eleCount == ele1Idx){
        //         ele1 = b[j];
        //     }
        //     else if(eleCount == ele2Idx){
        //         ele2 = b[j];
        //     }
        //     eleCount++;
        //     j++;
        // }

        // System.out.println("Ele1: "+ele1+" and Ele2: "+ele2);
        
        // return ((n+m) % 2 == 0) ?  (ele1+ele2)/2 :  ele2;

         // brute approach will be first sorting both the arrrays storing the result in another array
    // and then calculating median
    }

    public static void main(String[] args) {
        // Sample test cases
        int[] a1 = {2, 4, 6};
        int[] b1 = {1, 3, 5};
        System.out.println("Test Case 1:");
        System.out.println("Array a: {2, 4, 6}");
        System.out.println("Array b: {1, 3, 5}");
        System.out.println("Median is: " + median(a1, b1)); // Expected output: 3.5

        int[] a2 = {1, 3};
        int[] b2 = {2};
        System.out.println("\nTest Case 2:");
        System.out.println("Array a: {1, 3}");
        System.out.println("Array b: {2}");
        System.out.println("Median is: " + median(a2, b2)); // Expected output: 2.0

        int[] a3 = {1, 2};
        int[] b3 = {3, 4};
        System.out.println("\nTest Case 3:");
        System.out.println("Array a: {1, 2}");
        System.out.println("Array b: {3, 4}");
        System.out.println("Median is: " + median(a3, b3)); // Expected output: 2.5

        int[] a4 = {};
        int[] b4 = {1};
        System.out.println("\nTest Case 4:");
        System.out.println("Array a: {}");
        System.out.println("Array b: {1}");
        System.out.println("Median is: " + median(a4, b4)); // Expected output: 1.0

        int[] a5 = {1, 2, 3, 4, 5};
        int[] b5 = {6, 7, 8, 9, 10};
        System.out.println("\nTest Case 5:");
        System.out.println("Array a: {1, 2, 3, 4, 5}");
        System.out.println("Array b: {6, 7, 8, 9, 10}");
        System.out.println("Median is: " + median(a5, b5)); // Expected output: 5.5
    }
}

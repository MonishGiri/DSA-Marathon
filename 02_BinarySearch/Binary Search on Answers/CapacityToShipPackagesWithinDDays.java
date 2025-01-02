public class CapacityToShipPackagesWithinDDays {

    // Method to find the minimum ship capacity to ship all packages within the given days
    public static int shipWithinDays(int[] weights, int days) {
        // Lower bound is the max weight in the array (minimum capacity required)
        int low = findMax(weights);

        // Upper bound is the total summation of all weights (maximum capacity needed)
        int high = findSummation(weights);

        System.out.println("Low is: " + low);

        // Linear search to find the minimum valid capacity (inefficient)
        while (low <= high) {
            if (willShip(weights, days, low)) return low; // Check if the current capacity works
            low++; // Increment the capacity to test
        }

        return -1; // Return -1 if no valid capacity is found
    }

    // Helper method to check if all packages can be shipped within the given days with the specified capacity
    public static boolean willShip(int[] weights, int days, int capacity) {
        int load = 0; // Current load on the ship
        int requiredDays = 1; // Start with the first day

        for (int i = 0; i < weights.length; i++) {
            // If adding the current weight exceeds the capacity, start a new day
            if (load + weights[i] > capacity) {
                requiredDays++;
                load = 0; // Reset the load for the new day
            }
            load += weights[i]; // Add the weight to the current day's load
        }

        // If the required days exceed the given days, return false
        return requiredDays <= days;
    }

    // Helper method to find the maximum value in an array (used as the lower bound)
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    // Helper method to calculate the sum of an array (used as the upper bound)
    public static int findSummation(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] weights1 = {1, 2, 3, 1, 1};
        int days1 = 4;
        System.out.println("Minimum capacity to ship within " + days1 + " days: " + shipWithinDays(weights1, days1));

        // Test case 2
        int[] weights2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days2 = 5;
        System.out.println("Minimum capacity to ship within " + days2 + " days: " + shipWithinDays(weights2, days2));

        // Test case 3
        int[] weights3 = {10, 50, 70, 30};
        int days3 = 2;
        System.out.println("Minimum capacity to ship within " + days3 + " days: " + shipWithinDays(weights3, days3));

        // Test case 4
        int[] weights4 = {5, 5, 5, 5, 5};
        int days4 = 1;
        System.out.println("Minimum capacity to ship within " + days4 + " days: " + shipWithinDays(weights4, days4));

        // Test case 5
        int[] weights5 = {5, 5, 5, 5, 5};
        int days5 = 5;
        System.out.println("Minimum capacity to ship within " + days5 + " days: " + shipWithinDays(weights5, days5));
    }
}

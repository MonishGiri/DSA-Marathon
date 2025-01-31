public class LargestOddNumberInString {

    /**
     * This method finds the largest odd number that is a non-empty substring
     * of the given numeric string.
     * 
     * @param num The input string consisting of numeric digits.
     * @return The largest odd-numbered substring; otherwise, an empty string if no odd number is found.
     */
    public static String largestOddNumber(String num) {
        // Edge case: If the string is empty, return an empty string.
        if (num.length() == 0) return "";

        // Traverse the string from right to left to find the last odd digit.
        for (int i = num.length() - 1; i >= 0; i--) {
            // Convert character to integer and check if it's an odd number
            if ((num.charAt(i) - '0') % 2 == 1) {
                // Return the substring from the beginning to this odd digit (inclusive)
                return num.substring(0, i + 1);
            }
        }

        // If no odd digit is found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        // Test case: The largest odd-numbered substring of "10133890" should be "1013389"
        System.out.println("Largest Odd number: " + largestOddNumber("10133890"));
    }
}

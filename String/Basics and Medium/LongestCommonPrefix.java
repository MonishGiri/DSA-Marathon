public class LongestCommonPrefix {

    /**
     * Finds the longest common prefix among an array of strings.
     *
     * @param strs An array of strings
     * @return The longest common prefix string
     */
    public static String longestCommonPrefix(String[] strs) {
        // Edge case: If the input array is empty, return an empty string
        if (strs.length == 0) return "";

        // Initialize the prefix with the first string
        StringBuilder sb = new StringBuilder(strs[0]);

        // Iterate through the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            StringBuilder currentSb = new StringBuilder();

            // Compare characters of sb and the current string up to the shorter length
            for (int j = 0; j < Math.min(sb.length(), strs[i].length()); j++) {
                char c = strs[i].charAt(j);
                
                // If characters match, append to the new prefix
                if (sb.charAt(j) == c) {
                    currentSb.append(c);
                    System.out.println("Current prefix: " + sb);
                } 
                // If mismatch is found, stop checking further
                else break;
            }
            
            // Update sb to store the latest longest common prefix
            sb = currentSb;
        }

        // Convert StringBuilder to string and return the longest common prefix
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test Cases
        String[] test1 = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(test1)); // Expected Output: "fl"

        String[] test2 = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(test2)); // Expected Output: ""

        String[] test3 = {"apple", "ape", "april"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(test3)); // Expected Output: "ap"

        String[] test4 = {"interview", "internet", "internal", "interstellar"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(test4)); // Expected Output: "inter"

        String[] test5 = {"a", "a", "a"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(test5)); // Expected Output: "a"

        String[] test6 = {""};
        System.out.println("Longest common prefix: " + longestCommonPrefix(test6)); // Expected Output: ""

        String[] test7 = {"same"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(test7)); // Expected Output: "same"
    }
}

public class RemoveOuterParenthesis {

    /**
     * This method removes the outermost parentheses from every primitive
     * valid parentheses substring in the given string.
     *
     * @param s A valid parentheses string consisting of '(' and ')'.
     * @return The modified string after removing the outermost parentheses.
     */
    public static String removeOuterParentheses(String s) {
        int open = 0; // Counter to track open parentheses
        StringBuilder sb = new StringBuilder(); // StringBuilder to store the result

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // Append '(' only if it's not the outermost one
                if (open > 0) sb.append(s.charAt(i));
                open++; // Increment the open parentheses counter
            } else {
                open--; // Decrement before checking to ensure proper balancing
                // Append ')' only if it's not the outermost one
                if (open > 0) sb.append(s.charAt(i));
            }
        }
        return sb.toString(); // Return the modified string
    }

    public static void main(String[] args) {
        // Test cases

        // Basic test case: should return "()()()"
        System.out.println(removeOuterParentheses("(()())(())")); // Output: "()()()"

        // Test case with multiple primitive groups: should return "()()()()(())"
        System.out.println(removeOuterParentheses("(()())(())(()(()))")); // Output: "()()()()(())"

        // Test case with a single primitive group: should return ""
        System.out.println(removeOuterParentheses("()()")); // Output: ""

        // Edge case: Single primitive group with nested parentheses
        System.out.println(removeOuterParentheses("(())")); // Output: "()"

        // Edge case: Empty string input
        System.out.println(removeOuterParentheses("")); // Output: ""

        // Edge case: Large input with repeated patterns
        System.out.println(removeOuterParentheses("(()(()))(()(()))(()(()))")); // Output: "()(())()(())()(())"
    }
}

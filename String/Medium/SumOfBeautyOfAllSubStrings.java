public class SumOfBeautyOfAllSubStrings {

    // Function to calculate the beauty sum of all substrings of the given string.
    public static int beautySum(String s) {
        // Variable to hold the final beauty sum
        int ans = 0;

        // Loop through each possible starting index of a substring
        for (int i = 0; i < s.length(); i++) {
            // Array to store the frequency of each character in the substring
            int[] freq = new int[26];

            // Loop through each possible ending index of a substring (j >= i)
            for (int j = i; j < s.length(); j++) {
                // Variables to track the max and min frequency of characters in the current substring
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                // Update the frequency of the character at position j
                freq[s.charAt(j) - 'a']++;

                // Calculate the max and min frequency among the characters in the current window
                for (int ele : freq) {
                    // Only consider non-zero frequencies
                    if (ele > 0) {
                        max = Math.max(ele, max);  // Update max frequency
                        min = Math.min(ele, min);  // Update min frequency
                    }
                }

                // Add the beauty (max - min) of the current substring to the total answer
                ans += (max - min);
            }
        }

        // Return the final beauty sum of all substrings
        return ans;
    }

    public static void main(String[] args) {
        // Test case 1: Test on string "aabcb"
        System.out.println("Beauty of 'aabcb' is: " + beautySum("aabcb"));  // Expected output: 6

        // Test case 2: Test on string "abc"
        System.out.println("Beauty of 'abc' is: " + beautySum("abc"));      // Expected output: 4

        // Test case 3: Test on string with repeating characters "aaaa"
        System.out.println("Beauty of 'aaaa' is: " + beautySum("aaaa"));    // Expected output: 12

        // Test case 4: Test on string with only one character "z"
        System.out.println("Beauty of 'z' is: " + beautySum("z"));          // Expected output: 0

        // Test case 5: Test on an empty string
        System.out.println("Beauty of '' is: " + beautySum(""));            // Expected output: 0
    }
}

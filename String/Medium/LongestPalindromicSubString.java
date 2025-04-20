class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            // For odd-length palindromes
            String oddPalindrome = expandFromCenter(s, i, i);
            if (oddPalindrome.length() > result.length()) {
                result = oddPalindrome;
            }
            
            // For even-length palindromes
            String evenPalindrome = expandFromCenter(s, i, i + 1);
            if (evenPalindrome.length() > result.length()) {
                result = evenPalindrome;
            }
        }
        
        return result;
    }

    // Helper function to expand the palindrome from the center
    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        // The palindrome is between indices left + 1 and right - 1
        return s.substring(left + 1, right);
    }
}

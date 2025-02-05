public class RomanToInteger {

    // Method to get the integer value of a given Roman numeral character
    public static int getVal(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Return 0 for invalid characters
        }
    }

    // Method to convert a Roman numeral string to an integer
    public static int romanToInt(String s) {
        int n = s.length(); // Get the length of the string
        int sum = 0; // Variable to store the final integer value

        // Iterate through the Roman numeral string
        for(int i = 0; i < n; i++) {
            char ch1 = s.charAt(i); // Get the current character

            // If the next character has a higher value, subtract the current value
            if((i + 1) < n && getVal(ch1) < getVal(s.charAt(i + 1))) {
                sum -= getVal(ch1);
            } else {
                // Otherwise, simply add the current value
                sum += getVal(ch1);
            }
        }
        return sum; // Return the final integer value
    }

    public static void main(String[] args) {
        String s = "LVIII"; // Input Roman numeral string
        System.out.println(romanToInt(s)); // Convert and print the integer equivalent
    }
}

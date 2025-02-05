class LongestPalindromicSubString{

    public static String longestPalindrome(String s) {
        String result = "";
        if(s.length() == 1 ) return s;
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            String temp = "";
            if(checkPalindrome(s, low, high)){
                temp = s.substring(low, high+1);
                if(temp.length() > result.length()) result = temp;
            }
            if(low%2 == 0) low++;
            else high--;
        }

        return result;
    }

    public static boolean checkPalindrome(String s, int low, int high){
        while(low<high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("cbbd"));
    }
}
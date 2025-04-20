class LongestPalindromicSubString{

    public static String longestPalindrome(String s) {
        String result = "";
        if(s.length() == 1 ) return s;
        
        // brute force approach: O(n2)
        // for(int i=0; i<s.length(); i++){
        //     for (int j = i+1; j < s.length()-1; j++) {
        //         if(checkPalindrome(s, i, j)){
        //             int length = j - i + 1;
        //             if(length > result.length()){
        //                 for(int k=i; k<=j; k++){
        //                     result += s.charAt(k);
        //                 }
        //             }
        //         }
        //     }
        // }
        int n = s.length();
        int mid1 = n % 2 == 0 ? (n / 2) -1 : n / 2;
        int mid2 = n / 2;

        while(mid1<=mid2 && mid1>=0 && mid2<n){
            if(checkPalindrome(s, mid1, mid2)){
                result = s.substring(mid1, mid2+1);
            }
            mid1--;
            mid2++;
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
        System.out.println(longestPalindrome("baba"));
    }
}
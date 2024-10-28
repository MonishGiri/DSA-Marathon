package Easy;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};

        int i = 0;
        int j = arr.length-1;
        boolean palindrome = true;
        while(i<j){
            if(arr[i] != arr[j]) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(palindrome) System.out.println("Palindrome array");
        else System.out.println("Not Palindrome");
    }
}

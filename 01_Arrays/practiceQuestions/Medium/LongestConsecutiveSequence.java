package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequence {
    public static int consecutiveSequence(int[] arr){
        int result = Integer.MIN_VALUE;
        
        Arrays.sort(arr);

        int i = 0;
        int j = -1;
        while(i<arr.length-1){
            int difference = arr[i+1] - arr[i];
            // System.out.println("Difference is: "+difference);
            if(difference == 1){
                if(j == -1) j = i;
            }
            else if(difference > 1){
                if(j!= -1) j = -1;
                result = Math.max(result, i - j - 1);
                System.out.println("Result is: "+result);
            }
            i++;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};

        System.out.println("Result is: "+consecutiveSequence(arr));
    }
}

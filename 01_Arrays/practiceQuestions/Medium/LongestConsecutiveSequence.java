package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static boolean linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) return true;
        }
        return false;
    }
    public static int consecutiveSequence(int[] arr){
        int longest = 1;
        int n = arr.length;

        // Brute Force Approach - T.C : O(n2)
        // for(int i=0; i<n; i++){
        //     int x = arr[i];
        //     int cnt = 1;

        //     while(linearSearch(arr, x+1)){
        //         x += 1;
        //         cnt += 1;
        //     } 
        //     longest = Math.max(longest, cnt);
        // }

        // Better Approach : T.C. - O(nlogn)
        // Arrays.sort(arr);
        // int lastSmaller = Integer.MIN_VALUE;
        // int countCurrent = 0;

        // for(int i=0; i<n; i++){
        //     if(arr[i] -1 == lastSmaller){
        //         countCurrent += 1;
        //         lastSmaller = arr[i];
        //     }
        //     else if(arr[i] != lastSmaller){
        //         countCurrent = 1;
        //         lastSmaller = arr[i];
        //     }

        //     longest = Math.max(longest,countCurrent);
        // }

        // Optimal Approach : T.C. - O(n)
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }

        for(int it: set){
            if(!set.contains(it - 1)){
                int cnt = 1;
                int x = it;

                while(set.contains(x + 1)){
                    x += 1;
                    cnt += 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,1};

        System.out.println("Result is: "+consecutiveSequence(arr));
    }
}

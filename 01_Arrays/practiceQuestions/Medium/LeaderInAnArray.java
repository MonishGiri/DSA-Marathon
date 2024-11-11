package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};

         List<Integer> res = leaders(arr);

        for(int ele: res) System.out.print(ele+" ");
    }

    private static List<Integer> leaders(int[] arr) {
        List<Integer> res = new ArrayList<>();

        // Brute force approach O(n2)
        // for(int i=0; i<arr.length; i++){
        //     boolean greater = true;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i] < arr[j]){
        //             greater = false;
        //             break;
        //         }
        //     }
        //     if(greater){
        //         System.out.println("Adding greater" + arr[i]);
        //         res.add(arr[i]);
        //     }
        // }

        // Optimal Approach O(n)
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] >= max){
                res.add(arr[i]);
                max = arr[i];
            } 
        }

        Collections.sort(res);

        return res;
    }
        
            
}

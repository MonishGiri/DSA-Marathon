package Medium;

import java.util.Map;
import java.util.HashMap;

public class CountSubArraysWithSumK {
    public static int subArraySum(int[] arr, int k){
        int n = arr.length;
        if(n == 0) return 0;
        int count = 0;

        Map<Integer,Integer> map = new HashMap<>();

        int preSum = 0;

        map.put(0,1);

        for(int i=0; i<n; i++){
            preSum += arr[i];

            int remove = preSum - k;

            count += map.getOrDefault(remove,0);

            map.put(preSum,map.getOrDefault(preSum,0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println("SubArrays with sum "+k+" is: "+subArraySum(arr, k));
    }
}

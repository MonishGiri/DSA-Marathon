package Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] arr){
        int majorityEle = 0;

        // Brute Force Approach
        // int eleCount = 0;
        // for(int i=0; i<arr.length; i++){
        //     int count = 0;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i] == arr[j]) count++;
        //     }
        //     if(count > eleCount) majorityEle = arr[i];
        // }

        // Better Approach using HashMap
        // Map<Integer, Integer> hashmap = new HashMap<>();
        // for(int i=0; i<arr.length; i++){
        //     int value = hashmap.getOrDefault(arr[i], 0);
        //     hashmap.put(arr[i], value + 1);
        // }

        // for(int i=0; i<arr.length; i++){
        //     if(hashmap.get(arr[i]) > arr.length / 2) {
        //         majorityEle = arr[i];
        //         break;
        //     }
        // }

        // Optimal Approach : Moore's Voting Algorithm
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                majorityEle = arr[i];
                count = 1;
            } 
            else if(majorityEle != arr[i]) count --;
            else count++;
        }

        return majorityEle;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,2,2,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3,3};
        System.out.println("Majority Element is: "+majorityElement(arr));
    }
}

package Easy;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        Set<Integer> set = new HashSet<>();

        int i = 0; 
        int j = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                set.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                set.add(arr2[j]);
                j++;
            }
        }

        if(i == arr1.length){
            while(j < arr2.length){
                set.add(arr2[j]);
                j++;
            }
        }
        else if(j == arr2.length){
            while(i < arr1.length){
                set.add(arr1[i]);
                i++;
            }
        }

        for(int ele: set){
            System.out.print(ele+" ");
        }
    }
}

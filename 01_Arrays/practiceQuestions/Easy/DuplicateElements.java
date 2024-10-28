package Easy;

import java.util.*;
public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,2,1,6};
        int[] map = new int[11]; // Assuming the elements in the array is from 0 to 10 : Creating a hashmap
        List<Integer> list = new ArrayList<>();
        Arrays.fill(map, 0);
        for(int i=0; i<arr.length; i++){
            map[arr[i]] ++;
        }

        for(int i=0; i<map.length; i++){
            if(map[i] > 1) list.add(i);
        }

        for(int ele: list) System.out.print(ele+" ");
    }
}

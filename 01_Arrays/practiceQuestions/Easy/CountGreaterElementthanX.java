package Easy;
import java.util.*;
public class CountGreaterElementthanX {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,8,10,84};
        int x = 8;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] > x) list.add(arr[i]);
        }

        for(int ele: list) System.out.print(ele+" ");
    }
}

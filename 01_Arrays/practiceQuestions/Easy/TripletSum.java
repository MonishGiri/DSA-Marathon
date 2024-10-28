package Easy;
import java.util.*;
public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,-1,-4};
        Set<List<Integer>> st = new HashSet<>();
        
       
        // Brute force: n3
        // for(int i = 0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         for(int k = j+1; k<arr.length; k++){
        //             if(arr[i] + arr[j]+ arr[k] == sum){
                        // List<Integer> list = new ArrayList<>();
                        // list.addAll(Arrays.asList(arr[i],arr[j],arr[k]));
                        // Collections.sort(list);
                        // st.add(list);
        //             } 
        //         }
        //     }
        // }
        
        // Method 2 Better
        // for(int i=0; i<arr.length; i++){
        //     Set<Integer> hashSet = new HashSet<>();
        //     for(int j=i+1; j<arr.length; j++){
        //         int third = -(arr[i] + arr[j]);
        //         if(hashSet.contains(third)){
        //             List<Integer> list = new ArrayList<>();
        //             list.addAll(Arrays.asList(arr[i],arr[j],third));
        //             Collections.sort(list);
        //             st.add(list);
        //         }
        //         hashSet.add(arr[j]);
        //     }
        // }

        // List<List<Integer>> ans = new ArrayList<>(st);

        // Method3 : Optimal Solution

        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int j = i + 1;
            int k = arr.length - 1;

            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> list = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
                    ans.add(list);
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1] ) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }

        for(List<Integer> list : ans){
            System.out.print(list+" ");
        }
        System.out.println("Number of triplets are: "+(ans.size()));
    }
}

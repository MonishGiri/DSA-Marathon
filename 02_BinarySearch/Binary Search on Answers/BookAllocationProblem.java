import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookAllocationProblem {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(m > n) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i=0; i<arr.size(); i++){
            low = Math.max(low, arr.get(i));
            high += arr.get(i);
        }
        // Brute Force
        // for(int i=low; i<=high; i++){
        //     if(isPosibleToAllocatePages(arr, n, i) == m) return i;
        // }
        // return - 1;

        while(low<=high){
            int mid = low + (high-low) / 2;
            if(isPosibleToAllocatePages(arr, n, mid) > m) low = mid + 1; 
            else high = mid - 1;
        }
        return low;
    }

    public static int isPosibleToAllocatePages(ArrayList<Integer> arr, int n, int pagesAllowed){
        int cntStudent = 1;
        int sum = arr.get(0);

        int i = 1;
        while(i<n){
            sum += arr.get(i);
            if(sum > pagesAllowed){
                cntStudent++;
                sum = arr.get(i);
            }
            i++;
        }
        System.out.println("Page allowed "+pagesAllowed+" Student count "+cntStudent);
        return cntStudent;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;

        System.out.println("pages: "+findPages(arr, n, m));
    }
}

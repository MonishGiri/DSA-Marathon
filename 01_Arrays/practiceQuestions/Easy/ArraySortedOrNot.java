package Easy;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2,5,8,9,110,21};
        boolean sorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) sorted = false;
        }
 
        if(sorted) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}

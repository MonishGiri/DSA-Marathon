package Easy;

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) {
                System.out.println("Target found at index: "+i);
                break;
            }
        }
    }
}
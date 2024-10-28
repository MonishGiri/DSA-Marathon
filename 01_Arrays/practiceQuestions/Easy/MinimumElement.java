package Easy;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {2,4,7,1};

        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Minimum is: "+min);
    }
}

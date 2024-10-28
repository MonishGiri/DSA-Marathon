package Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,3};
        int max = Integer.MIN_VALUE;
        int secondlargest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondlargest = max;
                max = arr[i];
            }
        }
        System.out.println("Second largest Number is: "+secondlargest);
    }
}
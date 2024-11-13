package Medium;

public class CountSubArraysWithSumK {
    public static int subArraySum(int[] arr, int k){
        int n = arr.length;
        if(n == 0) return 0;
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            // int difference = k - sum;
            if(arr[i] == k) {
                System.out.println("hello");
                count++;
            }
            sum += arr[i];
            System.out.println("Sum is: "+sum+" i: "+i);
            if(sum == k){
                count++;
                sum = 0;
                i--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println("SubArrays with sum "+k+" is: "+subArraySum(arr, k));
    }
}

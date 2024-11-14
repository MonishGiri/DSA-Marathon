
public class LowerBound {
    public static int findLowerBound(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int lb = n;

        while(low<=high){
            int mid = (low+high) / 2;
            if(arr[mid] >= target){
                lb = Math.min(lb, mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return lb;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70,80,90};
        int target = 5;
        System.out.println("Lower Bound of: "+target+" is: "+findLowerBound(arr, target));
    }
}

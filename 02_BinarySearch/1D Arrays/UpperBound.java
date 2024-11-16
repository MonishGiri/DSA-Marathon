public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int target = 55;

        System.out.println("Upper bound of "+target+" is: "+findUpperBound(arr, target));
            }
        
            private static int findUpperBound(int[] arr, int target) {
                int n = arr.length;
                int low = 0;
                int high = n - 1;
                int ub = n;

                while(low<=high){
                    int mid = (low+high) / 2;
                    if(arr[mid] > target){
                        ub = Math.min(mid, ub);
                        high = mid - 1;
                    }
                    else low = mid + 1;
                }
                return ub;
            }
}

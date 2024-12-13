//You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.
public class NthSquareRoot {
    public static int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        
        while(low<=high){
            int mid = (low+high) / 2;
            // computing the val by calculating the mid to the power n
            int val = (int)Math.pow(mid,n);
            // if val equal to mid return that index that is mid
            if(val == m) return mid; 
            // if val is smaller than m then ans is on the right side so increase low
            else if(val < m){
                low = mid + 1;
                
            } 
            // else decrese high
            else high = mid - 1;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int n = 2;
        int m = 9;
        System.out.println("Root of: "+nthRoot(n, m));
    }
}

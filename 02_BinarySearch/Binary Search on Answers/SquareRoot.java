
public class SquareRoot {
    public static int findFloorSquareRoot(int n){
        int low = 1, high = n;
        //Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(n)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
    }
    public static void main(String[] args) {
        System.out.println("Square Root is: "+findFloorSquareRoot(25));
    }
}

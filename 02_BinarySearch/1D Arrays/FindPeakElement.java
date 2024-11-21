public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;
        int low = 1;
        int high = n - 2;
        
        while(low<=high){
            int mid = low + (high - low) / 2;
            // for every mid element check if it is greater than the element both the side, 
            // if it is then return the mid  
            if(arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) return mid;

            // if the element previous element than mid is greater than eliminate the righthalf
            if(arr[mid - 1] > arr[mid]) high = mid - 1;

            // eliminate the left half
            else low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println("Peak Element index is: "+findPeakElement(arr));
    }
}

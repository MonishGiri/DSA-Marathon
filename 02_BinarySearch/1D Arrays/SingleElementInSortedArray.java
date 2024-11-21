public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int low = 1;
        int high = n - 2;

        while(low<=high){
            int mid = low + (high - low) / 2;
            // if the previous or the next element is not equal to arr[mid] then that   element       is the single element
            if(arr[mid - 1] != arr[mid] && arr[mid+1] != arr[mid]) return arr[mid];

            // we we are at odd index and arr[mid] == arr[mid-1] or we at even index and the next element to the mid is equal to the mid element then reduce the search space and eliminate the left half
            else if((mid % 2 == 1 && arr[mid] == arr[mid-1]) || (mid % 2 == 0 && arr[mid] ==            arr[mid + 1])) 
            low = mid + 1;

            // if the above cases doesn't match eliminate the right half
            else high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println("Single element is: "+singleNonDuplicate(arr));
    }
}

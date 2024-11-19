public class FirstAndLastOccurence {
    public static void findOccurence(int[] arr, int target){
        int n = arr.length;

        int low = 0;
        int high = n-1;
        int firstOccurence = Integer.MAX_VALUE;
        int lastOccurence = Integer.MIN_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                firstOccurence = Math.min(firstOccurence, mid);
                lastOccurence = Math.max(mid, lastOccurence);
                if(firstOccurence == mid)
                high = mid - 1;
                else low = mid + 1;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        low = 0;
        high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                lastOccurence = Math.max(mid, lastOccurence);
                low = mid + 1;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        System.out.println("First Occurence: "+firstOccurence+" last occurence: "+lastOccurence);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int target = 13;

        findOccurence(arr, target);
    }
}

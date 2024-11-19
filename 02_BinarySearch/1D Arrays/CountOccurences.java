public class CountOccurences {
    public static int firstOccurence(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int firstOccurence = Integer.MAX_VALUE;
        int lastOccurence = Integer.MIN_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                firstOccurence = Math.min(firstOccurence, mid);
                high = mid - 1;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return firstOccurence;
    }
    public static int lastOccurence(int[] arr, int target){
        int n = arr.length;
        int lastOccurence = Integer.MIN_VALUE;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                lastOccurence = Math.max(mid, lastOccurence);
                low = mid + 1;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return lastOccurence;

    }
    public static int countOccurence(int[] arr, int target){
        int fO = firstOccurence(arr, target);
        int lO = lastOccurence(arr, target);
        int count = (lO-fO) + 1;

        return count;

    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,3,3,4};
        int target = 3;
        System.out.println("Occurence of "+target+" is: "+countOccurence(arr, target));
    }
}

package Easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};

        int i = 0;
        int maxCount = 0;
        int count = 0;

        while(i<arr.length){
            if(arr[i] == 1){
                count++;
            }
            else{
                count = 0;
            } 
            i++;
            maxCount = Math.max(maxCount, count);
        }

        System.out.println("Maximum ones count is: "+maxCount);
    }
}

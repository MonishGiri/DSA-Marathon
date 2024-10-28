package Easy;

public class LargestThreeElements {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,3,10,14,7};

        int fistLargest = 0, secondLargest = 0, thirdLargest = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > fistLargest){
                thirdLargest = secondLargest;
                secondLargest = fistLargest;
                fistLargest = arr[i];
            }
        }

        System.out.println("Fist: "+fistLargest+" Second: "+secondLargest+" ThirdLargest: "+thirdLargest);
    }
}

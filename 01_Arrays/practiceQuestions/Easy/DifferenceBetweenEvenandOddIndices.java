package Easy;

public class DifferenceBetweenEvenandOddIndices {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};

        int evenSum = 0, oddSum = 0;

        for(int i=0; i<arr.length; i++){
            if(i%2 == 0) evenSum += arr[i];
            else oddSum += arr[i];
        }

        System.out.println("Difference between even and odd indices is: "+(evenSum - oddSum));
    }
}

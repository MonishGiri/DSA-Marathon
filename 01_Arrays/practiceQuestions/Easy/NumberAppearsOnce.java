package Easy;
public class NumberAppearsOnce {
    public static int numberAppearsOnce(int[] arr){
        // Brute force
        // for(int i=0; i<arr.length; i++){
        //     int count = 0;
        //     int num = arr[i];

        //     for(int j=0; j<arr.length; j++){
        //         if(arr[j] == num) count++;
        //     }
        //     if(count == 1) return num;
        // }
        // return -1;

        // Better approach is using hashing

        // Optimal Approach: xor of same number -> 0, xor of a number with 0 -> number itself
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor ^= i;
        }
        return xor;
    }
    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2};

        // Brute Force Approach
        System.out.println("Number that appears once is: "+numberAppearsOnce(arr));
    }
}

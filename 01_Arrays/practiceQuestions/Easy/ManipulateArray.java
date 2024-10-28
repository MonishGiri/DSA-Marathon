package Easy;

public class ManipulateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};

        for(int i=0; i<arr.length; i++){
            if(i % 2 != 0){
                arr[i] += arr[i];
            }
            else arr[i] += 10;
        }

        for(int ele: arr) System.out.print(ele+" ");
    }
}

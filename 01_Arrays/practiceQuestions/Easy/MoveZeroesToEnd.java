package Easy;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        int nonZeroIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for(int i=nonZeroIndex; i<arr.length; i++){
            arr[i] = 0;
        }

        for(int ele: arr) System.out.print(ele + " ");
    }
}

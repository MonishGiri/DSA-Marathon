public class ReverseArray {

    public static void reverse(int i, int j, int[] arr){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int i = 0; 
        int j = arr.length - 1;

        while(i<j){
            reverse(i, j, arr);
            i++;
            j--;
        }

        for(int ele: arr) System.out.print(ele + " ");
    }
}

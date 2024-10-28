package Easy;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,2,2};

        int i = 0;
        int j = 0;
        int count = 0;
        while(i<arr.length && j<arr.length){
            if(arr[i] == arr[j]){
                j++;
            }
            else {
                count++;
                arr[i+1] = arr[j];
                i++;
                j++;
            }
        }

        for(int ele: arr) System.out.print(ele+" ");
        System.out.println("Elements are "+count);
    }
}

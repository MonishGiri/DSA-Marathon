package Easy;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,4,6};
        int[] arr2 = {2,6,7,9};
        int[] ans = new int[arr1.length+arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else if(arr1[i] > arr2[j]) {
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }

        if(i == arr1.length){
            while(j < arr2.length){
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        else if(j == arr2.length){
            while(i < arr1.length){
                ans[k] = arr1[i];
                k++;
                i++;
            }
        }

        for(int ele: ans) System.out.print(ele+" ");
    }
}

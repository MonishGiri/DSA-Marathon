public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,0};
        int[] arr2 = {2};
        int[] ans = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int count = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]) {
                ans[count] = arr1[i];
                System.out.println("i "+i);
                i++;
                count++;
            }
            else if(arr1[i] > arr2[j]){
                ans[count] = arr2[j];
                System.out.println("j "+j);
                j++;
                count++;
            } 
        }

        if(i == arr1.length ){
            while (j<arr2.length) {
                ans[count] = arr2[j];
                j++;
                count++;
            }
        }

        else if(j == arr2.length){
            System.out.println("Transfering values");
            while (i<arr1.length) {
                ans[count] = arr1[i];
                i++;
                count++;
            }
        }
        for(int ele: ans) System.out.print(ele + " ");
    }
}

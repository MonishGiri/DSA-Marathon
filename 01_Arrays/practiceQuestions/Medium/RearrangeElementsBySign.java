package Medium;

import java.util.Arrays;

public class RearrangeElementsBySign {
    public static void rearrangeElements(int[] arr){

        int n = arr.length;

        // Brute Force 
        // int[] pos = new int[n/2];
        // int[] neg = new int[n/2];
        
        // int j = 0;
        // int k = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i] > 0) pos[j++] = arr[i];
        //     else neg[k++] = arr[i];
        // }

        // int i = 0;
        // j = 0;


        // while(i < arr.length && j<pos.length){
        //     if(i % 2 == 0)  arr[i] = pos[j++];
        //     i++;
        // }

        // i = 0;
        // j = 0;

        // while(i < arr.length && j<neg.length){
        //     if(i % 2 != 0) arr[i] = neg[j++];
        //     i++;
        // }

        // Optimal Method

        int i = 0;
        int posIndex = 0;
        int negIndex = 1;

        int[] result = new int[n];
        while(i < n){
            if(arr[i] > 0 && posIndex < n){
                System.out.println("Positive");
                result[posIndex] = arr[i];
                posIndex += 2;
            }
            else if(arr[i] < 0 && negIndex < n){
                System.out.println("Negative");
                result[negIndex] = arr[i];
                negIndex += 2;
            }
            i++;
        }

        for(int ele: result) System.out.print(ele+" ");
    }
    public static void main(String[] args) {
        int[] arr = {-1,1};
        rearrangeElements(arr);
        // for(int ele: arr) System.out.print(ele+" ");
    }
}

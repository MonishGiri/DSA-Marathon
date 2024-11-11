public class Transpose {
    
    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};


        // Column wise printing
        // for(int i=0; i<arr[0].length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         System.out.print(arr[j][i]+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int[] item: arr){
            for(int ele: item){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}

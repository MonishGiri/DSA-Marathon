public class RotateMatrixBy90Degree {
    public static void print(int[][] arr){
        for(int[] item: arr){
            for(int ele: item){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        int n = arr.length;
        int m = arr[0].length;

        print(arr);
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);

        for(int i=0; i<m; i++){
            int low = 0, high = m - 1;

            while(low<high){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }

        print(arr);
    }
}

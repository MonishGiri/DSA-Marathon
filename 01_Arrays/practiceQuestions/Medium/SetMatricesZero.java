package Medium;

public class SetMatricesZero {
    public static void setZeroes(int[][] arr){

        // Brute force Approach - S.C. : O(mn) 
        int m = arr.length;
        int n = arr[0].length;  
        // int[][] helper = new int[m][n];

        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         helper[i][j] = arr[i][j];
        //     }
        // }

        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(helper[i][j] == 0){
        //             int row = i;
        //             int col = 0;
        //             while(col<n){
        //                 arr[row][col] = 0;
        //                 col++;
        //             }
                    
        //             col = j;
        //             row = 0;
        //             while(row<m){
        //                 arr[row][col] = 0;
        //                 row++;
        //             }
        //         }
        //     }
        // }

        // Better Approach - S.C.: O(m+n)
        // boolean[] row = new boolean[m];
        // boolean[] col = new boolean[n];

        // // marking the particular row and column
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(arr[i][j] == 0){
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }

        // // set the 'true' rows to 0
        // for(int i=0; i<m; i++){
        //     if(row[i] == true){
        //         for(int j=0; j<n; j++){
        //             arr[i][j] = 0;
        //         }
        //     }
        // }

        // // set the 'true' columns to 0
        // for(int j=0; j<n; j++){
        //     if(col[j] == true){
        //         for(int i=0; i<m; i++){
        //             arr[i][j] = 0;
        //         }
        //     }
        // }

        // Optimal Approach : Using constant extra space
        boolean zeroRow = false;
        boolean zeroCol = false;

        // Mark if previously the array has 0 in the 0th row and col

        // check to 0th row
        for(int j=0; j<n; j++){
            if(arr[0][j] == 0){
                zeroRow = true;
                break;
            }
        }

        // check the 0th column
        for(int i=0; i<m; i++){
            if(arr[i][0] == 0){
                zeroCol = true;
                break;
            }
        }

        // traverse in the submatrix without 0th row and 0th col
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }

        // traverse the 0th column
        for(int i=1; i<m; i++){
            if(arr[i][0] == 0){
                int j = 1;
                while(j<n){
                    arr[i][j] = 0;
                    j++;
                }
            }
        }

        // traverse the 0th row
        for(int j=1; j<n; j++){
            if(arr[0][j] == 0){
                int i = 1;
                while(i<m){
                    arr[i][j] = 0;
                    i++;
                }
            }
        }

        if(zeroRow){ // set the 0th row to 0
            for(int j=0; j<n; j++){
                arr[0][j] = 0;
            }
        }

        if(zeroCol){ // set the 0th Column to 0
            for(int i=0; i<m; i++){
                arr[i][0] = 0;
            }
        }

    }
    
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
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};  
        setZeroes(arr);
        print(arr);
    }
}

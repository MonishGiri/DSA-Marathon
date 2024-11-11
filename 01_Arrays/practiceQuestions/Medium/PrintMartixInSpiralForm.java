public class PrintMartixInSpiralForm {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        int m = arr.length;
        int n = arr[0].length;

        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;

        while(minr<=maxr && minc<=maxc){
            
            // left to right
            for(int i=minc; i<=maxc; i++){
                System.out.print(arr[minr][i]+" ");
            }
            minr++;

            //top to bottom
            if(minr>maxr || minc>maxc) break;
            for(int i=minr; i<=maxr; i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;

            // right to left
            if(minr>maxr || minc>maxc) break;
            for(int i=maxc; i>=minc; i--){
                System.out.print(arr[maxr][i]+" ");
            }
            maxr--;

            //bottom to top
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr; i>=minr; i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
            
        }
    }
}

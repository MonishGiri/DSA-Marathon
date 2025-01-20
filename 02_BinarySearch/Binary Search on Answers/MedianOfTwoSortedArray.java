public class MedianOfTwoSortedArray {

    // Better approach
    public static double median(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        int ele2Idx = (n+m) / 2;
        int ele1Idx = ((n+m) / 2) - 1;

        double ele1 = 0;
        double ele2 = 0;

        int i = 0;
        int j = 0;
        int eleCount = 0;

        while(i<n && j<m){
            System.out.println("eleCount "+eleCount);
            if(a[i] <= b[j]){
                if(eleCount == ele1Idx){
                    ele1 = a[i];
                }
                else if(eleCount == ele2Idx){
                    ele2 = a[i];
                }
                i++;
            }
            else{
                if(eleCount == ele1Idx){
                    ele1 = b[j];
                }
                else if(eleCount == ele2Idx){
                    ele2 = b[j];
                }
                j++;
            }
            eleCount++;
        }

        while(i<n) {
            System.out.println("Ele count in a: "+eleCount);
            if(eleCount == ele1Idx){
                ele1 = a[i];
            }
            else if(eleCount == ele2Idx){
                ele2 = a[i];
            }
            eleCount++;
            i++;
        }

        while(j<m){
            System.out.println("Ele count in b: "+eleCount);
            if(eleCount == ele1Idx){
                ele1 = b[j];
            }
            else if(eleCount == ele2Idx){
                ele2 = b[j];
            }
            eleCount++;
            j++;
        }

        System.out.println("Ele1: "+ele1+" and Ele2: "+ele2);
        
        return ((n+m) % 2 == 0) ?  (ele1+ele2)/2 :  ele2;
    }
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {1,1};

        System.out.println("Median is: "+median(a, b));
    }
}

public class KthElementOfTwoSortedArray {
    public static int KthElement(int[] a, int[] b, int k){
        int n1 = a.length;
        int n2 = b.length;
        if(n1 > n2) return KthElement(b,a,k);

        int low = Math.max(0,k-n2), high = Math.min(k, n1);

        while(low<=high){
            int cut1 = (low+high) / 2;
            int cut2 = k - cut1;
            
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : a[cut1-1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : b[cut2-1];
            int r1 = cut1 == n1 ? Integer.MAX_VALUE : a[cut1];
            int r2 = cut2 == n2 ? Integer.MAX_VALUE : b[cut2];
            
            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }
            else if(l1 > r2) high = cut1 - 1;
            else low = cut1 + 1;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 8;
        System.out.println(k+"th element is: "+KthElement(a, b, k));
    }
}

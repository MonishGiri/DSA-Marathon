public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = max(piles);
        System.out.println("high: "+high);

        while(low<=high){
            int mid = (high - low) + low / 2;
            int totalTime = totalTime(mid, piles);
            if(totalTime<= h){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low;
    }
    public static int totalTime(int bananasPerHour, int[] piles){
        int totalTime = 0;
        for(int i=0; i<piles.length; i++){
            totalTime += Math.ceil((double)piles[i] / (double)bananasPerHour);
            
        }
        return totalTime;
    }
    public static int max(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println("No. of bananas per hour "+minEatingSpeed(piles, h));
    }
}

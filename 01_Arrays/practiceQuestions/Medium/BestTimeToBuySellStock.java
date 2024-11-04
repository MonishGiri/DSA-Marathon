package Medium;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int maxPro = 0;

        //Brute Force Approach
        // for(int i=0; i<prices.length; i++){
        //     for(int j=i+1; j<prices.length; j++){
        //         if(prices[j] > prices[i]){
        //             System.out.println(maxPro);
        //             maxPro = Math.max(maxPro, prices[j] - prices[i]);
        //         }
        //     }
        // }

        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] = minPrice);
        }
        return maxPro;
        
    }
    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println("Profit is: "+maxProfit(prices));
    }
}

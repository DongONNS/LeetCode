package letecodePractice;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,4,5};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int i = 0;
        int peak = prices[0];
        int valey = prices[0];
        int maxProfit = 0;
        while(i < prices.length-1){
            while(i < prices.length-1 && prices[i] >= prices[i+1] ){
                i++;
            }
            valey = prices[i];
            while(i < prices.length - 1 && prices[i] <= prices[i+1]){
                i++;
            }
            peak = prices[i];
            maxProfit += (peak - valey);
        }
        return maxProfit;
    }
//    public static int maxProfit(int[] prices){
//        int result = calculate(prices, 0);
//        return result;
//    }

    public static int calculate(int[] prices,int s){
        if (s >= prices.length) return 0;
        int max = 0;
        for (int i = s;i < prices.length;i++){
            int maxProfit = 0;
            for (int j = i+1;j < prices.length;j++){
                int profit = 0;
                if (prices[j] > prices[i]){
                    profit = calculate(prices,j+1) + prices[j] - prices[i];
                    if (profit > maxProfit) maxProfit = profit;
                }
            }
            if (maxProfit > max) max = maxProfit;
        }
        return max;
    }
}

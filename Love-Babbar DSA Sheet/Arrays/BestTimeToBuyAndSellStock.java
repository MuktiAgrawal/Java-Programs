public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int i=0,j=1,profit=0;
        while(i<prices.length-1 && j<prices.length){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[j]-min>profit){
                profit=prices[j]-min;
            }
            i++;
            j++;
        }
        return profit;
    }
}
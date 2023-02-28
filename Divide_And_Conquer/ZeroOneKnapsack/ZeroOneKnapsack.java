public class ZeroOneKnapsack {
    private int zeroOneKnapsack(int[] profits,int[] weights,int capacity,int currentIndex){
        if(currentIndex<0 || capacity<=0 || currentIndex>=profits.length){
            return 0;
        }
        int profit1=0;
        int profit2=0;
        if(weights[currentIndex]<=capacity){
            profit1=profits[currentIndex]+zeroOneKnapsack(profits, weights, capacity-weights[currentIndex], currentIndex+1);
            profit2=zeroOneKnapsack(profits, weights, capacity, currentIndex+1);
        }
        return Math.max(profit1,profit2);
    }
    public int zeroOneKnapSack(int[] profits,int weights[],int capacity){
        return zeroOneKnapsack(profits, weights, capacity, 0);
    }
}

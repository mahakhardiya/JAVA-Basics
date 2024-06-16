//You are given an array prices where prices[i] is the price of the given stock
// on the ith day. You want to maixmize your profit by choosing a single day to
// buy one stock and choosing a different day in the future to sell that stock
// Return the maximum profit you can achieve from this transaction. If you
// cannot achieve any profit, return 0.

//profit = selling price - buying price

public class stock {
    public static int buyAndSellStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){ //profit
                int profit = price[i] - buyPrice; //todays profit
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = price[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4}; //O(n)
        System.out.println(buyAndSellStocks(prices));    
    }
}

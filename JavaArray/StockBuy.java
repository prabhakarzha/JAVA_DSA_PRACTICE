import java.util.*;
public class StockBuy {
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i]-buyPrice;  //today profit
                maxProfit = Math.max(maxProfit , profit);

            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args){
        int prices[]= {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));

    }
    
}

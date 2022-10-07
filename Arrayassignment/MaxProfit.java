import java.util.*;
public class MaxProfit {
    public static int getMaxProfit(int prices[]){
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;


    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));

    }
    
}

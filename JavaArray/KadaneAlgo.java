import java.util.*;
public class KadaneAlgo{
    public static void KadaneAlgo(int num[]){
        int maxSum= Integer.MIN_VALUE;
        int currSum= 0;

        for(int i = 0;i<num.length;i++){
            currSum = currSum+num[i];
            if(currSum <0){
                currSum = 0;
            }
            if(currSum >maxSum){
                maxSum = currSum;
            }
            // maxSum = Math.max(currSum,maxSum);



        }
        System.out.println("max SubArray sum is : "+ maxSum);
    }
    public static void main(String args[]){
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        KadaneAlgo(num);

    }
}
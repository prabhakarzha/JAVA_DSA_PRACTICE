import java.util.*;
// package JavaArray;

public class LargestNumber {
    public static int MaxNumber( int num[]){
        // int largest =Integer.MIN_VALUE;
        int largest = 0;
        for(int i = 0;i<num.length;i++){
            if(largest<num[i]){
                largest = num[i];

            }

        }
        return largest;
        
    }

    public static void main(String args[]) {
        int num[] = {1,2,6,3,7,9};
        System.out.println(MaxNumber(num));

        
    }
    
}

import java.util.*;
public class SubarrayGivensum {
    public static void GivenSum(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==12){
                    System.out.println(i+" "+j);
                }
            }

        }
    }
    
    public static void main(String[] args){
        int nums[]={1,2,3,7,5};
        GivenSum(nums);
        

    }
}

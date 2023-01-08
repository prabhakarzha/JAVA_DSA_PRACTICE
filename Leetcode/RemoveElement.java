import java.util.*;

public class RemoveElement {
    public static int removeElement(int[] nums,int val){
        if(nums.length==0){
            return 0;
        }
        int valid_size = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[valid_size]=nums[i];
                valid_size++;
            }
        }
        return valid_size;

    }
    

    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("output is " + removeElement(nums,val));
    }
    
}

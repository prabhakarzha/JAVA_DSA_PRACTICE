import java.util.*;
public class ProblemOne {
    public static boolean Twcie(int nums[]){
        for(int i = 0; i<nums.length-1;i++){
            for(int j =i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,3,4,5,6,7};
        System.out.println(Twcie(nums));

    }
    
}

                


          

    


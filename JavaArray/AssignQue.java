import java.util.*;
public class AssignQue {
    public static int closeValue(int num[], int target){
       int n = num.length;
       int val =num[0];
       for(int i =1;i<n;i++){
        if(Math.abs(target-val)>Math.abs(target-num[i])){
            val=num[i];
       }
        
    }
    return val;
}
    public static void main(String[] args){
        int num[] ={3,5,7,8,8,116};
        int target =9;
        System.out.println(closeValue(num,target));
        


    }
}

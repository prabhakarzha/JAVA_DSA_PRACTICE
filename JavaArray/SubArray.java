import java.util.*;
public class SubArray {
    public static void printSubarray(int num[]){
        int count = 0;
        for (int i=0;i<num.length;i++){
            int start =i;
            for(int j=i;j<num.length;j++){
                int end =j;
                for(int k =start;k<=end;k++){
                    System.out.print(num[k]+" ");

                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("totalPairs : " + count);

    }
    public static void  main(String args[]){
        int num[] ={2,4,6,8,10};
        printSubarray(num);

    }
    
}

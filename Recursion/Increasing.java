import java.util.*;
public class Increasing {
    public static void printIncrease(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncrease(n-1);
        System.out.print(n+" ");


    }
    public static void main(String[] args){
        int n =5;
        printIncrease(n);

    }
    
}



//  First and Last occurrence of an Element leetcode

import java.util.*;
public class BinarySearching {
    public static int []find(int arr[], int target){
        int []ans={-1,-1};
        int start =0;
        int end = arr.length-1;
    

        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==target){
                ans[0] = mid;
                end = mid-1;
            }
            else if(arr[mid]<target){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
    }
        start =0;
        end = arr.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==target){
                ans[1] = mid;
                start= mid+1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int arr[]={2,4,10,10,10,18,20};
        int target= 10;

        int[]ans = find(arr,target);

        System.out.println(ans[0] + " " + ans[1]);

    }
    
}

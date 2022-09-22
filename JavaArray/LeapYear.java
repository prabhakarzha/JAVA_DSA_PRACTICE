// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Year : ");
        int Year = sc.nextInt();
        if(Year % 400 ==0){
            System.out.println("Leap year : ");

        }
        else{
            if(Year %4 ==0 && Year %100 ==0){
                System.out.println("Leap year : ");
            }
            else{
                System.out.println("Not a leap year");
            }
        }


    }
    
}

import java.util.Scanner;

public class LoopReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();

        String reversed = "";
        for(int i =str.length()-1;i>=0;i--) {
            reversed +=str.charAt(i);
        }
        
        System.out.println("Revrsed string : "+ reversed);
    }
    
}

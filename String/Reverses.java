import java.util.Scanner;

// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Given a string , print Yes if it is a palindrome, print No otherwise.
public class Reverses {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
         String reverse = new StringBuilder(A).reverse().toString();
    if (A.equals(reverse)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
            
            
        }

    
}



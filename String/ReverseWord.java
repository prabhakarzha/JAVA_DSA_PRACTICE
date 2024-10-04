import java.util.*;

public class ReverseWord {

  public static void main(String[] args) {
    String str = "the   Sky is    blue  ";
    String[] words = str.split(" +");
//  StringBuilder-  it creates mutable string , we have to convert array to string
    StringBuilder sb = new StringBuilder(); 
    for (int i = words.length - 1; i >= 0; i--) {
      sb.append(words[i]);
      sb.append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}

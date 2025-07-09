import java.util.*;

public class CountChar {

  public static int countNumber(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    String str = "Hello World";
    System.out.println(countNumber(str));
  }
}
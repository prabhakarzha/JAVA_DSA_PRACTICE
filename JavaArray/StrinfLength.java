public class StrinfLength {

  public static void main(String[] args) {
    String str = "prabhakar";
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      count++;
    }
    System.out.println("The total number of characters in the string " + count);
  }
}

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Val =sc.next();

        StringBuilder sb = new StringBuilder(Val);
        String rev  =sb.reverse().toString();
        System.out.println(rev);

    }
    
}



import java.util.Scanner;
public class count {
 static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        return count(n);
    }
   static int count(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + count(n / 10);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
        int n = sc.nextInt();
      System.out.println(countDigits(n));
    }
}

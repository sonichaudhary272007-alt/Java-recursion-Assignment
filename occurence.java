import java.util.Scanner;
public class occurence 
{
   static int count(String s, char c, int index) {
        if (index == s.length()) {
            return 0;
        }
      if (s.charAt(index) == c) {
            return 1 + count(s, c, index + 1);
        }

        return count(s, c, index + 1);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
      System.out.println(count(s, c, 0));
    }
}

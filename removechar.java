import java.util.Scanner;
public class removechar {
static String removeChar(String s, char c, int index) {
        if (index == s.length()) {
            return "";
        }
 if (s.charAt(index) == c) {
            return removeChar(s, c, index + 1);
        }

        return s.charAt(index) + removeChar(s, c, index + 1);
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(removeChar(s, c, 0));
    }
}


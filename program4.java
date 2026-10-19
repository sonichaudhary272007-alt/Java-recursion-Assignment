import java.util.Scanner;
public class program4 {
    static void odd(int n)
    {
        if(n==0)
        {
            return;
        }
        odd(n-1);
        if(n%2!=0)
            System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        odd(n);
    }
}

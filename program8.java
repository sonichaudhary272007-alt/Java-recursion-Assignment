import java.util.Scanner;
public class program8
{
    static int digit(int n)
    {
        if(n%10==n)
        {
            return n;
    }
    return (n%10)*digit(n/10);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println("product of digits "  + digit(n));
}
    }

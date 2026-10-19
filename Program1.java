import java.util.Scanner;
class program1
{
    static void number(int n)
    {
        if(n==0)
        {
            return;
    }
    number(n-1);
    System.out.println(n);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    number(n);
}
}
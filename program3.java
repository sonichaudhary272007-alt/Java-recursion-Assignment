import java.util.Scanner;
public class program3 {
    static void even(int n)
    {
        if(n==0)
        {
           return;
    }

even(n-1);
if(n%2==0)
    System.out.println(n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        even(n);
    }
}

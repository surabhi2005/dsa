import java.util.Scanner;
public class sumofdigitsrecursion {
    public static int sumdigits(int n)
    {
        if(n%10==n)
        return n;
        else
        return (n%10)+sumdigits(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Sum of digits:");
        System.out.println(sumdigits(n));
    }
    
}


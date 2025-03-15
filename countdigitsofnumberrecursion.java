import java.util.Scanner;
public class countdigitsofnumberrecursion {
    public static int count(int n)
    {
        if(n%10==n)
        return 1;
        else
        return 1+count(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Count of digits:");
        System.out.println(count(n));
    }
    
}

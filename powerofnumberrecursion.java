import java.util.Scanner;
public class powerofnumberrecursion {
    public static int power(int a,int b)
    {
        if(b<=0)
        return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        int a=sc.nextInt();
        System.out.println("Enter the power: ");
        int b=sc.nextInt();
        System.out.println(power(a,b));
    }
    
}

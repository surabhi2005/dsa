import java.util.Scanner;
public class divisorofnumberrecursion {
    public static void divisor(int n,int i)
    {
        if(i>Math.sqrt(n))
        return ;
        if(n%i==0)
        {
        System.out.print(i+" ");
        if(i!=n/i)
        {
        divisor(n,i+1);
        System.out.print(n/i+" ");
        }
        }
        else
        {
            divisor(n, i+1);
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        divisor(n, 1);

    }
    
}

import java.util.Scanner;
public class reversenumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int sum=0;
        while(x>0)
        {
            sum=sum*10+x%10;
            x=x/10;
        }
        System.out.println("Reversed Number: "+sum);
    }
    
}

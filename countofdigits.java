import java.util.Scanner;
public class countofdigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");;
        int a=sc.nextInt();
        int digit=0;
        while(a>0)
        {
            digit++;
            a=a/10;
        }
        System.out.println("The number of digits are "+digit);
    }
    
}

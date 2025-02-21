import java.util.Scanner;
public class forloop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int x=sc.nextInt();
        int i=1;
        int sum=x;
        while(sum<1000)
        {
            sum=x*i;
            System.out.println(sum);
            i++;
        }
    }
    
}

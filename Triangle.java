import java.util.Scanner;
public class Triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 angles of the triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        if(sum==180)
        {
            System.out.println("Triangle can be formed");
        }
        else{
            System.out.println("Triangle cannot be formed");
        }

    }
}

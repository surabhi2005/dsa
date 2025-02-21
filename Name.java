import java.util.Scanner;
public class Name {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name:");
        String firstname=sc.next();
        System.out.println("Enter the last name:");
        String lastname=sc.next();
        String fullname=firstname+lastname;
        System.out.println("Enter a value");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(fullname);
        }
    }
}

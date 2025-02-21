import java.util.Scanner;
public class size {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int v=sc.nextInt();
        switch(v)
        {
            case 29:
                System.out.println("Small");
                break;
            case 30:
                 System.out.println("Medium");
                 break;
            case 38:
                  System.out.println("Large");
                  break;
            case 42:
                  System.out.println("XLarge");
                break;
            default:
                 System.out.println("Invalid");
            
        }
    }
}

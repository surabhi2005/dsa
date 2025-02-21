import java.util.Scanner;
public class InputBasics {
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a=sc.nextInt();
        System.out.println("Enter a String:");
        String b=sc.next();
        System.out.println("Enter a Character:");
        char c=sc.next().charAt(0);
        System.out.println("Integer: "+a);
        System.out.println("String: "+b);
        System.out.println("Character: "+c);
    }
}

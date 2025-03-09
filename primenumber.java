import java.util.Scanner;
public class primenumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        System.out.println("Prime Numbers: ");
       for(int i=2;i<=x;i++)
       {
          int c=0;
          for(int j=2;j<i;j++)
          {
            if(i%j==0)
            c=1;
          }
          if(c==0)
          System.out.print(i+" ");
       }
    }
    
}


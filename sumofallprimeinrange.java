import java.util.Scanner;
public class sumofallprimeinrange {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the start limit:");
       int l=sc.nextInt();
       System.out.println("Enter the end limit:");
       int r=sc.nextInt();
       int[] arr=new int[r+1];
       for(int i=2;i<=r;i++)
       {
            arr[i]=1;
       }
       for(int i=2;i<=r;i++)
       {
        if(arr[i]==1)
        {
            for(int j=i*2;j<=r;j=j+i)
            {
                arr[j]=0;
            }
        }
       }
       int sum=0;
       for(int i=l;i<=r;i++)
       {
         if(arr[i]==1)
         sum+=i;
       }
       System.out.println("sum: "+sum);
    }
}

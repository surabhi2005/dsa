import java.util.Scanner;
public class smallestelementofarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mini=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }
        System.out.println("Smallest element of array is "+mini);

    }
}

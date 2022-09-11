import java.util.Scanner;
public class num_pyramid_pattern {
    public static void pyramid_pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-2;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        pyramid_pattern(n);
    }
}

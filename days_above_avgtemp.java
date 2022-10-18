import java.util.*;
public class days_above_avgtemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days;
        System.out.println("Enter no. of days");
        days=sc.nextInt();
        int arr[]=new int[days];
        double avg=0.0d;
        for(int i=0;i<days;i++)
        {
            System.out.println("Day "+(i+1)+"'s high temperature: ");
            arr[i]=sc.nextInt();
            avg+=arr[i];
        }
        avg/=days;
        int count=0;
        for(int i=0;i<days;i++)
        {
            if(arr[i]>avg)
                count++;
        }
        System.out.printf("Average temperature is: %.2f \n",avg);
        System.out.println("No. of days above average temperature are: "+count);
    }
}

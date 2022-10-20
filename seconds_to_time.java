import java.util.*;
public class seconds_to_time {
    public static void main(String[] args) {
        int sec;
        Scanner sc=new Scanner(System.in);
        sec=sc.nextInt();
        int min=sec/60;
        sec=sec%60;
        int hour=min/60;
        min=min%60;
        System.out.println(hour+":"+min+":"+sec);
    }
}

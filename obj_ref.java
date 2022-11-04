
import java.util.*;
public class obj_ref {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=30;i++)
        {
            boolean f=(i%2==0);
            boolean s=(i%4)!=0;
            boolean t=(i%6!=0);
            if((f && s)&& t)
            {
                System.out.println(i);
            }
        }
    }
}
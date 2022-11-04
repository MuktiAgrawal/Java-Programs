// Program to implement ArrayList
import java.util.ArrayList;
import java.util.Scanner;
public class Implement_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        for(int i=1;i<=5;i++){
            System.out.println("Enter name of student "+i+" : ");
            al.add(sc.next());
        }
        System.out.println("Size of ArrayList is "+al.size());
        System.out.println("After removing name at index 2");
        al.remove(2);
        System.out.println("Updated ArrayList");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}

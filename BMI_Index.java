import java.util.*;
public class BMI_Index{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name");
        String lastName = sc.nextLine();
        System.out.println("Enter weight in kilograms");
        double weight = sc.nextDouble(); 
        System.out.println("Enter height in meters");
        double height = sc.nextDouble(); 
        double bmiIndex = weight / (height * height);
    
        System.out.println("First Name: " + firstName); 
        System.out.println("Last Name: " + lastName); 
        System.out.println("BMI Index: " + bmiIndex);
    }
}
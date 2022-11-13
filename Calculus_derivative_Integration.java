import java.util.Scanner;
public class Calculus_derivative_Integration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name=sc.next();
        System.out.println("Now enter 3 numbers:");
        System.out.print("a = ");
        int a=sc.nextInt();
        System.out.print("b = ");
        int b=sc.nextInt();
        System.out.print("c = ");
        int c=sc.nextInt();
        System.out.println("The formula you have entered is:");
        System.out.println(a+"x^2+"+b+"x+"+c);
        System.out.println("The derivative of the equation is \n"+(2*a)+"x+"+b);
        double x;
        System.out.println("Enter a value for x");
        x=sc.nextDouble();
        System.out.println("Derivative at x = "+x+" is "+(2*a*x+b));
        System.out.println("The anti-derivative of the equation is "+(a/3.0)+"x^3+"+(b/2.0)+"x^2+"+c);
        System.out.println(name+", you owe Mukti forever!");
    }
}

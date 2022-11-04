/* Program to implement constructor overloading*/
public class constructor_overloading {
    int a,b;
    constructor_overloading(){
        System.out.println("First constructor called");
        a=1;
        b=1;
        System.out.println("a = "+a+"\nb = "+b);
    }
    constructor_overloading(int x,int y){
        System.out.println("Second constructor called");
        a=x;
        b=y;
        System.out.println("a = "+a+"\nb = "+b);
    }
    constructor_overloading(int x,int y,int z){
        System.out.println("Third constructor called");
        a=x;
        b=y;
        System.out.println("a = "+a+"\nb = "+b);
    }
    public static void main(String[] args) {
        constructor_overloading obj1=new constructor_overloading();
        constructor_overloading obj2=new constructor_overloading(4,5);
        constructor_overloading obj3=new constructor_overloading(7,8,9);
    }
}

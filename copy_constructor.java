public class copy_constructor {
    int a,b;
    copy_constructor(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("a = "+a+"\nb = "+b);
    }
    copy_constructor(copy_constructor obj){
        System.out.println("Copy constructor called");
        a=obj.a;
        b=obj.b;
        System.out.println("a = "+a+"\nb = "+b);
    }
    public static void main(String[] args) {
        copy_constructor c1=new copy_constructor(5,7);
        copy_constructor c2=new copy_constructor(c1);
    }
}

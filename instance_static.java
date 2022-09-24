public class instance_static {
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    static void add(int a,float b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        instance_static obj=new instance_static();
        obj.add(5,6);
        instance_static.add(10,6f);
    }
}

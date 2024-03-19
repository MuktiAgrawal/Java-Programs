public class pract {
    public static void main(String[] args) {
        String str = "Knowledge";
        String s = str;
        str = str.concat(" Base");
        System.out.println(str);
        System.out.println(s);
        Integer a = 10;
        a = 20;
        System.out.println(a);
        Integer b = 0;
        a = b;
        System.out.println(a);
        System.out.println(b);
    }
}

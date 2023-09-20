public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd1(8, 12));
    }

    public static int gcd1(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd1(b, a % b);
    }

}

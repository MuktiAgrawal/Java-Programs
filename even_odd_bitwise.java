public class even_odd_bitwise {
    public static void main(String[] args) {
        int n = 69;
        if (isOdd(n)) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }

        System.out.println(ithbit(182, 8));
        System.out.println(reset_ithbit(182, 8));
        System.out.println(rightmost_setBit(8));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static int ithbit(int n, int i) {
        return (n & (1 << (i - 1))) >> (i - 1);
    }

    public static int reset_ithbit(int n, int i) {
        return n & ~(1 << (i - 1));
    }

    public static int rightmost_setBit(int n) {
        return (int) (Math.log(n & (-n)) / Math.log(2)) + 1;
    }

}

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd1(8, 12));
        System.out.println(canMeasureWater(3, 5, 4));
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

    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (jug1Capacity + jug2Capacity < targetCapacity) {
            return false;
        }
        System.out.println(targetCapacity % (gcd1(jug1Capacity, jug2Capacity)));
        return true;
    }
}

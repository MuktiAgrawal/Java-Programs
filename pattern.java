public class pattern {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int atEveryIndex = n - Math.min(Math.min(i, j), Math.min(2 * n - i - 2, 2 * n - j - 2));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}

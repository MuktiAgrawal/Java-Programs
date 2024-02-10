public static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle(r, c + 1);
            System.out.print("*");

        } else {
            triangle(r - 1, 0);
            System.out.println();
        }
    }
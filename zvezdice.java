public class zvezdice {
    public static void main(String[] args) {
        {
            int k = 4;

            for (int i = 1; i <= k; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }
            ///////////////////////////////////////////////////////////////////
            System.out.println("---------------------------");

            int r = 4;

            for (int i = 0; i < r; i++) {
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");
                }
                for (int l = 0; l <= i; l++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            ///////////////////////////////////////////////////////////////////
            System.out.println("---------------------------");

            int n, x = 1;
            n = 5;
            x = n - 1;

            for (int j = 1; j <= n; j++) {
                for (int i = 1; i <= x; i++) {
                    System.out.print(" ");
                }
                x--;
                for (int i = 1; i <= 2 * j - 1; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            x = 1;
            for (int j = 1; j <= n - 1; j++) {
                for (int i = 1; i <= x; i++) {
                    System.out.print(" ");
                }
                x++;
                for (int i = 1; i <= 2 * (n - j) - 1; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            ///////////////////////////////////////////////////////////////////
            System.out.println("---------------------------");

            int y = 5;
            for (int f = 0; f < y; f++) {
                for (int u = y - f; u > 1; u--) {
                    System.out.print(" ");
                }
                for (int u = 0; u <= f; u++) {
                    System.out.print("* ");
                    if (u == 1) {
                        System.out.print(" ");
                    }
                    if (u == 2) {
                        System.out.print("  ");
                    }
                    if (u == 3) {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
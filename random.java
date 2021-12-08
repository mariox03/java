public class random {
    public static void main(String[] args) {
        int y = 3;
        for (int f = 0; f < y; f++) {
            for (int u = y - f; u > 1; u--) {
                System.out.print(" ");
            }
            for (int u = 0; u <= f; u++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

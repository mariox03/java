import java.util.Scanner;

/*Napiši program, ki izpiše števila in vsoto števil na intervalu med X in 53. */

public class Naloga17_2_1 {
    public static void main(String[] args) {
        int x, v;
        v = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi x: ");
        x = input.nextInt();
        input.close();

        System.out.println("------------------------");

        x++;
        for (int i = x; i < 53; i++) {
            System.out.println(x);
            v += x;
            x++;
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
    }
}

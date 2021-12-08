import java.util.Scanner;

/*Napiši program, ki izpiše vsoto števil deljivih z X, 2 in 5 na intervalu med 2 in Y+3.*/

public class Naloga31_3_3 {
    public static void main(String[] args) {
        int x, y, v;
        v = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Y: ");
        y = input.nextInt();

        for (int i = 3; i < y + 3; i++) {
            if (i % x == 0 && i % 2 == 0 && i % 5 == 0) {
                v += i;
            }
        }

        System.out.println("------------------------------");
        System.out.println("Vsota stevil je: " + v);
        System.out.println("------------------------------");

        input.close();
    }
}

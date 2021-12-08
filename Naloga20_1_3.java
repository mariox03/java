import java.util.Scanner;

//Napiši program, ki izpiše vsoto vsakega petega števila na intervalu med X in Y.

public class Naloga20_1_3 {
    public static void main(String[] args) {
        int X, Y, v = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X.: ");
        X = input.nextInt();

        System.out.print("Vnesi Y.: ");
        Y = input.nextInt();

        input.close();

        while (X < Y) {
            X++;
            v = v + 5;
        }
        System.out.print("Vsota je: " + v);
    }
}

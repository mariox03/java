import java.util.Scanner;

/*Napiši program, ki izpiše vsoto vsakega X števila na intervalu med 3 in Y.*/

public class Naloga27_1_3 {
    public static void main(String[] args) {
        int x, y, v;
        v = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi x: ");
        x = input.nextInt();
        System.out.print("Vnesi y: ");
        y = input.nextInt();

        input.close();

        for (int i = 4; i < y; i = i + x) {
            v += i;
        }
        System.out.println("---------------------");
        System.out.print("Vsota je: " + v);
    }
}

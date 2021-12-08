import java.util.Scanner;

/*Napiši program, ki izpiše vsoto števil deljivih s 5 na intervalu med 2 in Y.*/

public class Naloga3_2_3 {
    public static void main(String[] args) {
        int y, v;
        v = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi Y: ");
        y = input.nextInt();
        input.close();

        for (int i = 3; i < y; i++) {
            if (i % 5 == 0) {
                v += i;
            }
        }
        System.out.print("Vsota je: " + v);
    }
}

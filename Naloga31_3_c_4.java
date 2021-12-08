import java.util.Scanner;

/*Napiši program, ki izpiše vsako peto število na intervalu med X in Y oziroma Y in X (glede na to katero izmed števil je večje!). Razlika med njima mora biti najmanj 32. Če je manjša ju ponovno preberi.*/

public class Naloga31_3_c_4 {
    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Y: ");
        y = input.nextInt();

        if (x > y) {
            while (x - y <= 32) {
                System.out.println("Razlika med njima mora biti najmanj 32! Ponovno vnesi X in Y");
                System.out.print("Vnesi X: ");
                x = input.nextInt();
                System.out.print("Vnesi Y: ");
                y = input.nextInt();
            }
            if (x - y >= 32) {
                y++;
                for (int i = y; i < x; i += 5) {
                    System.out.println(i);
                }
            }
        } else {
            while (y - x <= 32) {
                System.out.println("Razlika med njima mora biti najmanj 32! Ponovno vnesi X in Y");
                System.out.print("Vnesi X: ");
                x = input.nextInt();
                System.out.print("Vnesi Y: ");
                y = input.nextInt();
            }
            if (y - x >= 32) {
                x++;
                for (int i = x; i < y; i += 5) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}

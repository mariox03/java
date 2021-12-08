import java.util.Scanner;

/*Napiši program, ki izpiše vsako tretje število na intervalu med X in Y oziroma Y in X (glede na to katero izmed števil je večje!).*/

public class Naloga17_2_4 {
    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Y: ");
        y = input.nextInt();
        input.close();

        if (x > y) {
            y++;
            for (int i = y; i < x; i += 3) {
                System.out.println(i);
            }
        } else {
            x++;
            for (int i = x; i < y; i += 3) {
                System.out.println(i);
            }
        }
    }
}

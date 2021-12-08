import java.util.Scanner;

/* Napiši program, ki prebere meji intervala. Razlika med zgornjo in spodnjo mejo mora biti najmanj 14 in največ 54. V primeru, da to ne drži, znova preberemo drugo mejo, če je razlika manjša od 14. V primeru, da je večja od 54, pa ponovno preberemo prvo mejo. Na intervalu liha števila množimo s 4 in seštejemo v vsota1, soda pa s 5 in seštejemo v vsota2. Vsoti zmnožimo in  na koncu izpišemo rezultat.*/

public class Naloga10_3_3 {
    public static void main(String[] args) {
        int x, y, v, v1, v2;
        v = 0;
        v1 = 0;
        v2 = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi zgornjo mejo: ");
        x = input.nextInt();
        System.out.print("Vnesi spodnjo mejo: ");
        y = input.nextInt();

        if (y - x > 54) {
            System.out.print("Ponovno vnesi zgornjo(prvo) mejo: ");
            x = input.nextInt();
        }
        if (y - x < 14) {
            System.out.print("Ponovno vnesi spodnjo(drugo) mejo: ");
            y = input.nextInt();
        }

        if (y - x >= 14 && y - x <= 54) {
            x++;
            for (int i = x; i < y; i++) {
                if (i % 2 != 0) {
                    v1 = v1 + (i * 4);
                }
                if (i % 2 == 0) {
                    v2 = v2 + (i * 5);
                }
            }
        }
        v = v1 * v2;
        System.out.println("Vsota je: " + v);
        input.close();
    }
}

import java.util.Scanner;

/*Napiši program, ki prebere dve števili. Ti dve števili vzame za meji intervala. Bodi pozoren, da manjše prebrano število vzameš za spodnjo mejo, večje prebrano pa za zgornjo mejo intervala (preveri s pomočjo if stavka!). Vsako tretje število na intervalu sešteje in izpiše rezultat. */

public class Naloga3_2_s_4 {
    public static void main(String[] args) {
        int x, y, v;
        v = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Vnesi dve st.: ");
        x = input.nextInt();
        y = input.nextInt();

        if (x > y) {
            while (y < x) {
                y += 3;
                v += y;
            }
        } else {
            while (x < y) {
                x += 3;
                v += x;
            }
        }
        System.out.println("Rezultat je: " + v);
        input.close();
    }
}

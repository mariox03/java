import java.util.Scanner;

/*Napiši program, ki izpiše števila deljiva s 3 in hkrati z X in vsoto sodih števil na intervalu med 2 in Z. V primeru, da prebrano število Z manjše od 34, ga ponovno preberi.*/

public class Naloga31_3_c_2 {
    public static void main(String[] args) {
        int x, z, v;
        v = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Z: ");
        z = input.nextInt();

        while (z < 34) {
            System.out.print("Ponovno vnesi Z: ");
            z = input.nextInt();
        }

        for (int i = 3; i < z; i++) {
            if (i % 3 == 0 && i % x == 0) {
                System.out.println(i);
            }
            v += i;
        }
        System.out.println("------------------------------");
        System.out.println("Vsota stevil je: " + v);
        System.out.println("------------------------------");
        input.close();
    }
}

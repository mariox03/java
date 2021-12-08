import java.util.Scanner;

/*Program nadgradi tako, da vneseš cene treh kupcev. Dodaj možnost, da najdražjemu nakupu znižaš ceno za poljuben procent. */

public class Naloga22_9_4 {
    public static void main(String[] args) {
        float a[] = new float[3];
        float max, popust, koncna_cena;
        float cena_popust = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Vnesi cene treh kupcev: ");
        for (int i = 0; i < 3; i++) {
            a[i] = input.nextFloat();
        }

        max = a[0];
        for (int i = 0; i < 3; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println("---------------------------------------");
        System.out.print("Vnesi popust za najdrazji nakup: ");
        popust = input.nextFloat();

        cena_popust = (max * popust) / 100;

        koncna_cena = max - cena_popust;

        System.out.println("---------------------------------------");
        System.out.println("Cena najdrazega nakupa z popustom: " + koncna_cena);

        input.close();
    }
}

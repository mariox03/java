import java.util.Scanner;

/*Napiši program, ki prebira cene izdelkov. Ko vnesemo vse cene, določimo popust in izpišemo končno ceno.*/

public class Naloga22_9_1 {
    public static void main(String[] args) {
        int vnosi;
        float cena = 0;
        float cena_popust = 0;
        float popust;
        float koncna_cena;

        Scanner input = new Scanner(System.in);

        System.out.print("Koliko bos vnesel izdelkov?: ");
        vnosi = input.nextInt();

        float a[] = new float[vnosi];

        System.out.println("---------------------------------------");
        System.out.println("Vnesi " + vnosi + " izdelkov:");

        for (int i = 0; i < vnosi; i++) {
            a[i] = input.nextFloat();
            cena += a[i];
        }

        System.out.println("---------------------------------------");
        System.out.print("Vnesi popust: ");
        popust = input.nextFloat();

        cena_popust = (cena * popust) / 100;

        koncna_cena = cena - cena_popust;

        System.out.println("---------------------------------------");
        System.out.println("Cena brez popusta: " + cena);

        System.out.println("---------------------------------------");
        System.out.println("Cena z popustom: " + koncna_cena);

        input.close();
    }
}
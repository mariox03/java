import java.util.Scanner;

/*Napiši program, ki prebira cene izdelkov. Dodaj možnost, da poljubnemu izdelku dodaš popust. Na koncu izpiši končno ceno.*/

public class Naloga22_9_2 {
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

        for (int i = 0; i < vnosi; i++) {
            System.out.println("Vnesi izdelek!");
            a[i] = input.nextFloat();

            System.out.println("-----------------------------------------------------");
            System.out.println("Ali zelite dodati popust? Odgovorite z *Da* ali *Ne*");
            String vnos = input.next();
            System.out.println("-----------------------------------------------------");

            if (vnos.contains("da") || vnos.contains("Da") || vnos.contains("DA")) {
                System.out.print("Vnesi popust: ");
                popust = input.nextFloat();

                cena_popust = (a[i] * popust) / 100;
                koncna_cena = a[i] - cena_popust;
                cena += koncna_cena;

            } else {
                cena += a[i];
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Konca cena: " + cena);
        System.out.println("---------------------------------------");

        input.close();
    }
}

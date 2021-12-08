import java.util.Scanner;

/*Napiši program, ki prebira cene izdelkov. Dodaj možnost, da poljubnemu izdelku dodaš popust in da ob izbiri lahko iz celotne cene odstraniš najcenejši izdelek. Na koncu izpiši končno ceno.*/

public class Naloga22_9_3 {
    public static void main(String[] args) {
        int vnosi;
        float min;
        float cena = 0;
        float cena_popust = 0;
        float popust;
        float koncna_cena;
        float konca_cena_2;

        Scanner input = new Scanner(System.in);

        System.out.print("Koliko bos vnesel izdelkov?: ");
        vnosi = input.nextInt();

        float a[] = new float[vnosi];

        System.out.println("---------------------------------------");

        min = a[0];
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

                if (min > koncna_cena) {
                    min = koncna_cena;
                }
            } else {
                if (min > a[i]) {
                    min = a[i];
                }
                cena += a[i];
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Ali zelite odstraniti najcenejsi izdelek? Odgovorite z *Da* ali *Ne*");
        String najcenejsi = input.next();

        if (najcenejsi.contains("da") || najcenejsi.contains("Da") || najcenejsi.contains("DA")) {
            konca_cena_2 = cena - min;

            System.out.println("---------------------------------------");
            System.out.println("Konca cena: " + konca_cena_2);
            System.out.println("---------------------------------------");
        } else {
            System.out.println("---------------------------------------");
            System.out.println("Konca cena: " + cena);
            System.out.println("---------------------------------------");
        }
        input.close();
    }
}

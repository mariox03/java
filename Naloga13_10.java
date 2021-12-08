import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Napiši program, ki evidentira delovni čas zaposlenega.

Na začetku vpraša za ime in priimek (Vnesi svoje ime in priimek), nato za uro prihoda in uro odhoda.

Program primerja ime in priimek z imenom in priimkom zapisanim v tabeli.

Izpiše nam ime in priimek, uro prihoda, odhoda in število ur in minut, ki jih je posameznik delal tisti dan. V primeru,

da uporabnika ne najde naj izpiše, da je prišlo do napačnega vnosa oziroma, da uporabnik ne obstaja.
*/

public class Naloga13_10 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        String ime[] = new String[3];
        String priimek[] = new String[3];
        String prihod[] = new String[3];
        String odhod[] = new String[3];
        int h[] = new int[3];
        int min[] = new int[3];

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Vnesi ime: ");
            ime[i] = input.nextLine();

            System.out.print("Vnesi priimek: ");
            priimek[i] = input.nextLine();

            System.out.print("Vnesi uro prihoda (HH:mm): ");
            prihod[i] = input.nextLine();

            System.out.print("Vnesi uro odhoda (HH:mm): ");
            odhod[i] = input.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date d1 = sdf.parse(prihod[i]);
            Date d2 = sdf.parse(odhod[i]);
            long razlika = d2.getTime() - d1.getTime();

            double sekunde = razlika / 1000;
            int s = (int) sekunde;

            int minut = s / 60;
            int ur = minut / 60;

            h[i] = ur;
            min[i] = minut % 60;
        }

        System.out.println("-------------------------------");

        System.out.print("Vnesi ime: ");
        String ime2 = input.nextLine();
        System.out.print("Vnesi priimek: ");
        String priimek2 = input.nextLine();

        System.out.println("-------------------------------");

        for (int i = 0; i < 3; i++) {
            if (ime2.equals(ime[i]) && priimek2.equals(priimek[i])) {
                System.out.println("Podatki osebe:");
                System.out.print("Ime: ");
                System.out.println(ime[i]);

                System.out.print("Priimek: ");
                System.out.println(priimek[i]);

                System.out.print("Prihod: ");
                System.out.println(prihod[i]);

                System.out.print("Odhod: ");
                System.out.println(odhod[i]);

                System.out.print("Oseba je skupaj delala: " + h[i] + " ur in " + min[i] + " minut.");
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Prislo je do napacnega vnosa ali uporabnik ne obstaja!");
        }
        input.close();
    }
}

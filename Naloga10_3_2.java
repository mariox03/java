import java.util.Scanner;

/*Prvo nalogo dopolni tako, da v primeru, ko je vrednost spremenljivke min soda, vrednost spremenljivke min množimo z vrednostjo spremenljivke vsotasodih in izpiše rezultat. V primeru, da je vrednost spremenljivke min liha, pa vrednost spemenljivke vsotasodih množimo z vrednostjo spremenljivke vsotalihih in izpiše rezultat.*/

public class Naloga10_3_2 {
    public static void main(String[] args) {
        int v, min, vsodih, vlihih, min_sodih, min_lihih;
        min_sodih = 0;
        min_lihih = 0;
        vsodih = 0;
        vlihih = 0;
        v = 0;
        int a[] = new int[12];
        int b[] = new int[6];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 12 st.: ");

        for (int i = 0; i < 12; i++) {
            a[i] = input.nextInt();
        }

        min = a[0];
        for (int i = 0; i < 12; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Najmanjse stevilo je: " + min);
        System.out.println("-------------------------------");
        System.out.println("Vnesi 6 st.: ");
        for (int i = 0; i < 6; i++) {
            b[i] = input.nextInt();
            if (i % 2 == 0) {
                vsodih += b[i];
            } else {
                vlihih += b[i];
            }
        }

        if (vsodih > vlihih) {
            v = vsodih;
        } else {
            v = vlihih;
        }
        if (min % 2 == 0) {
            min_sodih = min * vsodih;
            System.out.println("-------------------------------");
            System.out.println("Vrednost min*vsotasodih je: " + min_sodih);
        } else {
            min_lihih = vsodih * vlihih;
            System.out.println("-------------------------------");
            System.out.println("Vrednost vsotasodih*vsotalihih je: " + min_lihih);
        }
        System.out.println("-------------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("-------------------------------");
        input.close();
    }
}

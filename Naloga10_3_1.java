import java.util.Scanner;

/*Napiši program, ki prebere 12 števil. Izmed teh števil poišče najmanjšega, ga shrani v spremenljivko min in vrednost spremenljivke min izpiše. Nato prebere 6 števil in sešteje soda števila posebej (vsotasodih) in liha posebej (vsotalihih). Večjo izmed vsot shrani v spremenljivko vsota in izpiše njeno vrednost.*/

public class Naloga10_3_1 {
    public static void main(String[] args) {
        int v, min, vsodih, vlihih;
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
        System.out.println("-------------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("-------------------------------");
        input.close();
    }
}
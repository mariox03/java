import java.util.Scanner;

/*Napiši program, ki prebere 12 števil in izpiše največje in drugo največje število. Na intervalu med najmanjšim in največjim vnesenim številom sešteje vsako drugo število in izpiše rezultat.*/

public class Naloga17_3_3 {
    public static void main(String[] args) {
        int v, max, max2, min;
        v = 0;
        int a[] = new int[12];
        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 12 st.: ");

        for (int i = 0; i < 12; i++) {
            a[i] = input.nextInt();
        }

        max = a[0];
        max2 = a[0];
        min = a[0];
        for (int i = 0; i < 12; i++) {
            if (max < a[i]) {
                max2 = max;
                max = a[i];
            } else if (max2 < a[i] && a[i] != max) {
                max2 = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        min++;
        for (int i = min; i < max; i += 2) {
            v += i;
        }
        System.out.println("-------------------------------");
        System.out.println("Najvecjo stevilo je: " + max);
        System.out.println("-------------------------------");
        System.out.println("Drugo najvecjo stevilo je: " + max2);
        System.out.println("-------------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("-------------------------------");
        input.close();
    }
}

import java.util.Scanner;

/*Napiši program, ki prebere 12 števil, izpiše največje in najmanjše število in vsoto zadnjih petih prebranih števil.*/

public class Naloga17_2_3 {
    public static void main(String[] args) {
        int v, max, min;
        v = 0;
        int a[] = new int[12];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 12 st.: ");

        for (int i = 0; i < 12; i++) {
            a[i] = input.nextInt();
            if (i > 6) {
                v += a[i];
            }
        }
        max = a[0];
        min = a[0];
        for (int i = 0; i < 12; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Najvecjo stevilo je: " + max);
        System.out.println("-------------------------------");
        System.out.println("Najmanjse stevilo je: " + min);
        System.out.println("-------------------------------");
        System.out.println("Vsota zadnjih petih st. je: " + v);
        System.out.println("-------------------------------");
        input.close();
    }
}

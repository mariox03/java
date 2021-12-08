import java.util.Scanner;

/*Napiši program, ki prebere 18 števil, izpiše največje in najmanjše število in vsoto od 5 do 10 prebranega števila.*/

public class Naloga31_3_c_3 {
    public static void main(String[] args) {
        int min, max, v;
        v = 0;
        int a[] = new int[18];

        Scanner input = new Scanner(System.in);

        System.out.println("Vnesi 18 stevil:");
        for (int i = 0; i < 18; i++) {
            a[i] = input.nextInt();
            if (i > 5 && i < 10) {
                v += a[i];
            }
        }

        max = a[0];
        min = a[0];
        for (int i = 0; i < 18; i++) {
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
        System.out.println("Vsota od 5 do 10 prebranih stevil je: " + v);
        System.out.println("-------------------------------");
        input.close();
    }
}

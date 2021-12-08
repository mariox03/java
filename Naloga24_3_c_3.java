import java.util.Scanner;

/*Napiši program, ki prebere 14 števil, največje prebrano število vzame za spodnjo mejo intervala, vsoto zadnjih šestih prebranih števil pa za zgornjo mejo intervala. Nato izpiše povprečno vrednost na tem intervalu.*/

public class Naloga24_3_c_3 {
    public static void main(String[] args) {
        int v, max;
        float d, b, c;
        b = 0;
        c = 0;
        v = 0;
        int a[] = new int[14];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 14 st.: ");
        for (int i = 0; i < 14; i++) {
            a[i] = input.nextInt();
        }

        max = a[0];
        for (int i = 0; i < 14; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (i >= 8) {
                v += a[i];
            }
        }
        for (int i = max; i < v; i++) {
            b = b + i;
            c = c + 1;
        }
        d = b / c;

        input.close();
        System.out.print("Povrecna vrednost je: " + d);
    }
}

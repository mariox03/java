import java.util.Scanner;

/*Napiši program, ki prebere 9 števil, največje prebrano število vzame za spodnjo mejo intervala, vsoto teh 9 prebranih števil pa za zgornjo mejo intervala. Nato izpiše povprečno vrednost števil na tem intervalu.*/

public class Naloga17_2_c_4 {
    public static void main(String[] args) {
        int v, y;
        float d, b, c;
        b = 0;
        c = 0;
        v = 0;
        int a[] = new int[9];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 9 st.: ");

        for (int i = 0; i < 9; i++) {
            a[i] = input.nextInt();
            v = v + a[i];
        }
        y = a[0];
        for (int i = 0; i < 9; i++) {
            if (y < a[i]) {
                y = a[i];
            }
        }
        for (int i = y; i < v; i++) {
            b = b + i;
            c = c + 1;
        }
        d = b / c;

        input.close();
        System.out.print("Povrecna vrednost je: " + d);
    }
}

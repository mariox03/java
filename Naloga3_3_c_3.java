import java.util.Scanner;

//Napiši program, ki prebere 12 števil, največje prebrano število vzame za spodnjo mejo intervala, vsoto prvih šestih prebranih števil pa za zgornjo mejo intervala. Nato izpiše vsoto na tem intervalu.

public class Naloga3_3_c_3 {
    public static void main(String[] args) {
        int r, v, max;
        r = 0;
        v = 0;
        int a[] = new int[12];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 12 st.: ");

        max = a[0];
        for (int i = 0; i < 12; i++) {
            a[i] = input.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
            if (i < 6) {
                v += a[i];
            }
        }
        v++;
        for (int i = v; i < max; i++) {
            r += i;
        }
        System.out.print("Vsota je: " + r);
        input.close();
    }
}

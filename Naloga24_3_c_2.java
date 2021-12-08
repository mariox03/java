import java.util.Scanner;

/*Napiši program, ki prebere dvajset števil. Pri tem izpiše števila deljiva z X izmed prvih desetih prebranih števil in števila deljiva z Y izmed ostalih pet prebranih števil. Zadnjih pet prebranih števil sešteje v vsoto in deli z drugim številom deljivim z X izmed prvih desetih prebranih števil.*/

public class Naloga24_3_c_2 {
    public static void main(String[] args) {
        int x, y, st, s;
        float v_st, v;
        s = 0;
        v = 0;
        v_st = 0;
        int a[] = new int[21];

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Y: ");
        y = input.nextInt();
        System.out.println("Vnesi 20 st.: ");

        for (int i = 1; i < 21; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("-------------------------------");
        st = a[0];
        for (int i = 1; i < 21; i++) {
            if (i == 1) {
                System.out.println("Stevila deljiva z X:");
            }
            if (i < 11 && a[i] % x == 0) {
                System.out.println(a[i]);
                s++;
                if (s == 2) {
                    st = a[i];
                }
            }
            if (i == 11) {
                System.out.println("-------------------------------");
                System.out.println("Stevila deljiva z Y:");
            }
            if (i >= 11 && i < 16 && a[i] % y == 0) {
                System.out.println(a[i]);
            }
            if (i >= 16) {
                v += a[i];
            }
        }
        v_st = v / st;
        System.out.println("-------------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("-------------------------------");
        System.out.println("Vsota deljeno drugo stevilo, ki je deljeno z X, rezultat je: " + v_st);
        System.out.println("-------------------------------");
        input.close();
    }
}

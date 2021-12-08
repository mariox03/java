import java.util.Scanner;

/*Napiši program, ki prebere 11 števil in izpiše prva tri prebrana števila in vsoto zadnjih petih prebranih števil.*/

public class Naloga14_4_3 {
    public static void main(String[] args) {
        int a[] = new int[12];
        int v = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 11 st.: ");
        for (int i = 0; i < 12; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("------------------------");
        System.out.println("Prva tri prebrana števila so:");
        for (int i = 0; i < 12; i++) {
            if (i < 3) {
                System.out.println(a[i]);
            }
            if (i > 6) {
                v += a[i];
            }
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
        input.close();
    }
}

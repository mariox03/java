import java.util.Scanner;

/*Napiši program, ki izpiše števila deljiva z X izmed petnajstih prebranih števil. Pri tem izpiše vsoto tistih izpisanih števil, ki niso deljiva z Y.*/

public class Naloga14_4_7 {
    public static void main(String[] args) {
        int v, x, y;
        v = 0;
        int a[] = new int[15];

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Y: ");
        y = input.nextInt();

        System.out.println("Vnesi 15 st.: ");

        for (int i = 0; i < 15; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            if (a[i] % x == 0) {
                System.out.println(a[i]);
            }
            if (a[i] % x == 0 && a[i] % y != 0) {
                v += a[i];
            }
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
        input.close();
    }
}

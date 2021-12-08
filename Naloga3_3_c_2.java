import java.util.Scanner;

//Napiši program, ki prebere petnajst števil. Pri tem izpiše števila deljiva z X izmed prvih desetih prebranih števil in števila deljiva z Y izmed ostalih pet prebranih števil.

public class Naloga3_3_c_2 {
    public static void main(String[] args) {
        int x, y;
        int a[] = new int[16];

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Y: ");
        y = input.nextInt();
        System.out.println("Vnesi 15 st.: ");

        for (int i = 1; i < 16; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i = 1; i < 16; i++) {
            if (i == 1) {
                System.out.println("Stevila deljiva z X:");
            }
            if (i < 11 && a[i] % x == 0) {
                System.out.println(a[i]);
            }
            if (i == 11) {
                System.out.println("-------------------------------");
                System.out.println("Stevila deljiva z Y:");
            }
            if (i >= 11 && a[i] % y == 0) {
                System.out.println(a[i]);
            }
        }
        input.close();
    }
}

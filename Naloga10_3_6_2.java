import java.util.Scanner;

/*Napiši program, ki prebere dvajset števil. Pri tem izpiše števila deljiva z 2 izmed prvih desetih prebranih števil in števila deljiva z Y izmed ostalih desetih prebranih števil.*/

public class Naloga10_3_6_2 {
    public static void main(String[] args) {
        int y;
        int a[] = new int[21];

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi Y: ");
        y = input.nextInt();
        System.out.println("Vnesi 20 st.: ");

        for (int i = 1; i < 21; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i = 1; i < 21; i++) {
            if (i == 1) {
                System.out.println("Stevila deljiva z 2:");
            }
            if (i < 11 && a[i] % 2 == 0) {
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

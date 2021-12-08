import java.util.Scanner;

/*Napiši program, ki izpiše števila deljiva z X izmed petnajstih prebranih števil.*/

public class Naloga17_2_c_2 {
    public static void main(String[] args) {
        int x;
        int a[] = new int[16];

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.println("Vnesi 16 st.: ");

        for (int i = 1; i < 16; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i = 1; i < 16; i++) {
            if (a[i] % x == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}

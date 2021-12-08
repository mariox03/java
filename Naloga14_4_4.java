import java.util.Scanner;

/*Napiši program, ki prebere X števil in izpiše števila, ki so deljiva s 5 in 3.*/

public class Naloga14_4_4 {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X stevilo: ");
        x = input.nextInt();

        System.out.println("---------------------------------------");
        System.out.println("Vnesi " + x + " stevil:");
        System.out.println("---------------------------------------");

        int a[] = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("---------------------------------------");
        System.out.println("Števila deljiva s 5 in 3 so:");
        for (int i = 0; i < x; i++) {
            if (a[i] % 5 == 0 && a[i] % 3 == 0) {
                System.out.println(a[i]);
            }
        }
        input.close();
    }
}

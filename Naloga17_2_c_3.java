import java.util.Scanner;

/*-------------------------Naloga 2-------------------------*/
/*Napiši program, ki izpiše števila deljiva z X izmed petnajstih prebranih števil.*/

/*Nalogo 2 nadgradi tako, da program ne izpiše tistih števil deljivih z X, ki so deljiva s 3.*/

public class Naloga17_2_c_3 {
    public static void main(String[] args) {
        int x;
        int a[] = new int[16];

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.println("Vnesi 15 st.: ");

        for (int i = 1; i < 16; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i = 1; i < 16; i++) {
            if (a[i] % x == 0) {
                if (a[i] % 3 == 0) {
                    ///////////////
                } else {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}

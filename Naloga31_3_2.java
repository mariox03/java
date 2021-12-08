import java.util.Scanner;

/*Napiši program, ki prebere osem števil in preveri, ali je posamezno število deljivo s 3. Izmed števil deljivih s 3 izpiše števila, ki so deljiva z 2 in niso deljiva s 5.*/

public class Naloga31_3_2 {
    public static void main(String[] args) {
        int a[] = new int[8];

        Scanner input = new Scanner(System.in);

        System.out.println("Vnesi 8 stevil:");
        for (int i = 0; i < 8; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Stevila deljiva s 3, ki so deljiva z 2 in niso deljiva s 5:");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            if (a[i] % 3 == 0) {
                if (a[i] % 2 == 0 && a[i] % 5 != 0) {
                    System.out.println(a[i]);
                }
            }
        }
        input.close();
    }
}

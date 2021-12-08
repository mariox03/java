import java.util.Scanner;

/*Napiši program, ki prebere 7 števil in izpiše tista, ki so liha in hkrati deljiva s 5.*/

public class Naloga17_3_2 {
    public static void main(String[] args) {
        int a[] = new int[8];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 7 st.:");
        System.out.println("-------------------------------");

        for (int i = 1; i < 8; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("-------------------------------");

        for (int i = 1; i < 8; i++) {
            if (a[i] % 2 != 0 && a[i] % 5 == 0) {
                System.out.println(a[i]);
            }
        }
        input.close();
    }
}

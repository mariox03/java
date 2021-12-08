import java.util.Scanner;

/*Napiši program, ki prebere 5 števil in izpiše tista, ki so deljiva hkrati z 2 in s 3.*/

public class Naloga15_9_2 {
    public static void main(String[] args) {
        int a[] = new int[6];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 5 st.:");
        System.out.println("-------------------------------");

        for (int i = 1; i < 6; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("-------------------------------");

        for (int i = 1; i < 6; i++) {
            if (a[i] % 2 == 0 && a[i] % 3 == 0) {
                System.out.println(a[i]);
            }
        }
        input.close();
    }
}

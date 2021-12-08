import java.util.Scanner;

/*Napiši program, ki prebere deset števil, izpiše največje število in vsoto prvih petih prebranih števil.*/

public class Naloga3_2_s_2 {
    public static void main(String[] args) {
        int max, v;
        v = 0;
        int a[] = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 10 st.:");

        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }

        max = a[0];
        for (int i = 0; i < 10; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            while (i < 5) {
                v = v + a[i];
                i++;
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Najvecjo stevilo je: " + max);
        System.out.println("-------------------------------");
        System.out.println("Vsota prvih petih st. je: " + v);
        System.out.println("-------------------------------");

        input.close();
    }
}

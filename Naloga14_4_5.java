import java.util.Scanner;

/*Napiši program, ki prebere tri števila in izpiše največjega in najmanjšega. Nato izpiše vsoto števil na intervalu med najmanjšim in največjim številom.*/

public class Naloga14_4_5 {
    public static void main(String[] args) {
        int v, max, min;
        v = 0;
        int a[] = new int[3];

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 3 st.: ");

        for (int i = 0; i < 3; i++) {
            a[i] = input.nextInt();
        }
        max = a[0];
        min = a[0];
        for (int i = 0; i < 3; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int i = min; i < max; i++) {
            v += i;
        }
        System.out.println("-------------------------------");
        System.out.println("Najvecjo stevilo je: " + max);
        System.out.println("-------------------------------");
        System.out.println("Najmanjse stevilo je: " + min);
        System.out.println("-------------------------------");
        System.out.println("Vsota stevil na intervalu med najmanjšim in največjim številom je: " + v);
        System.out.println("-------------------------------");
        input.close();
    }
}

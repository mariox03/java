import java.util.Scanner;

//Napiši program, ki prebere dve števili. Ti dve števili vzame za meji intervala. Števila na intervalu sešteje in izpiše rezultat. Nalogo reši enkrat s for in drugič z while zanko.

public class Naloga20_1_4 {
    public static void main(String[] args) {
        int a, b, c = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Prvo st.: ");
        a = input.nextInt();

        System.out.print("Drugo st.: ");
        b = input.nextInt();

        for (int i = a; i < b; i++) {
            c = c + i;
        }
        System.out.println("Rezultat je: " + c);

        System.out.println("-------------------------------");

        int j, k, v = 0;

        System.out.print("Prvo st.: ");
        j = input.nextInt();

        System.out.print("Drugo st.: ");
        k = input.nextInt();

        while (j < k) {
            j++;
            v = v + j;
        }

        System.out.println("Rezultat je: " + v);

        input.close();
    }
}

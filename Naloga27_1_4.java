import java.util.Scanner;

/*Napiši program, ki prebere dve števili. Ti dve števili vzame za meji intervala. Vsako drugo število na intervalu sešteje in izpiše rezultat. Nalogo reši enkrat s for in drugič z while zanko.*/

public class Naloga27_1_4 {
    public static void main(String[] args) {
        int x, y, v;
        v = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi x: ");
        x = input.nextInt();
        System.out.print("Vnesi y: ");
        y = input.nextInt();

        input.close();

        System.out.println("---------------------");

        x++;
        for (int i = x; i < y; i += 2) {
            v += i;
        }
        System.out.println("///for zanka///");
        System.out.println("Rezultat je: " + v);

        System.out.println("---------------------");

        int k = 0;

        while (x < y) {
            k += x;
            x += 2;
        }
        System.out.println("///while zanka///");
        System.out.println("Rezultat je: " + k);
    }
}

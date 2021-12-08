import java.util.Scanner;

/*Napiši program, ki izpiše števila in vsoto števil na intervalu med X+5 in Z-3. */

public class Naloga31_3_c_1 {
    public static void main(String[] args) {
        int x, z, v;
        v = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi X: ");
        x = input.nextInt();
        System.out.print("Vnesi Z: ");
        z = input.nextInt();

        x++;
        for (int i = x + 5; i < z - 3; i++) {
            System.out.println(i);
            v += i;
        }
        System.out.println("------------------------------");
        System.out.println("Vsota stevil je: " + v);
        System.out.println("------------------------------");
        input.close();
    }
}

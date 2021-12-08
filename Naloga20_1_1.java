import java.util.Scanner;

//Napiši program, ki prebere dve števili in izpiše njun produkt.

public class Naloga20_1_1 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Prvo st.: ");
        a = input.nextInt();

        System.out.print("Drugo st.: ");
        b = input.nextInt();

        input.close();
        c = a + b;
        System.out.print("Vsota je: " + c);

    }
}

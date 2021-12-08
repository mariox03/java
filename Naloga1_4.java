import java.util.Scanner;

/*Napiši program, ki prebere pet števil. Števila sešteje in izpiše vsoto. Nalogo reši s pomočjo for zanke.*/

public class Naloga1_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int s = 0, a;
        System.out.println("Vnesi 5 stevil: ");
        for (int i = 1; i <= 5; i++) {
            a = input.nextInt();
            s = s + a;
        }
        input.close();
        System.out.println("Vsota je: " + s);
    }
}

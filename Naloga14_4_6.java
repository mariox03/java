import java.util.Scanner;

/*Napiši program, ki izpiše števila in vsoto števil deljivih s 5 na intervalu med X in 34. */

public class Naloga14_4_6 {
    public static void main(String[] args) {
        int x, v;
        v = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi X: ");
        x = input.nextInt();
        x++;
        for (int i = x; i < 34; i++) {
            System.out.println(i);
            if (i % 5 == 0) {
                v += i;
            }
        }

        System.out.println("------------------------------");
        System.out.println("Vsota stevil je: " + v);
        System.out.println("------------------------------");

        input.close();
    }
}

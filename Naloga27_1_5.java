import java.util.Scanner;

/*Napiši program, ki izpiše srednjo vrednost X prebranih števil.*/

public class Naloga27_1_5 {
    public static void main(String[] args) {
        float a, b, c, t, d;
        int x;
        b = 0;
        c = 0;
        t = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi X st.: ");
        x = input.nextInt();

        System.out.println("Vnesi " + x + " st.: ");
        while (t < x) {
            a = input.nextInt();
            b = b + a;
            c = c + 1;
            t++;
        }
        d = b / c;

        input.close();
        System.out.println("------------------------------");
        System.out.print("Srednja vrednost je: " + d);
    }
}

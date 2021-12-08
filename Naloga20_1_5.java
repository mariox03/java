import java.util.Scanner;

//Napiši program, ki izpiše srednjo vrednost petih prebranih števil.

public class Naloga20_1_5 {
    public static void main(String[] args) {
        float a, b, c, t, d;
        b = 0;
        c = 0;
        t = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 5 st.:");

        while (t <= 5) {
            a = input.nextInt();
            b = b + a;
            c = c + 1;
            t++;
        }
        d = b / c;

        input.close();
        System.out.print("Srednja vrednost je: " + d);
    }
}
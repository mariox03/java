import java.util.Scanner;

/*Napiši program, ki izpiše vsako X število na intervalu med X in Y.*/

public class Naloga3_2_s_3 {
    public static void main(String[] args) {
        int x, y;

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi X in Y");
        System.out.print("X: ");
        x = input.nextInt();
        System.out.print("Y: ");
        y = input.nextInt();
        for (int i = x; x < y; x += i) {
            System.out.println(x);
        }
        input.close();
    }
}

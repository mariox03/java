import java.util.Scanner;

/*Napiši program, ki izpiše števila na intervalu med X in 23.*/

public class Naloga27_1_2 {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi x: ");

        x = input.nextInt();
        input.close();

        System.out.println("------------------------");

        x++;
        for (int i = x; i < 23; i++) {
            System.out.println(x);
            x++;
        }
    }
}
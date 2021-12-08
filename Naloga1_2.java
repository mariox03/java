import java.util.Scanner;

/*Napiši program, ki prebere dve števili, ju sešteje in izpiše vsoto.*/

public class Naloga1_2 {
    public static void main(String[] args) {
        int a, b, vsota;

        Scanner input = new Scanner(System.in);
        System.out.println("Prvo st.:");
        a = input.nextInt();

        System.out.println("Drugo st.:");
        b = input.nextInt();

        input.close();
        vsota = a + b;
        System.out.print("Vsota je: " + vsota + "\n");
    }
}

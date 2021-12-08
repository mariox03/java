import java.util.Scanner;

/*Napiši program, ki prebere dve števili. Večje odšteje od manjšega in izpiše rezultat. Pri tem uporabi if stavek.*/

public class Naloga1_3 {
    public static void main(String[] args) {
        int a, b, vsota1, vsota2;

        Scanner input = new Scanner(System.in);

        System.out.println("Prvo st.:");
        a = input.nextInt();

        System.out.println("Drugo st.:");
        b = input.nextInt();

        input.close();

        if (a > b) {
            vsota1 = b - a;
            System.out.println(vsota1);
        }
        if (b > a) {
            vsota2 = a - b;
            System.out.println("Vsota je: " + vsota2);
        }
    }
}

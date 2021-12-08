import java.util.Scanner;

/*Napiši program, ki prebere tri števila in preveri, ali je posamezno število deljivo s 3. Na koncu izpiše tekst: Števila deljiva s tri so: (in izpiše ta števila).*/

public class Naloga3_2_2 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Vnesi 3 st.:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println("----------------------------");
        System.out.println("Števila deljiva s tri so: ");
        System.out.println("----------------------------");

        if (a % 3 == 0) {
            System.out.println(a);
        }
        if (b % 3 == 0) {
            System.out.println(b);
        }
        if (c % 3 == 0) {
            System.out.println(c);
        }
        System.out.println("----------------------------");
        input.close();
    }
}

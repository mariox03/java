import java.util.Scanner;

/*Napiši program, ki prebere tri števila in izpiše števila od največjega do najmanjšega.*/

public class Naloga27_1_1 {
    public static void main(String[] args) {
        int st1, st2, st3;

        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi prvo st.: ");
        st1 = input.nextInt();

        System.out.print("Vnesi drugo st.: ");
        st2 = input.nextInt();

        System.out.print("Vnesi tretje st.: ");
        st3 = input.nextInt();

        input.close();

        System.out.println("---------------------------------");

        if (st1 > st2 && st1 > st3 && st2 > st3) {
            System.out.println("Najvecje stevilo je: " + st1 + "\n" + "Srednje stevilo je: " + st2 + "\n"
                    + "Najmanjste stevilo je: " + st3);
        }

        if (st1 > st2 && st1 > st3 && st3 > st2) {
            System.out.println("Najvecje stevilo je: " + st1 + "\n" + "Srednje stevilo je: " + st3 + "\n"
                    + "Najmanjste stevilo je: " + st2);
        }

        if (st2 > st1 && st2 > st3 && st1 > st3) {
            System.out.println("Najvecje stevilo je: " + st2 + "\n" + "Srednje stevilo je: " + st1 + "\n"
                    + "Najmanjste stevilo je: " + st3);
        }

        if (st2 > st1 && st2 > st3 && st3 > st1) {
            System.out.println("Najvecje stevilo je: " + st2 + "\n" + "Srednje stevilo je: " + st3 + "\n"
                    + "Najmanjste stevilo je: " + st1);
        }

        if (st3 > st1 && st3 > st2 && st1 > st2) {
            System.out.println("Najvecje stevilo je: " + st3 + "\n" + "Srednje stevilo je: " + st1 + "\n"
                    + "Najmanjste stevilo je: " + st2);
        }

        if (st3 > st1 && st3 > st2 && st2 > st1) {
            System.out.println("Najvecje stevilo je: " + st3 + "\n" + "Srednje stevilo je: " + st2 + "\n"
                    + "Najmanjste stevilo je: " + st1);
        }
    }
}
